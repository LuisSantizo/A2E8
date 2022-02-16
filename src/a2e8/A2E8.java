
import java.util.Scanner;

public class A2E8 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner sc = new Scanner(System.in);
        boolean ciclo = true;
        do {
            int Num;
            String opcion;
            Num = (int) (Math.random() * 1000);
            System.out.println("Se genero: " + (Num * 5));
            System.out.println(" Ingrese (S) Para salir.");
            opcion = sc.nextLine();
            if (opcion.equals("S") ^ opcion.equals("s")) {
                ciclo = false;
            }
        } while (ciclo != false);
    }
}
