import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x, y, sum=0;
        System.out.print("Enter the first number: ");
        x=sc.nextInt();
        System.out.print("Enter the second number: ");
        y=sc.nextInt();

        for(int i=1;i<=x;i++)
        {

            sum=sum+y;
        }

        System.out.println("The multiplication of "+x+" and "+y+" is: "+sum);

    }
}