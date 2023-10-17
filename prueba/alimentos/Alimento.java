package alimentos;

class Alimento {
    private String nombre;
    private int calorias;

    public Alimento(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void describirNutrientes() {
        System.out.println("Este alimento contiene nutrientes variados.");
    }
}