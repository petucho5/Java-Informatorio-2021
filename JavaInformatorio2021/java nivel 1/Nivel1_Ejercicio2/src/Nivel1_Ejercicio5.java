import java.util.Scanner;

public class Nivel1_Ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, m, n, producto;
        producto = 0;
        System.out.print("Ingresa el numero a multiplicar: ");
        m = scan.nextInt();
        System.out.print("Ingresa el numero a multiplicar: ");
        n = scan.nextInt();
        scan.close();
        for (i=m; i<=n; i++) {
            producto=producto+i;
            System.out.println();
        }
        System.out.println("Valor del producto: " + m + "*" + n + "=" + producto);
    }

}