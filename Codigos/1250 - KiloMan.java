import java.io.IOException;

import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int N;
        int T;
        int k;
        String Tinteiros;
        String pulos;
        int atingido;
        int x;

        Scanner entrada = new Scanner(System.in);

        N = entrada.nextInt();
        entrada.nextLine();

        while ((N--) > 0) {
            k = 0;

            atingido = 0;

            T = entrada.nextInt();
            entrada.nextLine();

            Tinteiros = entrada.nextLine();

            pulos = entrada.nextLine();

            for (int j = 0; j < T; j++) {

                x = Integer.parseInt("" + Tinteiros.charAt(k));

                if (pulos.charAt(j) == 'S' && (x <= 2)) {

                    atingido++;

                } else if (pulos.charAt(j) == 'J' && (x > 2)) {

                    atingido++;

                }

                k += 2;

            }

            System.out.println(atingido);
        }

    }

}
