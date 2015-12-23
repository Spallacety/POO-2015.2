import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);

    	double pi = 3.14159;

    	double n = input.nextDouble();

    	double area = pi * n * n;

    	System.out.format("A=%.4f",area);
    	
		}
	}