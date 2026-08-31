package com.example.ProjetoGeradorDeFrases.service;

import com.example.ProjetoGeradorDeFrases.dto.FraseDTO;
import com.example.ProjetoGeradorDeFrases.model.Frase;
import com.example.ProjetoGeradorDeFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // avisa ao Spring que essa classe tem regra de negocio e deve ser gerenciada por ele (vira um Bean)
public class FraseService {

    @Autowired // pede ao Spring uma instancia pronta do FraseRepository, sem precisar criar manualmente
    private FraseRepository repositorio;

    // Metodo publico que sera chamado pelo Controller.
    // O tipo de retorno e FraseDTO (nao a entity Frase), pois nao queremos
    // expor a estrutura interna do banco/JPA para quem consome a API.
    public FraseDTO obterFraseSortida() {

        // Chama o metodo do repository (repositorio.frasesSortidas()) atraves
        // do "." - isso executa a query JPQL que busca 1 frase aleatoria no banco.
        // O resultado e do tipo Frase (a entity), por isso guardamos numa
        // variavel do tipo Frase.
        Frase f = repositorio.frasesSortidas();

        // Aqui fazemos a "traducao" da entity Frase para o FraseDTO.
        // Usamos os getters (getId(), getTitulo(), etc.) para extrair cada
        // valor de "f", e passamos eles, NA MESMA ORDEM declarada no record
        // FraseDTO(Long id, String titulo, String frase, String personagem, String poster).
        // Se a ordem dos argumentos nao bater com a ordem do record, os dados
        // ficam trocados silenciosamente (sem erro de compilacao).
        return new FraseDTO(f.getId(), f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster());
    }
}