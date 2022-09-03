import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to get required factorial: ");
        int n = in.nextInt();
        int f = 1;
        for (int i =n;i>=1 ;i-- ) {
            f = f * i;
        }
        System.out.println("factorial of number "+n+" is: "+f);

    }
}
