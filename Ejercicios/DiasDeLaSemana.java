/*
 * Programa que nos diga el nombre del d+ia
 * de la semana segun un numero dado
 */
public class DiasDeLaSemana {
    public static void main(String[] args) {
        int dia=4;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
            System.out.println("Martes");
                break;
            case 3:
            System.out.println("Miercoles");
                break;
            case 4:
            System.out.println("Jueves");
                break;
            case 5:
            System.out.println("Viernes");
                break;
            case 6:
            System.out.println("Sabado");
                break;
            case 7:
            System.out.println("Domingo");
                break;
                default:
                System.out.println("Número no valido para un día de la semana"); 
        }
    }
}