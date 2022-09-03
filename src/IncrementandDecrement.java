import java.util.Scanner;

public class IncrementandDecrement {
    public static void main(String[] args) {
        int a;
        System.out.println("Type a number: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Entered Number: "+a);
        System.out.println("Prepost Increment: ");
        System.out.println(a++);//10 (11)
        System.out.println(++a);

        System.out.println("Prepost Decrement: ");
        System.out.println(a--);
        System.out.println(--a);

        System.out.println("Thanks for your time, have a good day!");
    }
}
