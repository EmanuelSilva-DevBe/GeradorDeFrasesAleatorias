package com.Emanuel.GeradorDeFrases.Service;

import com.Emanuel.GeradorDeFrases.DTO.DadosDTO;
import com.Emanuel.GeradorDeFrases.Model.Dados;
import com.Emanuel.GeradorDeFrases.Repository.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Cria um modelo service
public class DadosService {
    @Autowired
    private DadosRepository repositorio;

    public DadosDTO obterFrases(){
        Dados frase = repositorio.obterFrasesAleatorias();
        return new DadosDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }

}
