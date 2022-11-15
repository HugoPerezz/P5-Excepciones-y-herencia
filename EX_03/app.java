import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        String [] nombres = new String[5];
        Scanner scanner = new Scanner(System.in);

        try {
            Scanner nombre = new Scanner(System.in);
            System.out.println("Introduce un nombre: ");
           for (int i = 0; i < 10; i++){
               nombres[i] = nombre.next();
           }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Has superado el límite.");
        }
    }
}
