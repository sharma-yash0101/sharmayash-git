import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 12;
        int a= 0;
        int b= 1;
        int count= 2;
        while (count<= n) {
            int tem= b;
            b= b + a;
            a=tem;
            count++;
        }
        System.out.println(b);
    }

}
