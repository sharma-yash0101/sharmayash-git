public class Pattern5 {
    public static void main(String[] args) {
        int row;
        for (row = 1; row <=10 ; row++) {
            int totalcolinrow= row>5 ? 10-row : row;
            for (int c=1; c<totalcolinrow+1;c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
