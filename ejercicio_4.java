import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] Argc){
    Scanner numero1 = new Scanner(System.in);
    int n1;
    System.out.println("Ingrese el primero numero: ");
    n1 = numero1.nextInt();

    Scanner numero2 = new Scanner(System.in);
    int n2;
    System.out.println("Ingrese el segundo numero: ");
    n2 = numero1.nextInt();

    Scanner seleccion = new Scanner(System.in);
    int operacion;
    System.out.println("Ingrese cual es la operacion que desea realizar: (1.Sumar/2.Resta/3.Multiplicar/4.Dividir");
    operacion = seleccion.nextInt();

    double resultado;
    while(operacion < 1 || operacion > 4){
        System.out.println("Por favor ingrese un numero entre 1 y 4: (1.Sumar/2.Resta/3.Multiplicar/4.Dividir");
        operacion = seleccion.nextInt();
    }
    switch (operacion){
        case 1:
            resultado = (n1 * 1.0) + (n2 * 1.0);
            System.out.println("El resultado de la suma es " + resultado);
            break;

        case 2:
            resultado = (n1 * 1.0) - (n2 * 1.0);
            System.out.println("El resultado de la resta es " + resultado);
            break;

        case 3:
            resultado = (n1 * 1.0) * (n2 * 1.0);
            System.out.println("El resultado de la multiplicacion es " + resultado);
            break;

        case 4:
            resultado = (n1 * 1.0) / (n2 * 1.0);
            System.out.println("El resultado de la division es " + resultado);
            break;
    }
    }
}
