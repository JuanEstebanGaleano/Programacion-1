public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    public void establecerHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Hora no válida");
        }
    }

    public String obtenerHoraFormato24() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public String obtenerHoraFormato12() {
        String amPm;
        int horas12 = horas;
        if (horas12 >= 12) {
            amPm = "PM";
            if (horas12 > 12) {
                horas12 -= 12;
            }
        } else {
            amPm = "AM";
            if (horas12 == 0) {
                horas12 = 12;
            }
        }
        return String.format("%02d:%02d:%02d %s", horas12, minutos, segundos, amPm);
    }
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        Reloj.establecerHora(14, 30, 45);
        System.out.println("Hora en formato 24 horas: " + Reloj.obtenerHoraFormato24());
        System.out.println("Hora en formato 12 horas: " + Reloj.obtenerHoraFormato12());
    }
}