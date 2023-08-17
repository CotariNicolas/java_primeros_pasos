import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] Args){
        boolean num = false;
        int numero_ingresado = 0;
        while(num == false){
            Scanner num_ingre = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            numero_ingresado = num_ingre.nextInt();

            int primo_nosi = 1;
            if(numero_ingresado <= 1) primo_nosi = 0;
            else {for(int i = 2; i * i <= numero_ingresado; i++) {
                if (numero_ingresado % i == 0) {
                    primo_nosi = 0;
                    break;
                }
            }
            }
            if(numero_ingresado > 100 && primo_nosi == 1) num = true;
        }
        System.out.println("El numero ingresado " + numero_ingresado + " es mayor a 100 y es primo");
    }
}
