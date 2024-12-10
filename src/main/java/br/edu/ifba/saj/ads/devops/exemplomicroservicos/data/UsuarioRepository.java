package br.edu.ifba.saj.ads.devops.exemplomicroservicos.data;
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifba.saj.ads.devops.exemplomicroservicos.model.Usuario;

//Camada de Repusitorio do Usuario
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    
}
