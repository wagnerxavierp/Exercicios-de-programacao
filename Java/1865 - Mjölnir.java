import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int casos;
        String valor;
        
        Scanner entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();
        entrada.nextLine();
        
       for(int i = 0; i < casos; i++){
            
            valor = entrada.nextLine();
            
            if(valor.toLowerCase().contains("Thor".toLowerCase())){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
            
        }
 
    }
 
}
