package com.tnsif.day8.Array;

public class Student {

    // data members
    private int rollno;
    private String name;

    // para constructot
    public  Student(int rollno, String name){
        super();
        this.name = name;
        this.rollno = rollno;
    }

    // getter methods
    public int getRollNo() {
        return rollno;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {

        // Student s = new Student(, null)
        Student  [] arr;

        // declared memory for 5 object on type student
        arr = new Student[5];

        arr[0] = new Student(101, "Heti");
        arr[1] = new Student(102, "Hari");
        arr[2] = new Student(103, "bhakti");
        arr[3] = new Student(104, "shruti");
        arr[4] = new Student(105, "Radha");


        for(int i=0; i<arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("Elements at " + i + ": " + arr[i].getRollNo() + "\t" + arr[i].getName());
            }
        }
    }
}
