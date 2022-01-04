package com.company;
class library{
        String[] books;
        int no_of_books;
    library(){

            this.books=new String[100];
            this.no_of_books=0;

    }
                void addBooks(String book){
                this.books[no_of_books]=book;
                no_of_books++;
                    System.out.println(book+"Has been Added");
    }
    void showBooks(){
        System.out.println("Available Books are");
        for (String book:this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issueBook(String book){
        for (String b:this.books){
            for (int i=0;i<this.books.length;i++){

                if (this.books[i].equals(book)){
                    System.out.println(" The Book have been issued "+book);
             this.books[i]=null;
             return;
                }
                System.out.println("*"+book);
            }

        }
    }
    void returnBook(String book){
addBooks(book);
    }

}
public class CWH_61_Ex4Ps {
    public static void main(String[] args) {
library centralLibrary=new library();
centralLibrary.addBooks("C++");
        centralLibrary.addBooks("Java");
        centralLibrary.addBooks("PHP");

        centralLibrary.issueBook("C++");
        centralLibrary.showBooks();
        centralLibrary.returnBook("C++");


    }
}
