package br.edu.ifba.saj.ads.devops.exemplomicroservicos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


//Camada de Entidade Usuario
@Entity
public class Usuario {

    //Id com a forma de criação 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Validações para cada campo
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotBlank
    private String senha;
    @NotBlank
    private String cpf;


    //Construtores 
    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String cpf) {
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setCpf(cpf);
    }
    // Getters e Seters 
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
