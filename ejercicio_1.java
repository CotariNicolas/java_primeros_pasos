import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Scanner numero_ingre = new Scanner(System.in);
            int numero_ingresado;
            System.out.println("Ingrese un numero entre 1 y 100: ");
            numero_ingresado = numero_ingre.nextInt();
            while (numero_ingresado > 100 || numero_ingresado < 1) {
                System.out.println("Ingrese nuevamente un numero entre 1 y 100 porfavor: ");
                numero_ingresado = numero_ingre.nextInt();
            }
            if (numero_ingresado % 2 == 0) System.out.println("El numero ingresado " + numero_ingresado + " es par");
            else System.out.println("El numero ingresado " + numero_ingresado + " es impar");
        }
    }
}
