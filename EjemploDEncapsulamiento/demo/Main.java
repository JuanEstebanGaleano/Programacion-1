package EjemploDEncapsulamiento.demo;

public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona("Juan", 5000, false);
        System.out.println("persona: "+persona);
        persona.setNombre("Carlos");
        persona.setSueldo(3000);
        persona.setEliminado(true);
        System.out.println("persona: "+persona);
    }
}
