package com.company;
class invalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "Cannot add 8 and 9";
    }
}class cannotDevideByZero extends Exception{
    @Override
    public String toString() {
        return "Cannot Devide by Zero";
    }

    @Override
    public String getMessage() {
        return "Cannot Devide by Zero";
    }
}
class  maxinputException extends Exception{
    @Override
    public String toString() {
        return "do not Multiply over 100000";
    }

    @Override
    public String getMessage() {
        return "Cannot Devide by Zero";
    }
}
class  notsmallerby0 extends Exception{
    @Override
    public String toString() {
        return "could not sub smaller number is 0";
    }

    @Override
    public String getMessage() {
        return "Cannot Devide by Zero";
    }
}


class customCal {

    double add(double a,double b)throws invalidInputException{
       if (a==8 || b==9){
           throw new invalidInputException();
       }
        return a+b;
    } double sub(double a,double b) throws notsmallerby0{
        if (a<0 || b<0){
            throw new notsmallerby0();
        }
        return a-b;
    } double div(double a,double b)throws cannotDevideByZero{
        if (b==0){
            throw new  cannotDevideByZero();
        }
        return a/b;
    } double mul(double a,double b)throws maxinputException {
        if (a==10000 || b==10000){
            throw new maxinputException();
        }
        return a*b;
    }

}
public class CWH_103_EX6_customCalculator{
    public static void main(String[] args) throws cannotDevideByZero,invalidInputException,maxinputException,notsmallerby0 {
        customCal cal=new customCal();
//        cal.add(8,9);
//cal.div(10,0);
        cal.mul(10000,10000);
    }
}
