package com.company;

public class CWH_28_PS6_arrays {
    public static void main(String[] args) {
//        Question 1
//        float []marks={10.2f,20.3f,30.2f,40.30f,};
//        float sum=0;
//        for (float element:marks){
//            sum=sum+element;
//            System.out.println(sum);
//        }
//question 2
//        float []marks={10.2f,20.3f,30.2f,40.30f,};
//        float num=10.2f;
//        boolean isInArray=false;
//        for (float elements:marks){
//            if (num==elements){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The Element in an array");
//        }else {
//            System.out.println("The Element is not in an array");
//        }
        //question 3
//        float []marks={10.2f,20.3f,30.2f,40.30f,};
//        float sum=0;
//        for (float element:marks){
//            sum=sum+element;
//        } System.out.println("The Value of Avrage marks "+sum/marks.length);
        //question 4
//        int [][]mat1={{1,2,4}
//                ,{3,4,5}};
//        int [][]mat2={{2,6,13}
//                ,{3,7,1}};
//        int [][]result={{0,0,0}
//                ,{0,0,0}};
//        for (int i=0;i<mat1.length;i++){ //Rows of time
//            for (int j=0;j<mat1[i].length;j++){ //coloum of time
//                System.out.printf("Setting Value is i=%d and j=%d\n",i,j);
//                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//            System.out.println(" ");
//        }
//        for (int i=0;i<mat1.length;i++){ //Rows of time
//            for (int j=0;j<mat1[i].length;j++){ //coloum of time
//                System.out.printf(result[i][j]+" ");
//                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//            System.out.println(" ");
//        }
        //Question 5;
//        int []arr={1,2,3,4,5,6};
//        int l=arr.length;
//        int a=Math.floorDiv(arr.length, 2);
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for (int i = 0; i < n; i++) {
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int elements: arr){
//            System.out.println(elements + " ");
//        }
        //question 6
//        int []arr={1,2,3,4,5,6};
//        int max=0;
//        for (int elements:arr){
//            if (elements>max){
//                max=elements;
//            }
//
//        }
//        System.out.println("The value of maxmimum element in arrays is "+ max);
        //Question 8
//        boolean issorted=true;
//        int []arr={1,2100,5,455,6,34,67};
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>arr[i+1]){
//                 issorted=false;
//                break;
//            }
//        }
//        if (issorted){
//            System.out.println("Array is Sorted");
//        }else {
//            System.out.println("Not Sorted");
//        }
        boolean issorted=true;
        int []arr={1,2100,5,455,6,34,67};
        for (int i=0;i< arr.length;i++){
            if (arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if (issorted){
            System.out.println("Array is Sorted");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
