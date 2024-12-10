package br.edu.ifba.saj.ads.devops.exemplomicroservicos.controllers;

import br.edu.ifba.saj.ads.devops.exemplomicroservicos.model.Usuario;
import br.edu.ifba.saj.ads.devops.exemplomicroservicos.services.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




//Marcação de Api Rest
@RestController
@RequestMapping("/usuario")// Marcação de Requisição para usuarioController
public class UsuarioController {

    //Injeção da camada de serviço
    @Autowired
    private UsuarioService usuarioService;

    //EndPoint de Criação de Usuarios 
    @PostMapping("/create")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return getUsuarioService().create(usuario);
    }

    //Endpoint de Listagem de Usuarios
    @GetMapping("/lista")
    public List<Usuario> list() {
        return getUsuarioService().list();
    }
    
    public UsuarioService getUsuarioService() {
        return this.usuarioService;
    }
}
