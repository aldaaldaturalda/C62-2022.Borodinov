public class TreeMassive {
    public static void main(String[] args) {
        int[][] arrays = new int[4][4];
        for (int i = 0; i <= arrays.length; i++) {
            for (int j = 0; j < arrays.length - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();//очень тяжела в понимании дальше не делал
        }
    }
}

