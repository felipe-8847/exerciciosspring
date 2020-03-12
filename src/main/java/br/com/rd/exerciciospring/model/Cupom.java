package br.com.rd.exerciciospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cumpom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "dt_venda")
    @Temporal(value = TemporalType.TIMESTAMP)
    private  String dtPedido;

    @Column(name = "vl_venda")
    private BigDecimal vlVenda;



}
