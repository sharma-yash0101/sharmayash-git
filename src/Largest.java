import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers and get the Largest one out: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
      //  int max = a;
      //  if (b > max) {
      //      max = b;
      //  }
        //  if (c > max) {
       //     max = c;
        //     }
        int max = Math.max(a,Math.max(b,c));
        System.out.println(max);
    }
}
