import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int valor;
        ArrayList<Integer> pilha = new ArrayList<>();
        ArrayList<Integer> cartasDescartadas = new ArrayList<>();

        while (true) {
            valor = entrada.nextInt();
            if (valor == 0) {
                break;
            }
            pilha = new ArrayList<>();
            cartasDescartadas = new ArrayList<>();

            for (int i = 1; i <= valor; i++) {
                pilha.add(i);
            }

            while (pilha.size() >= 2) {
                cartasDescartadas.add(pilha.get(0));
                pilha.remove(0);
                
                pilha.add(pilha.get(0));
                pilha.remove(0);

            }
            System.out.print("Discarded cards:");
            for(int i = 0; i < cartasDescartadas.size(); i++){
                System.out.print(" "+cartasDescartadas.get(i));
                if(i < cartasDescartadas.size()-1){
                    System.out.print(",");
                }
            }
            System.out.println();
            
            System.out.println("Remaining card: " + pilha.get(0));

        }

    }

}
