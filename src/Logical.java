import java.sql.SQLOutput;
import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Float a,b,c,d;
        System.out.println("ENTER 4 NUMBERS: ");
        Scanner obj= new Scanner(System.in);
        a= obj.nextFloat();
        b= obj.nextFloat();
        c= obj.nextFloat();
        d= obj.nextFloat();
        System.out.println("Logical AND: ");
        System.out.println("(a>b) and (c>d): "+ ((a>b)&&(c>d)));
        System.out.println("(a>b) and (c<d): "+ ((a>b)&&(c<d)));
        System.out.println("(a<b) and (c<d): "+((a<b)&&(c<d)));

        System.out.println("Logical OR: ");
        System.out.println("(a>b) OR (c>d): "+((a>b)||(c>d)));
        System.out.println("(a>b) OR (c<d): "+((a>b)||(c<d)));
        System.out.println("(a<b) OR (c<d): "+((a<b)||(c<d)));

        System.out.println("Logical NOT");
        System.out.println("NEITHER (a>b) NOR (c>d): "+!((a>b)&&(c>d)));
        System.out.println("NEITHER (a<b) NOR (c<d): "+!((a<b)&&(c<d)));

        System.out.println("Thnaks for your time, have a good day!");

    }
}
