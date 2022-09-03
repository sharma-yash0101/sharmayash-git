public class Pattern6 {
    public static void main(String[] args)

    {
        int n=5;
        for (int r = 1; r <2*n ; r++) {
            int totalColsInRow  = r>n ? 2*n-r:r ;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for(int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

