package herramienta;

 class Martillo extends Herramienta{
    @Override
    public void usar(String usar) {
        System.out.println("El martillo se esta utilizando " + usar);
    }
}
