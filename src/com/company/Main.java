package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myarray = new int[10];

        myarray[0] = 1;
        myarray[1] = 2;
        myarray[2] = 3;
        myarray[3] = 4;
        myarray[4] = 5;
        myarray[5] = 6;
        myarray[6] = 7;
        myarray[7] = 8;
        myarray[8] = 9;
        myarray[9] = 10;

        for (int i = myarray.length - 1; i >=0; --i){
            System.out.println(myarray[i]);
        }

        String[] letters = new String[5];

        letters[0] = "w";
        letters[1] = "t";
        letters[2] = "y";
        letters[3] = "h";
        letters[4] = "k";



        for (int i = 0; i < 5; i++) {
            if (letters[1] == "t");{
                letters[1] = "hello";
            }
            System.out.println(letters[i]);
        }

        int[] array1 = new int[5];

        array1[0] = 1;
        array1[1] = 7;
        array1[2] = 6;
        array1[3] = 5;
        array1[4] = 9;

        int[] array2 = new int[5];

        array2[0] = 2;
        array2[1] = 7;
        array2[2] = 6;
        array2[3] = 3;
        array2[4] = 4;

        int count = 0;
        for(int i=0; i<array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i]);
                    System.out.print(array2[j]);
                }

            }
        }
    }
}
