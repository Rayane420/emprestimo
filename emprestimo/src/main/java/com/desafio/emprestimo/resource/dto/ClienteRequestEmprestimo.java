package com.desafio.emprestimo.resource.dto;

import com.desafio.emprestimo.domain.Cliente;

public record ClienteRequestEmprestimo(Integer idade,
                                       String cpf,
                                       String nome,
                                       Double salario,
                                       String localizacao) {

    public Cliente toCliente() {
        return new Cliente(
          idade, cpf, nome, salario, localizacao
        );
    }
}
