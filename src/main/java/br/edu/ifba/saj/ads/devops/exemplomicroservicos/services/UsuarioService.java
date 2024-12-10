package br.edu.ifba.saj.ads.devops.exemplomicroservicos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.ads.devops.exemplomicroservicos.data.UsuarioRepository;
import br.edu.ifba.saj.ads.devops.exemplomicroservicos.model.Usuario;
import jakarta.validation.Valid;

//Camada de Serviço de Usuario
@Service
public class UsuarioService {

    //Injeção da camada de Repositorio de usuario
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Metodos de criar, listar, atualizar e deletaer usuarios 
    public Usuario create (@Valid Usuario usuario){
        return getUsuarioRepository().save(usuario);
    }

    public List<Usuario> list (){
        return getUsuarioRepository().findAll();
    }

    public Usuario update (@Valid Usuario usauroo){
        Usuario usuariodobanco = getUsuarioRepository().findById(usauroo.getId()).orElse(null);
        if (usuariodobanco != null){
            usuariodobanco.setNome(usauroo.getNome());
            usuariodobanco.setEmail(usauroo.getEmail());
            usuariodobanco.setSenha(usauroo.getSenha());
            usuariodobanco.setCpf(usauroo.getCpf());
            return getUsuarioRepository().save(usuariodobanco);
        }
        return null;
    }
    public void delete(Long id) {
        if (getUsuarioRepository().existsById(id)){
            getUsuarioRepository().deleteById(id);
        }
    }

    // Getter
    public UsuarioRepository getUsuarioRepository() {
        return this.usuarioRepository;
    }
}
