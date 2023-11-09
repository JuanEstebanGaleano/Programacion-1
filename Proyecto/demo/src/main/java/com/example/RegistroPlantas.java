import java.util.ArrayList;

public class RegistroPlantas {
    private ArrayList<Planta> plantas;

    public RegistroPlantas() {
        this.plantas = new ArrayList<>();
    }

    public void agregarPlanta(Planta planta) {
        this.plantas.add(planta);
    }

    public void actualizarPlanta(Planta planta) {
        for (int i = 0; i < this.plantas.size(); i++) {
            if (this.plantas.get(i).getId().equals(planta.getId())) {
                this.plantas.set(i, planta);
                break;
            }
        }
    }

    public void eliminarPlanta(Planta planta) {
        this.plantas.remove(planta);
    }

}
