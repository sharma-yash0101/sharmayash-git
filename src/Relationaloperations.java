import java.util.Scanner;

public class Relationaloperations {
    public static void main(String[] args) {
        float a,b;
        System.out.println("Enter 2 numbers with a space between them: ");
        Scanner obj= new Scanner(System.in);
        a=obj.nextFloat();
        b=obj.nextFloat();
        System.out.println("TRUE/FALSE Statements according to data inserted :");
        System.out.println("a>b: "+(a>b));
        System.out.println("a<b: "+(a<b));
        System.out.println("a>=b: "+(a>=b));
        System.out.println("a<=b: "+(a<=b));
        System.out.println("a=b: "+(a==b));
        System.out.println("a (not=) b : "+(a!=b));
        System.out.println();
    }
}
