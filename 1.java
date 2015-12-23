import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        int km = input.nextInt();
        float l = input.nextFloat();

        float res = (float) km / l;

        System.out.format("%.3f km/l" , res);
    	
	}
}