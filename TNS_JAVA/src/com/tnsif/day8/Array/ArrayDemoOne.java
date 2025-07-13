package com.tnsif.day8.Array;

class ArrayOperations {

    // print int array
    static void printArray (int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
    }

    // variable argument function
    public static int getSum(int... n)
    {
        int sum = 0;
        for(int no : n) {
            sum += no;
        }
        return sum;
    }

    // count no. of odd elements
    public static int getOddCount(int[] b){
        int count = 0;
        for(int i=0; i<b.length; i++) {
            if (b[i] % 2 != 0)
                count++;
        }
        return count;
    }

    // count no. of even elements
    public static int getEvenCount(int[] b){
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0)
                count++;
        }
        return count;
    }
}

public class ArrayDemoOne {
    public static void main(String[] args) {
        int n=10;
        int a[];  // declaration
        a = new int[n]; // instantiation


        // assigning values in array a
        for(int i=0; i<a.length; i++) {
            a[i] = 5 * i;
        }
        // displaying the array
        ArrayOperations.printArray(a);

        int b[] = {10, 20, 30, 40, 50};   // initialization

        ArrayOperations.printArray(b);

        // calling of variable argument function

        System.out.println("sum of array elements is: " + ArrayOperations.getSum(b));
        System.out.println("sum of array elements is: " + ArrayOperations.getSum(10,20,30));

        b[2] = 999;  // assigning single elements
        ArrayOperations.printArray(b);

        // displaying total odd and even no
        System.out.println("Odd count: " + ArrayOperations.getOddCount(b) + "\tEven count: " + ArrayOperations.getEvenCount(b));

    }
}
