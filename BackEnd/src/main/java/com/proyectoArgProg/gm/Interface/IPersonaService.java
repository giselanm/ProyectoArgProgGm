
package com.proyectoArgProg.gm.Interface;

import com.proyectoArgProg.gm.Entity.Persona;
import java.util.List;



public interface IPersonaService {
   //Traer lista de persona
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar usuario
    public void deletePersona(Long id);
    
    //Buscar persona
    public Persona findPersona(Long id);
}
