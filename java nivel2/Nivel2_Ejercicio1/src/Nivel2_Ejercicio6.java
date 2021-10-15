import java.util.*;

public class Nivel2_Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleados = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleados.add(new Empleado("Lionel Messi", 30333000, 8, 100000));
        empleados.add(new Empleado("Nicolas Gonzalez", 38666666, 6, 500));
        empleados.add(new Empleado("Walter Samuel", 29000123, 14, 800));
        empleados.add(new Empleado("Pablo Aimar", 29123456, 15, 800));
        empleados.add(new Empleado("Roberto Ayala", 26987654, 13, 800));

        for (Empleado crearUnaTabla : empleados) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSalario por DNI:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }

    
}
    class Empleado {
        String nombre;
        int dni;
        float horasTrabajadas;
        float valorPorHora;
    
    
        public Empleado(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
            this.nombre = nombre;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }
        public int clave() {
            return this.dni;
        }
    
        public float valor() {
            return this.horasTrabajadas * this.valorPorHora;
        }
    }
