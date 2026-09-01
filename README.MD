# 🎬 Gerador de Frases Aleatórias

API REST desenvolvida em Spring Boot que retorna frases célebres de filmes e séries de forma aleatória, integrada a uma aplicação front-end.

Projeto desenvolvido como desafio da formação **Java e Spring Framework** da Alura, com o objetivo de consolidar conhecimentos de Spring Boot, Spring Data JPA e integração REST entre back-end e front-end.

## 📸 Demonstração

![Tela inicial da aplicação](caminho/para/print1.png)
![Frase aleatória sendo exibida](caminho/para/print2.png)

## 🚀 Funcionalidades

- Endpoint que retorna uma frase aleatória do banco de dados a cada requisição
- Integração com front-end via CORS configurado
- Persistência de dados com PostgreSQL

## 🛠️ Tecnologias

- Java 21
- Spring Boot 4.1.1
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

## 📡 Endpoint

```
GET /series/frases
```

**Resposta:**
```json
{
  "id": 5,
  "titulo": "Breaking Bad",
  "frase": "Eu não estou em perigo, eu sou o perigo",
  "personagem": "Walter White",
  "poster": "https://..."
}
```

## 🏗️ Arquitetura

O projeto segue o padrão em camadas:

- **Model**: entidade `Frase`, mapeada via JPA
- **Repository**: interface `FraseRepository`, com query JPQL personalizada para busca aleatória
- **Service**: camada de conversão entre entidade e DTO
- **Controller**: expõe o endpoint REST consumido pelo front-end

## ⚙️ Como rodar o projeto

1. Clone o repositório
2. Crie um banco PostgreSQL
3. Configure o `application.properties` com suas credenciais (veja `application.properties.example`)
4. Popule o banco com o script de frases fornecido no desafio
5. Rode a aplicação (`mvn spring-boot:run` ou pela sua IDE)

## 🔗 Front-end

O front-end utilizado neste projeto foi disponibilizado pela Alura como parte do desafio, desenvolvido por Jacqueline Oliveira:

[jacqueline-oliveira/3356-java-desafio-front](https://github.com/jacqueline-oliveira/3356-java-desafio-front) — Front-end utilizado no desafio proposto na última aula do terceiro curso da formação Avançando em Java.

## 👤 Autor

Desenvolvido por João Pedro