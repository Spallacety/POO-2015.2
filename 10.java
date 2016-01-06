import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int i = input.nextInt();
    	int count = 0;
    	int n = 1;
    	for(i % 2 = 0; n <= 5; n++){
    		count++;
    		i = input.nextInt();
    	}
    	System.out.println(count+"valores pares");
    }
}