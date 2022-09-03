import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Enter temperature in degree Centigrate: ");
        Scanner in = new Scanner(System.in);
        float tempC= in.nextFloat();
        float tempK= (tempC * 9/5)+32;
        System.out.println(tempK);

    }
}
