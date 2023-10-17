package muebles;

 class Sofa extends Mueble {
    @Override
    public void ubicar(String ubicacion) {
        System.out.println("El sofá ha sido colocado en " + ubicacion);
    }
}
