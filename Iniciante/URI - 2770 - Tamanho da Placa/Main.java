import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String linha;
        String[] vetor;
        String[] dim;
        int n;
        boolean sim;
        

        while ((linha = br.readLine()) != null) {
            
            vetor = linha.split(" ");
            n = Integer.parseInt(vetor[2]);
            
            while(n > 0){
                
                sim = false;
                
                dim = br.readLine().split(" ");
                
                if(Integer.parseInt(dim[0]) <= Integer.parseInt(vetor[0]) && Integer.parseInt(dim[1]) <= Integer.parseInt(vetor[1])){
                    sim = true;
                }else if(Integer.parseInt(dim[1]) <= Integer.parseInt(vetor[0]) && Integer.parseInt(dim[0]) <= Integer.parseInt(vetor[1])){
                    sim = true;
                }
                
                System.out.println(sim?"Sim":"Nao");
                
                n--;
            }
            
        }

    }

}
