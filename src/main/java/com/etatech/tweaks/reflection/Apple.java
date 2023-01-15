package com.etatech.tweaks.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Apple
{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 注:IDEA 编译遇到中文错误时打开 Help => Edit Custom VM Options 添加 -Dfile.encoding=UTF-8
    public static void main(String[] args) throws Exception {
        //正常的调用
        Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println("Apple Price:" + apple.getPrice());

        //使用反射调用
        Class clz = Class.forName("com.etatech.tweaks.reflection.Apple");

        Method      setPriceMethod   = clz.getMethod("setPrice", int.class);
        Constructor appleConstructor = clz.getConstructor();

        Object appleObj = appleConstructor.newInstance();
        setPriceMethod.invoke(appleObj, 123);

        Method getPriceMethod = clz.getMethod("getPrice");
        System.out.println("Apple Price:" + getPriceMethod.invoke(appleObj));
    }
}