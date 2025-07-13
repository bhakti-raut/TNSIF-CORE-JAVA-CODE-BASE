package com.tnsif.day10.Array;

class MLArray
{
    static void  printArray(int c[][]){
        System.out.println("Array of elements are as follows :");
        for(int i=0; i< c.length; i++){
            for(int j=0; i<c[i].length; i++){
                System.out.println(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
public class MultidimensionArray {
    public static void main(String[] args) {
        int c[][] = { {12, 34}, {10, 20}, {1, 2}, {78, 87} };

        System.out.println("No. of row in C array : " + c.length);

        MLArray.printArray(c);

    }
}
