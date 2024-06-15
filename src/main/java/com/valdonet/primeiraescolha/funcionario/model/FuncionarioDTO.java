package com.valdonet.primeiraescolha.funcionario.model;

import com.valdonet.primeiraescolha.pessoa.model.Pessoa;
import lombok.Data;

@Data
public class FuncionarioDTO {

    private String cpf;

    private Pessoa pessoa;

}
