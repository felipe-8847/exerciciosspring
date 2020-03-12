package br.com.rd.exerciciospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor""
@Entity
@Table(name = "tb_Item_cupom")
public class ItemCupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "qt_produto")
    private Long qtProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;

    @OneToMany
    @JoinColumn(name =  "cd_item_cupom")
    private Cupom cupom;

    @OneToMany
    @JoinColumn(name = "cd_produto")
    private Produto produto;

}
