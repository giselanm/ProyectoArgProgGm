
package com.proyectoArgProg.gm.Security.Repository;

import com.proyectoArgProg.gm.Security.Entity.Rol;
import com.proyectoArgProg.gm.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
