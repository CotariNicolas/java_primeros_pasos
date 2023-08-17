import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] argc){
        int primo_nosi = 1;
    Scanner numero_ingre = new Scanner(System.in);
    int numero_ingresado;
    System.out.println("Ingrese un nuemro entre 50 y 100: ");
    numero_ingresado = numero_ingre.nextInt();
    while(numero_ingresado < 50 || numero_ingresado > 100){
        System.out.println("Porfavor ingrese un numero entre 50 y 100: ");
        numero_ingresado = numero_ingre.nextInt();
    }
    if(numero_ingresado == 0 || numero_ingresado == 1) System.out.println("El numero ingresado" + numero_ingresado + "no es primo");
    else if(numero_ingresado > 1){
        for(int i = 2; i * i <= numero_ingresado; i++){
            if(numero_ingresado % i == 0) primo_nosi = 0;
        }
    }
    if(primo_nosi == 1) System.out.println("El numero ingresado " + numero_ingresado + " es primo");
    else  if(primo_nosi == 0) {
        System.out.println("El numero ingresado " + numero_ingresado + " no es primo");
        System.out.println("Los divisores del numero ingresado son ");
        for(int i = 1; i <= numero_ingresado; i++){
            if(numero_ingresado % i == 0) System.out.println(i);
        }
    }
    }
}
