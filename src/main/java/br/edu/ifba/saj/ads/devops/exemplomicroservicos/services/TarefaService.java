package br.edu.ifba.saj.ads.devops.exemplomicroservicos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.saj.ads.devops.exemplomicroservicos.data.TarefaRepository;
import br.edu.ifba.saj.ads.devops.exemplomicroservicos.model.Tarefa;
import jakarta.validation.Valid;


//Camada de Serviço Marcada com @Service
@Service
public class TarefaService {
    //Injeção da Camada de repositrio de tarefa 
    @Autowired
    private TarefaRepository tarefaRepository;

    //Métodos de Criar, listar, atualizar e deletar Tarefa 
    public Tarefa create (@Valid Tarefa tarefa){
        return getTarefaRepository().save(tarefa);
    }

    public List<Tarefa> list (){
        return getTarefaRepository().findAll();
    }

    public Tarefa updade (@Valid Tarefa tarefa){
        Tarefa tarefadoBanco = getTarefaRepository().findById(tarefa.getId()).orElse(null);
        if (tarefadoBanco != null){
            tarefadoBanco.setTitulo(tarefa.getTitulo());
            tarefadoBanco.setDescricao(tarefa.getDescricao());
            tarefadoBanco.setData(tarefa.getData());
            tarefadoBanco.setPrioridade(tarefa.getPrioridade());
            tarefadoBanco.setTipo(tarefa.getTipo());
            return getTarefaRepository().save(tarefadoBanco);
        }
        return null;
    }

    public void delete (Long id){
        if (getTarefaRepository().existsById(id)){
            getTarefaRepository().deleteById(id);
        }
    }

    //Getter
    public TarefaRepository getTarefaRepository() {
        return this.tarefaRepository;
    }
    
}
