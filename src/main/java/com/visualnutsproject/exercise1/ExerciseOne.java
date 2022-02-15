package com.visualnutsproject.exercise1;


import static java.lang.System.out;

public class ExerciseOne {

    public static void main(String[] args) {
        for (int i = 1 ; i <= 100; i++ ) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                out.println("Visual Nuts");
            } else if (i % 3 == 0) {
                out.println("Visual");
            } else if (i % 5 == 0) {
                out.println("Nuts");
            } else {
                out.println(i);
            }
        }
    }

}
