package com.valdonet.primeiraescolha.estoque.model;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import com.valdonet.primeiraescolha.produto.model.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@IdClass(ProdutoFornecedorPK.class)
@Table(name = "estoque")
public class Estoque {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_produto")
    private Produto produto;

}
