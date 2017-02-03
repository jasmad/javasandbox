package com.sanbox;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            int inArr[] = new int[]{5, 90, 35, 45, 150, 3, 11, 88, 99, 77, 66, 44, 23, 16, 17, 95, 24};
            int lenght = inArr.length;

            println("Array before sort");
            println(Arrays.toString(inArr));

            quickSort(0, lenght - 1, inArr);

            println("Array after sort");
            println(Arrays.toString(inArr));

            println("fibonacci: ");
            int target = 10;
            for (int i = 0; i <= target; i++) {
                println(fibonacci(i));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static int fibonacci(int n)
    {
        if(n>1)
        {
            int result = fibonacci(n-1) + fibonacci(n-2);
            return result;
        }
        else if(1==n)
        {
            return 1;
        }
        else if(0==n)
        {
            return 0;
        }
        else
        {
            println("Debe ingresar un valor mayor o igual a 1");
            return -1;
        }
    }

    private static void quickSort(int lowerIndex, int higherIndex, int[] arr)
    {
        int pivot = arr[lowerIndex];
        int i = lowerIndex;
        int j = higherIndex;
        int tmp;
        while (i<j)
        {
            while (arr[i] <= pivot)
            {
                i++;
            }
            while (arr[j] > pivot)
            {
                j--;
            }
            if(i<j)
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        arr[lowerIndex] = arr[j];
        arr[j] = pivot;
        if(lowerIndex < (j-1))
        {
            quickSort(lowerIndex, j-1, arr);
        }
        if((j+1) < higherIndex)
        {
            quickSort(j+1, higherIndex, arr);
        }
    }

    private static void bubbleSort(int[] arr)
    {
        int len = arr.length;
        int tmp = 0;
        for (int i = 0; i < len; i++) {
            for(int j = 1; j < (len-i); j++)
            {
                if(arr[j-1] > arr[j])
                {
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    private static void println(Object o)
    {
        System.out.println(o);
    }
    private static void print(Object o)
    {
        System.out.print(o);
    }
}
