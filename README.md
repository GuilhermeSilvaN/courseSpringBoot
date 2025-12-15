# 📘 Documentação do Curso – Java com Spring Boot e JPA

## 📌 Visão Geral

Esta documentação reúne os principais conceitos, ferramentas e práticas estudadas no curso de **Java Back-end**, com foco no desenvolvimento de **APIs REST** utilizando **Spring Boot**, **JPA/Hibernate**, **H2** e **Postman**.

O objetivo é servir como material de **apoio ao estudo**, **consulta rápida** e também como **documentação de portfólio no GitHub**.

---

## 🛠️ Tecnologias Utilizadas

* **Java** – Linguagem principal do projeto
* **Spring Boot** – Framework para criação de aplicações Java modernas
* **Spring Data JPA** – Abstração para persistência de dados
* **Hibernate** – Implementação do JPA (ORM)
* **H2 Database** – Banco de dados em memória para testes
* **Postman** – Ferramenta para testar requisições HTTP

---

## ☕ Java

Java é a base da aplicação. No curso são aplicados conceitos como:

* Programação Orientada a Objetos (POO)
* Classes, objetos, métodos e atributos
* Encapsulamento
* Records (DTOs)
* Tratamento de exceções

---

## 🌱 Spring Boot

O **Spring Boot** simplifica a configuração e inicialização de projetos Spring.

### Principais conceitos estudados:

* `@SpringBootApplication`
* Injeção de dependência (`@Autowired`, construtor)
* Controllers REST (`@RestController`)
* Mapeamento de rotas (`@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`)
* Configuração via `application.properties`

### Benefícios:

* Menos configuração manual
* Servidor embutido (Tomcat)
* Integração fácil com JPA e bancos de dados

---

## 🗄️ JPA (Java Persistence API)

JPA é a especificação responsável pelo **mapeamento objeto-relacional (ORM)**.

### Conceitos abordados:

* Entidades (`@Entity`)
* Chave primária (`@Id`, `@GeneratedValue`)
* Relacionamentos:

    * `@OneToOne`
    * `@OneToMany`
    * `@ManyToOne`
    * `@ManyToMany`
* `@JoinColumn` e `@JoinTable`
* Repositórios (`JpaRepository`)

### Exemplo de entidade:

```java
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
}
```

---

## 🔄 Hibernate

Hibernate é a **implementação do JPA** usada pelo Spring Boot.

### Funções principais:

* Gerenciar entidades
* Traduzir objetos Java em tabelas
* Executar SQL automaticamente

### Vantagens:

* Menos código SQL manual
* Portabilidade entre bancos
* Controle de transações

---

## 🧪 H2 Database

O **H2** é um banco de dados em memória, muito usado para testes e aprendizado.

### Características:

* Banco temporário (dados somem ao reiniciar)
* Fácil configuração
* Console web para visualização

### Configuração comum:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

Acesso ao console:

```
http://localhost:8080/h2-console
```

---

## 📬 Postman

O **Postman** é utilizado para testar as APIs REST criadas no projeto.

### Utilizações no curso:

* Enviar requisições GET, POST, PUT e DELETE
* Testar JSON no corpo da requisição
* Validar respostas HTTP
* Simular consumo da API por um front-end

### Exemplo de JSON enviado:

```json
{
  "title": "Clean Code",
  "publisherId": 1,
  "authorIds": [1, 2]
}
```

---

## 🧩 Estrutura do Projeto

```
src/main/java
 └── com.exemplo.projeto
     ├── controllers
     ├── services
     ├── repositories
     ├── models
     └── dtos
```

### Responsabilidades:

* **Controller**: recebe requisições HTTP
* **Service**: regra de negócio
* **Repository**: acesso ao banco de dados
* **Model**: entidades JPA
* **DTO**: transporte de dados

---

## 🎯 Objetivos do Curso

* Criar APIs REST com Spring Boot
* Entender o funcionamento do JPA/Hibernate
* Trabalhar com banco de dados
* Aplicar boas práticas de arquitetura
* Preparação para projetos reais e estágio

---

## 📌 Observações Finais

Esta documentação será atualizada conforme novos conteúdos forem estudados, como:

* MySQL
* Segurança (Spring Security)
* Paginação e filtros
* Testes automatizados

---

📚 *Documento criado para fins de estudo e portfólio.*
