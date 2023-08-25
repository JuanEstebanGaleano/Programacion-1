/*
 * 
 */
public class Persona {
    String nombre;
    int edad;

    //Constructor
    Persona(String nombre, int edad){
        this.nombre =   nombre;
        this.edad   =   edad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre "+ nombre +", Edad "+edad);
    }
    public static void main(String[] args) {
        Persona p=new Persona("Juan", 30);
        p.mostrarDatos();
    }
}

