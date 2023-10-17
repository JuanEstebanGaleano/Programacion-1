package muebles;

 class Mesa extends Mueble{
    @Override
    public void ubicar(String ubicacion) {
        System.out.println("La mesa ha sido colocada en " + ubicacion);
    }
}
