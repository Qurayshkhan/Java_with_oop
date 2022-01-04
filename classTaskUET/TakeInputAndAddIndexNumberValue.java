package com.company.classTaskUET;
import java.util.Arrays;
import java.util.Scanner;
class Temp {
    Temp(){            //storing values in array from users
        int[] array1, array2;
        array1 = new int[]{10, 0, 30, 40, 50};
        System.out.println(Arrays.toString(array1));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value to update");
        int value = input.nextInt();
        System.out.println("on which index number");
        int index = input.nextInt();
        array1[index] = value;
        System.out.println("updated array is below: ");
        System.out.println(Arrays.toString(array1));

    }
    public static void main(String[] args){
        Temp obj = new Temp();
//            usman obj1 = new usman();
//            obj1.check();
    }
}
