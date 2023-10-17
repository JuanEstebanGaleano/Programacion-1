package alimentos;

class Fruta extends Alimento {
    private String grupo;

    public Fruta(String nombre, int calorias, String grupo) {
        super(nombre, calorias);
        this.grupo = grupo;
    }

    public void describirNutrientes() {
        System.out.println("Esta fruta es una excelente fuente de vitaminas y fibra.");
    }
}