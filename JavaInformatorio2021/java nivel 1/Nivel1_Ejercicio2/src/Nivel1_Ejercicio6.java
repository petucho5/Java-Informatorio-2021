import java.util.Scanner;

public class Nivel1_Ejercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  m, n, producto;
        System.out.print("Ingresa el numero base: ");
        m = scan.nextInt();
        System.out.print("Ingresa el numero exponente: ");
        n = scan.nextInt();
        producto = calculate(m,n);
        System.out.println(m+"^"+n+"="+producto);
        scan.close();
    }
    static int calculate (int m, int n) {
        int suma=1;
        if(m > 0 && n==0){
            return suma;
        }
        else if(m == 0 && n>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= n; i++){
                suma = suma*m;
            }
            return suma;
        }
    }

}