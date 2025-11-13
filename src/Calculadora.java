public class Calculadora {

    public static void main(String[] args) {
        System.out.println("--- Calculadora Colaborativa ---");
        // Zona de prueba
        System.out.println("Programa iniciado con exito.");
        
        System.out.println("Suma (5+3): " + suma(5, 3));
        
        System.out.println("Resta (5-3): " + resta(5, 3)); 
    }

    public static int suma(int a, int b) {
        return a + b;
    }
    
    public static int resta(int a, int b) {
        return a - b;
    }
    
    
}
