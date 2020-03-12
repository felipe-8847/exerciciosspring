package br.com.rd.exerciciospring.repository;


import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {
}
