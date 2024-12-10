# Atividade DevOps: CRUD de Usuarios e Tarefas

## Tecnologias: 

- Java; 
- Spring (BOOT,MVC,Data, JPA, Doc OpenAPI)
- MySQL.

## Práticas Implementadas: 

 - SOLID;
 - API REST; 
 - Consultas com Spring Data JPA; 
 - Injeção de Dependencias; 
 - Validação; 
 - Geração automática do Swagger com a OpenAPI 3;

## Endpoints: 

 - Criar Entidades (Usuario e tarefa)
 - Listar entidades (Usuario e tarefa)

## Como executar: 

1 - Clonar Repositório git;

```console
https://github.com/MrJabes762/exemplomicroservicos.git
``` 

2 - Contruir o Projeto 

```console
 ./mvnw clean package
``` 
3 - Executar  

```console
java-jar target/todolist-0.0.1-SNAPSHOT.jar
```

## Extra: 

A API  poderá ser acessada pela porta padrão 8080:

```console
localhost:8080
``` 

A Documentação poderá ser visualizada com o Swagger em:

```console
 localhost:8080/swagger-ui.html
```
