package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;


public class HectorAaronJuarezTax {
	 @InjectMocks
	    AsignarHorario asignarHorario;

	    @Mock
	    Carrera carrera;

	    @Mock
	    RegistroAcademico registroAcademico;

	    @BeforeEach
	    public void setUp() 
	    {
	        MockitoAnnotations.initMocks(this);

	    }

	    @Test
	    public void ObtenerCodigoHorarioTest() 
	    {
	        when(registroAcademico.cheequearCarnet()).thenReturn(true);
	        when(registroAcademico.getAnio()).thenReturn(2010);
	        
	            try {
					when(carrera.procesarCarrera()).thenReturn(4);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            Horario horario = null;
				try {
					horario = asignarHorario.generarHorario(carrera, registroAcademico);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            assertEquals(140, horario.getCodigoHorario());
	        
	    }

	    @Test
	    public void ObtenerDescripcionTest() {
	        when(registroAcademico.cheequearCarnet()).thenReturn(true);
	        when(registroAcademico.getAnio()).thenReturn(2010);
	      
	            try {
					when(carrera.procesarCarrera()).thenReturn(4);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            Horario horario = null;
				try {
					horario = asignarHorario.generarHorario(carrera, registroAcademico);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            assertEquals("Nocturno", horario.getDescripcion());
	       
	        
	        
	    }
}
