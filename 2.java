import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	String nome = input.nextLine();
        double fixo = input.nextDouble();
        double var = input.nextDouble();

        double res = (double)fixo + (var*0.15);

        System.out.format("TOTAL = RS %.2f" , res);
    	
		}
	}