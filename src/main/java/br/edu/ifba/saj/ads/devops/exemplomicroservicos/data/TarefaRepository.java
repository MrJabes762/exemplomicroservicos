package br.edu.ifba.saj.ads.devops.exemplomicroservicos.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifba.saj.ads.devops.exemplomicroservicos.model.Tarefa;

//Camada de Repositorio da tarefa
public interface TarefaRepository extends JpaRepository<Tarefa,Long> {
    
}
