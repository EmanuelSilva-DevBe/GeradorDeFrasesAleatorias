package com.Emanuel.GeradorDeFrases.Controller;

import com.Emanuel.GeradorDeFrases.DTO.DadosDTO;
import com.Emanuel.GeradorDeFrases.Model.Dados;
import com.Emanuel.GeradorDeFrases.Service.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // -> Cria um controlador Rest
@RequestMapping("/series")
public class DadosController {

    @Autowired
    private DadosService servico;

    @GetMapping("/frases")
    public DadosDTO buscaFrases(){
        return servico.obterFrases();
    }
}
