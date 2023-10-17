package alimentos;

class Carne extends Alimento {
    private String tipo;

    public Carne(String nombre, int calorias, String tipo) {
        super(nombre, calorias);
        this.tipo = tipo;
    }

    public void describirNutrientes() {
        System.out.println("Esta carne es rica en proteínas y hierro.");
    }
}
