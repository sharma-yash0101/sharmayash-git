import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day number: ");
        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday!");
            case 2 -> System.out.println("Tuesday!");
            case 3 -> System.out.println("Wednesday!");
            case 4 -> System.out.println("Thursday!");
            case 5 -> System.out.println("Friday!");
            case 6 -> System.out.println("Saturday!");
            case 7 -> System.out.println("Sunday!");
            default-> System.out.println("Enter a valide day number which lies etwwn 1 to 7 including 1 and 7 too!");
        }
        switch (day){
            case 1,2,3,4,5-> System.out.println("Weekday!");
            case 6,7 -> System.out.println("Weekend!");
        }
    }
}
