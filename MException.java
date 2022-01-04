package com.company;

public class MException extends Exception {
    @Override
    public String toString() {
        return this.toString() + "i am toString()";

    }

    public String getmessage() {
        return super.getMessage();
    }
}
