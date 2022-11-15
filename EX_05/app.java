import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[3];


            try {
                System.out.println("Introduce un numero: ");
                Scanner nota = new Scanner(System.in);
                Scanner nota2 = new Scanner(System.in);
                Scanner nota3 = new Scanner(System.in);

               for(int i = 0; i <= array.length; i++) {
                   array[0] = nota.nextInt();
                   array[1] = nota2.nextInt();
                   array[2] = nota3.nextInt();
                   double media = 0.0;
                   media = media + array[0] + array[1] + array[2];
                   media = media / array.length;
                   System.out.println("La media es: " + media);
               }
            }catch (Exception a) {
                System.out.println("Numero no valido!");
            }
        }
    }