package com.Emanuel.GeradorDeFrases.Repository;

import com.Emanuel.GeradorDeFrases.Model.Dados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DadosRepository extends JpaRepository<Dados, Long> {

    @Query("SELECT d FROM Dados d ORDER BY function('RANDOM') LIMIT 1")
    Dados obterFrasesAleatorias();
}
