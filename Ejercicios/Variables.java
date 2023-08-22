public class Variables {
    public static void main(String[] args) {
        int edad1;
        int edad2;
        int segundos;
        int dias;
        int diferencia;
        int suma;
        int division;
       
       edad1 = 20;
       edad2 = 10;
       
       dias = edad1 * 365;
       segundos = dias * 86400;
      
        System.out.println("De la edad1 uno han pasado: " + segundos);
        
        diferencia = edad1 - edad2;
        System.out.println("La diferencia entre edad1 y edad2 es: " + diferencia);
        
        suma = edad1 + edad2;
        System.out.println("La suma de edad1 y edad2 es: " + suma);
        
        division = edad1 / edad2;
        System.out.println("La division de edad1 y edad2 es: " + division);
        
        edad2 = edad2 + 1;
        System.out.println("Edad2 actualizada: " + edad2);
    }
}
