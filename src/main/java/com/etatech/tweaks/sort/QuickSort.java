package com.etatech.tweaks.sort;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 9, 1};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static int[] quickSort(int[] target, int left, int right) {
        if (right > left) {  // 递归终止条件
            int baseIndex = partition(target, left, right); // 原序列划分后基准元素的位置
            quickSort(target, left, baseIndex - 1);   // 对第一个子序列快速排序，不包含基准元素！
            quickSort(target, baseIndex + 1, right);   // 对第二个子序列快速排序，不包含基准元素！
            return (target);
        }
        return (target);
    }

    public static int partition(int[] target, int left, int right) {
        int pivotV    = target[left];                   // 基准元素的值
        int baseIndex = left;                           // 基准元素最终应该在的位置 
        for (int i = left + 1; i <= right; i++) {       // 从基准元素的下一个元素开始
            if (target[i] < pivotV) {                       // 若其小于基准元素
                baseIndex++;                                    // 若其小于基准元素,则基准元素最终位置后移；否则不用移动
                int temp = target[baseIndex];
                target[baseIndex] = target[i];
                target[i] = temp;
            }
        }

        target[left] = target[baseIndex];               // 将基准元素就位 
        target[baseIndex] = pivotV;
        return baseIndex;                               // 返回划分后基准元素的位置
    }
}