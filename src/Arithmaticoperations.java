import java.util.Scanner;

public class Arithmaticoperations {
    public static void main(String[] args) {

        float a,b;
        System.out.println("Enter 2 numbers with a space between them: ");
        Scanner obj= new Scanner(System.in);
        a=obj.nextFloat();
        b=obj.nextFloat();
        System.out.println("ADDITION: "+(a+b));
        System.out.println("SUBTRACTION: "+(a-b));
        System.out.println("MULTIPLICATION: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("REMAINDER: "+(a%b));

    }
}
