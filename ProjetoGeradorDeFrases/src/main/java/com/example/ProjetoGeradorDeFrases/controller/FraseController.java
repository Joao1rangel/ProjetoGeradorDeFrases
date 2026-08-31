package com.example.ProjetoGeradorDeFrases.controller;

import com.example.ProjetoGeradorDeFrases.dto.FraseDTO;
import com.example.ProjetoGeradorDeFrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // diz ao Spring que essa classe recebe requisições HTTP e devolve os dados como JSON
@RequestMapping("/series/frases") // define um prefixo para todos os endpoints dessa classe; como só temos um método, não precisa complementar mais nada
public class FraseController {

    @Autowired
    private FraseService servico; // cria um atributo do tipo FraseService denominado "servico"

    @GetMapping // normalmente complementamos com o endpoint aqui, mas nesse caso não precisa, pois já concluímos a rota completa no @RequestMapping. Diz ao Spring que esse método responde a requisições do tipo GET (buscar/ler dados), diferente de POST (criar), PUT (atualizar) ou DELETE (remover)
    public FraseDTO obterFrase() {
        return servico.obterFraseSortida(); // chama o método obterFraseSortida do servico para retornar a frase sorteada, já convertida para o formato DTO
    }

}