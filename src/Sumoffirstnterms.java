import java.util.Scanner;

public class Sumoffirstnterms {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number upto which sum is required: ");
        int n = in.nextInt();
        System.out.println("Enter the number from which sum is required: ");
        int a = in.nextInt();
        System.out.println("Enter the common difference of the numbers in the series: ");
        int d = in.nextInt();
        int sum =  (n*(2*a+(n-1)*d))/2;
        System.out.println("Sum of first "+n+" terms is: "+sum);
    }
}
