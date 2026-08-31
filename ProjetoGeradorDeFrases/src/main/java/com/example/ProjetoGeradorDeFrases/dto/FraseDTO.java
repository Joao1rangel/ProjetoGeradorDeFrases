package com.example.ProjetoGeradorDeFrases.dto;

// Pega os mesmos atributos e tipos da entidade Frase, mas serve para carregar
// os dados do back para o front através de JSON. Diferente da entity, não é
// amarrado a anotações JPA nem à estrutura do banco - é uma cópia segura e
// simplificada, que garante uma comunicação clara e traduzida entre o banco
// e o front-end.
public record FraseDTO(Long id,
                       String titulo,
                       String frase,
                       String personagem,
                       String poster) {
}