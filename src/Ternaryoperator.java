import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        float a,b,c,Max;
        System.out.println("Enter 3 Numbers: ");
        Scanner obj=new Scanner(System.in);
        a= obj.nextFloat();
        b= obj.nextFloat();
        c= obj.nextFloat();
        Max=(a>b) ? (a>c ? a : c) : (b>c ? b :c);
        System.out.println(Max);

    }
}
