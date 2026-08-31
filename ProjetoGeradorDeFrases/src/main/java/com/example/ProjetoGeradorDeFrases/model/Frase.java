package com.example.ProjetoGeradorDeFrases.model;

import jakarta.persistence.*;

@Entity // O JPA trata a lasse como se fosse uma Tabela dentro de uma banco de dados relacional
@Table(name = "frase")  // nomeia a table como "frase"
public class Frase {
    @Id // diz que é um ID (chave primária)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // declara que o não precisará ser preenchido e esse Id seá auoincrement com o tempo
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Long getId() {
        return id;                    // Usa o Get para que o Jacson consiga pegar essas varoiáveis privatese transforlas em JSON
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getPoster() {
        return poster;
    }
}
