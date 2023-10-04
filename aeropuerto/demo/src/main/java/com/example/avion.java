package aeropuerto.demo.src.main.java.com.example;

public class avion {
    private int modeloAvion;
    private int numeroAsientos;
    private int velocidadMax;
    
    //constructor vacio
    public avion (){
    }
    public avion(int modeloAvion, int numeroAsientos, int velocidadMax){
        this.modeloAvion=modeloAvion;
        this.numeroAsientos=numeroAsientos;
        this.velocidadMax=velocidadMax;
    }
    public int getModeloAvion() {
        return modeloAvion;
    }
    public void setModeloAvion(int modeloAvion) {
        this.modeloAvion = modeloAvion;
    }
    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    @Override
    public String toString(){
        return "Modelo Avion "+modeloAvion+ "Numero de Asientos "+numeroAsientos+ "Velocidad Maxima" + velocidadMax;
    }
} 
