import java.util.Date;
import java.util.List;


public class ProyectoVivero {
     public static void main(String[] args) {
        // Crear una planta de tipo Rosa
        Planta rosa = new Rosa("Rosa común", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
        rosa.setFechaRiego(new Date());

        // Crear un botánico especializado
        BotanicoEspecializado botanico = new BotanicoEspecializado("Licencia1", "NombreBotanico", "ApellidoBotanico", "correo@example.com", "123456789");

        // Crear un cuidado para la planta
        CuidadoPlanta cuidado = new CuidadoPlanta("Área1", new Date());

        // Asignar el botánico al cuidado
        botanico.agregarCuidado(cuidado);

        // Registrar el resultado del cuidado
        cuidado.registrarResultadoCuidado("Cuidado exitoso");

        // Obtener cuidados del botánico
        List<CuidadoPlanta> cuidadosDelBotanico = botanico.obtenerCuidados();

        // Mostrar información de la planta
        System.out.println("Información de la planta:");
        System.out.println(rosa);

        // Mostrar información del botánico
        System.out.println("Información del botánico:");
        System.out.println(botanico);

        // Mostrar información del cuidado de la planta
        System.out.println("Información del cuidado de la planta:");
        System.out.println("Área de cuidado: " + cuidado.getAreaCuidado());
        System.out.println("Fecha y hora del cuidado: " + cuidado.getFechaHoraCuidado());
        System.out.println("Resultado del cuidado: " + cuidado.getResultadoCuidado());
        System.out.println("Estado del cuidado: " + cuidado.getEstadoCuidado());
    }
}

