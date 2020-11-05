import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      
      Scanner entrada = new Scanner(System.in);
      
      int x = entrada.nextInt();
      int quant = 6;
      
      if(x%2 == 1){
          System.out.println(x);
          quant--;
      }else{
          x -= 1;
      }
      
      for(int i = 1; i<=quant; i++){
          x += 2;
          System.out.println(x);
      }
      
    }
    
}
