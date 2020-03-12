package br.com.rd.exerciciospring.controller;


import br.com.rd.exerciciospring.model.Produto;
import br.com.rd.exerciciospring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/consuta")
    public Optional<Produto> cunsultar(@PathVariable("id") Long id)
    {return produtoRepository.findById();}
}
