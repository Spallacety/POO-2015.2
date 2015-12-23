import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
        int n = input.nextInt();

        int contr = 0;
        int contc = 0;
        int conts = 0;
        int total = 0;

        for(int i = 0; i <= n ; i++){
            String c = input.nextLine();
            String cob[] = c.split(" ");
            if (cob[1] == "C"){
                total = total + Integer.parseInt(cob[0]);
                contc = contc + Integer.parseInt(cob[0]);
            }
            if (cob[1] == "R"){
                total = total + Integer.parseInt(cob[0]);
                contr = contr + Integer.parseInt(cob[0]);
            }
            if (cob[1] == "S"){
                total = total + Integer.parseInt(cob[0]);
                conts = conts + Integer.parseInt(cob[0]);
            }
        }
        System.out.format("Total: %d cobaias", total);
        System.out.format("Total de coelhos: %d", contc);
        System.out.format("Total de ratos: %d", contr);
        System.out.format("Total de sapos: %d", conts);
        System.out.format("Percentual de coelhos: %.2f%%", (contc/total));
        System.out.format("Percentual de ratos: %.2f%%", (contr/total));
        System.out.format("Percentual de sapos: %.2f%%", (conts/total));
    }
}