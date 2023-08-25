class Fruta {
    String nombre;
    Fruta(String nombre){
        this.nombre = nombre;
    }
}
class Test{
    public static void cambiarNombre(Fruta f){
        f.nombre ="Manzana";
    }
    public static void main(String[] args) {
        Fruta miFruta = new Fruta("Naranja");
        System.out.println("Antes de llamar al método: "+ miFruta.nombre);
        cambiarNombre(miFruta);
        System.out.println("Despues de llamar al método: "+ miFruta.nombre);
    }
}