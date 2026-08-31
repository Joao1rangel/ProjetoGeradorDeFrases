package com.example.ProjetoGeradorDeFrases.repository;

import com.example.ProjetoGeradorDeFrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> { //Usa uam interface apenas para declarar metodos e extende da JpaRepository que usa os parametros dentro do "<>" Frase que é a entidade que o Jpa usa e a tipagem do Id o Spring Data JPA gera a implementação automaticamente, sem precisarmos escrever o código manualmente

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1") // Query JPQL para busca todas as frases, ordena de forma aleatória usando a função RANDOM() do PostgreSQL, e retorna apenas 1 resultado (LIMIT 1)
    Frase frasesSortidas();


}
