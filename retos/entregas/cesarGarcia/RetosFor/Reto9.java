public class Reto9 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        for (int j=1; j <= dimension ; j = j + 1) {
            for (int i=1; i <= dimension ; i = i + 1) {
                
                if ((j==i) || i==(22-j)) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
