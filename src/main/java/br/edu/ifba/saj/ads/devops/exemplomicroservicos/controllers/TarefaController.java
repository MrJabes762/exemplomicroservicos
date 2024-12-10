package br.edu.ifba.saj.ads.devops.exemplomicroservicos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.saj.ads.devops.exemplomicroservicos.model.Tarefa;
import br.edu.ifba.saj.ads.devops.exemplomicroservicos.services.TarefaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


//Marcação de Api Rest
@RestController
@RequestMapping("/tarefa")//Request mapeado para rarefa
public class TarefaController {

    //Injeção da camada de serviço
    @Autowired
    private TarefaService tarefaService;
    //Endpoint de criar tarefa
    @PostMapping("/create")
    public Tarefa createTarefa(@RequestBody Tarefa tarefa ) {
        return getTarefaService().create(tarefa);
    }
    //Endpont de Listagem de Tarefa
    @GetMapping("/lista")
    public List<Tarefa> list() {
        return getTarefaService().list();
    }
    
    public TarefaService getTarefaService() {
        return this.tarefaService;
    }
}
