package br.com.rd.exerciciospring.repository;


import br.com.rd.exerciciospring.model.ItemCupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCupomRepository extends JpaRepository<ItemCupom, Long> {
}
