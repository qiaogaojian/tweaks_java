package com.etatech.tweaks.asm;

// 需要先 build -> recompile 'Test.java'
// 再右键 show bytecode outline
public class Test
{
    private       String name;
    private       int    num1 = 1;
    public static int    NUM1 = 100;

    public int func(int a, int b) {
        return add(a, b);
    }

    public int add(int a, int b) {
        return a + b + num1;
    }

    public int sub(int a, int b) {
        return a - b - NUM1;
    }
}