import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio_5 {
    public static void main(String[] Argc){
        Scanner num_ingre = new Scanner(System.in);
        int tamano_arra;
        System.out.println("Ingrese el tamano de la array que desea: ");
        tamano_arra = num_ingre.nextInt();
        int[] arra = new int[tamano_arra];
        //aca se pide el tamano de la arra al usario

        Scanner num_a = new Scanner(System.in);
        int num_arra;
        int pasos = 0;
        System.out.println("Acontinuacion ingrese numeros para meter a la array. o si desea dejar de ingresar numeros, ingrese una letra");
        for(int i = 0; i < tamano_arra; i++){
            try {
                System.out.println("Ingrese un numero: ");
                num_arra = num_a.nextInt();
                arra[i] = num_arra;
                pasos++;
            } catch (InputMismatchException a) {
                break;
            }
        }
        // este es el ciclo for para ingresar los numero a la array

        System.out.println("Los numero ingresador son: ");
        for(int array : arra){
            System.out.println(array);
        }

    }
}
