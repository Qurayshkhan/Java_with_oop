public class swap2 {
    public static void main(String[] args) {
        System.out.println("before swaping");
        int x=10;
        int y=20;
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("After swaping");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("the value of x is "+ x);
        System.out.println("the value of y is"+ y);
    }
    }


