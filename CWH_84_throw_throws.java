 package com.company;
class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius Cannot be negative";
    }

    @Override
    public String getMessage() {
        return "radius cannot be negative";
    }
}
public class CWH_84_throw_throws {
    public static double area(int r)throws negativeRadiusException {
        if (r<0){
            throw new negativeRadiusException();
        }
        double result =Math.PI*r*r;
        return result;

    }
   public static int divide(int a ,int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
try {
    //int c=divide(6,0);
    double ar=area(6);
    System.out.println(ar);
}catch (Exception e){
    System.out.println("Exception");
}

    }
}
