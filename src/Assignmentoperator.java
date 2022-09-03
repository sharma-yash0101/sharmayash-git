import java.util.Scanner;

public class Assignmentoperator {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number: ");
        Scanner obj= new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Entered Number: ");
        System.out.println("a: "+a);//Simple Assignment Operator.
        System.out.println("a=+10: "+(a+=10));//Compound Assignment Operator.
        System.out.println("a-=10: "+(a-=10));//Compound Assignment Operator.
        System.out.println("Thank You!");
    }
}
