import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        String val = input.nextLine();
        String vetor[] = val.split(" ");

        int a = Integer.parseInt(vetor[0]);
        int b = Integer.parseInt(vetor[1]);
        int c = Integer.parseInt(vetor[2]);
        int d = Integer.parseInt(vetor[3]);
        
        if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a%2==0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}