public class Calculadora{
    
    public static void main(String[] args){
        System.out.println("--- Calculadora Colaborativa ---");
        //Zona de prueba
        System.out.println("Programa iniciado con exito.");
        
        System.out.println("Suma (5+3): " + suma(5,3));
        System.out.println("Resta (5-3): " + resta(5,3));
        
        System.out.println("Multiplicacion (5*3): " + multiplicacion(5,3));
        System.out.println("Division (5/3): " + division(5,3));
        
        System.out.println("Potencia de (2^3): " + potencia(2,3));
    }
    
    public static int suma(int a,int b) {
        return a+b;
    }
    
    public static int resta(int a,int b) {
        return a-b;
    }
    
    public static int multiplicacion(int a,int b) {
        return a*b;
    }
    
    public static double division(int a,int b) {
        if (b==0){
            System.out.println("ERROR: No se puede dividir por cero.");
            System.exit(1);
        }
        return (double) a/b;
    }
    
    public  static double potencia(int a, int b){
        return Math.pow(a,b);
    }
}