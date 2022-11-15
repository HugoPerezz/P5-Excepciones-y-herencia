import java.util.Scanner;


public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int cuadrado = 0;

        while (numero>= 0) {
            try {
                System.out.println("Introduce un numero: ");
                Scanner nombre = new Scanner(System.in);
                numero = nombre.nextInt();
                cuadrado = numero * numero;
                System.out.println(numero + "² es igual a " + cuadrado);

            } catch (Exception a) {
                System.out.println("Numero no valido!");
            }
        }
    }
}
