import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

    	int n = 0;
    	int alc = 0;
    	int gas = 0;
    	int die = 0;

    	while(n != 4){
    		n = input.nextInt();
    		if(n == 1){
    			alc++;
    		}
    		if(n == 2){
    			gas++;
    		}
    		if(n == 3){
    			die++;
    		}
    	}

    	System.out.println("MUITO OBRIGADO");
    	System.out.println("Alcool: "+alc);
    	System.out.println("Gasolina: "+gas);
    	System.out.println("Diesel: "+die);
    }
}