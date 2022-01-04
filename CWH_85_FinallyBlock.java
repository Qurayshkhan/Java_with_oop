package com.company;

public class CWH_85_FinallyBlock {
  public  static int greet(){
      try {
          int a = 5;
          int b = 0;
          int c = a / b;
      } catch (Exception e) {
          System.out.println(e);
      } finally {
          System.out.println("This is the End of this program");
      }
      return -1;

  }

        public static void main(String[] args){
    int k=greet();
            System.out.println(k);
        }
    }



