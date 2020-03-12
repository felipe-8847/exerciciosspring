package br.com.rd.exerciciospring.services;


import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CupomServices {

    @Autowired
    CupomRepository repository;
}
