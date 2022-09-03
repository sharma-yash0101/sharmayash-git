public class Pattern8 {
    public static void main(String[] args) {
        int row;
        int n = 5;
        for (row = 1; row <= 10; row++) {
            int totalColsInRow = row > 5 ? 10 - row : row;
            for (int c = 1; c < totalColsInRow + 1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (row = 1; row <= 10; row++) {
            int totalColsInRow = row > 5 ? 10 - row : row;
            int noOfSpaces = 5 - totalColsInRow;
            for (int s = 1; s < noOfSpaces+1; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col < totalColsInRow+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}