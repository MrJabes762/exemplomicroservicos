package br.edu.ifba.saj.ads.devops.exemplomicroservicos.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


//Camada de entidade com a marcação de entidades
@Entity
public class Tarefa {

    //Id com seu modo de geração 
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    // Validações em cada Atributo
    @NotBlank
    private String titulo;
    @NotBlank
    private String descricao;
    @NotBlank
    private String data;
    @NotBlank
    private String prioridade;
    @NotBlank
    private String tipo;

    //Construtores Vazios e com todos os atributos 
    public Tarefa() {
    }

    public Tarefa( String titulo, String descricao, String data, String prioridade, String tipo) {
        setTitulo(titulo);
        setDescricao(descricao);
        setData(data);
        setPrioridade(prioridade);
        setTipo(tipo);
    }


    // Getters Setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
