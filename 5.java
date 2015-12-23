import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        int n = input.nextInt();
        int k = 1;

        while (k < 3){
            if(n == 2002){
                System.out.println("Acesso permitido");
                break;
            }else{
                System.out.println("Senha invalida");
                n = input.nextInt();
            }
            k++;
        }
        if (k == 3){
            System.out.println("Acesso negado");
        }
    }
}