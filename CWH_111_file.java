package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_file {
    public static void main(String[] args) {
//        File myFile=new File("CWH111file.txt");
//       try{
//           myFile.createNewFile();
//       }catch (IOException e){
//           System.out.println("Unable to Create This File");
//       e.printStackTrace();
//       }
//    }
//    FileWriter fileWriter;
//
//    {
//        try {
//            fileWriter = new FileWriter("CWH111file.txt");
//            fileWriter.write("This is My java practice");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
        /*File myFile=new File("CWH111.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Enable To Create a new file");
            e.printStackTrace();
        }*/

//Writting a File
        /*try {
            FileWriter myFile=new FileWriter("CWH111.txt");
            myFile.write("this is our First java course");
            myFile.close();
        } catch (IOException e) {
            System.out.println();
            e.printStackTrace();
        }*/
        //Reading a File
    /*File Myfile=new File("CWH111.txt");
    try{
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()){
            String line =sc.nextLine();
            System.out.println(line);
        }
    }catch (FileNotFoundException ignored){
        ignored.printStackTrace();
    }*/

        File myFile=new File("CWH111.txt");
        if (myFile.delete()){
            System.out.println("I have Deleted:"+myFile.getName());
        }else {
            System.out.println("Some problem occured while deleting the File");
        }
    }


}
