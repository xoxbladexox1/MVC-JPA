import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.model.Persona;
import com.example.demo.service.impl.PersonaServiceIMP;

public class CLASEPRUEBA  {
	@Autowired 
	private PersonaServiceIMP personaServiceIMP ;
	
	
	Persona persona = new Persona() ;
	
	
	public void eliminar(int i)
	{
		persona.setId(i);
		personaServiceIMP.getDao().delete(persona);
	}

}
