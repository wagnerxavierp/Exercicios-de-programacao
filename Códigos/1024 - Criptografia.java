import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        int N;
        char M[];
        int tamanho;
        
        try (Scanner s = new Scanner(System.in)) {
            N = s.nextInt();
            s.nextLine();
            
            while((N--) > 0)
            {
                M = s.nextLine().toCharArray();//inicializa vetor de caracteres
                tamanho = M.length;
                
                //primeira passada
                for(int i = 0; i < tamanho; i++)
                {
                    if((M[i] >= 'A' && M[i] <= 'Z') || (M[i] >= 'a' && M[i] <= 'z'))
                    {
                        M[i] += 3;
                    }
                }
                
                //Segunda pasada
                M = new StringBuilder(new String(M)).reverse().toString().toCharArray();
                
                //Terceira pasada
                int metade = (int)tamanho/2;
                for(int i = metade; i < tamanho; i++)
                {
                    M[i] -= 1;
                }
                
                System.out.println(new String(M));
               
            }
        }
        
    }

}
