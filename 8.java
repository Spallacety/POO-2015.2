import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        int n = input.nextInt();
        int cont = 0;
        int i = 0;

        while (n > -1){
            cont = cont + n;
            i++;
            n = input.nextInt();
        }

        float total = (float) cont / i;
        System.out.format("%.2f", total);
    }
}