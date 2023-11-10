import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class ProyectoViveroTest {
    @Test
    public void testMain() {
        Planta rosa = new Rosa("Rosa común", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
        rosa.setFechaRiego(new Date());

        assertEquals("Rosa común", rosa.getNombre());
        assertEquals("Rosa sp.", rosa.getEspecie());
        assertEquals("Arbusto", rosa.getTipo());
        assertEquals("Luz directa", rosa.getLuz());
        assertEquals("Riego regular", rosa.getRiego());

        BotanicoEspecializado botanico = new BotanicoEspecializado("Licencia1", "Jeronimo ", "Guzman",
                "elwestconsin12@gmail.com", "3127610096");

        assertEquals("Licencia1", botanico.getLicencia());
        assertEquals("Jeronimo ", botanico.getNombre());
        assertEquals("Guzman", botanico.getApellido());
        assertEquals("elwestconsin12@gmail.com", botanico.getEmail());
        assertEquals("3127610096", botanico.getTelefono());

        CuidadoPlanta cuidado = new CuidadoPlanta("Área1", new Date());

        assertEquals("Área1", cuidado.getAreaCuidado());
        assertNotNull(cuidado.getFechaHoraCuidado());

        botanico.agregarCuidado(cuidado);

        assertEquals(1, botanico.obtenerCuidados().size());

        cuidado.registrarResultadoCuidado("Cuidado exitoso");

        assertEquals("Cuidado exitoso", cuidado.getResultadoCuidado());
    }
}