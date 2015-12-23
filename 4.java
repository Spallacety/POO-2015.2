import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            int n1 = 0;
            if (i > 1) {
                n1 = (i-1)*4;
            }
            int i1 = 1;
            int i2 = 2;
            int i3 = 3;
            System.out.format("%d %d %d IFPI\n", (i1 + n1), (i2 + n1), (i3 + n1));
        }
    }
}