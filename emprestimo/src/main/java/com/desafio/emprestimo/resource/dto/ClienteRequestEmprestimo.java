package com.desafio.emprestimo.resource.dto;

import com.desafio.emprestimo.domain.Cliente;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record ClienteRequestEmprestimo(@Min(value = 18) Integer idade,
                                       @CPF String cpf,
                                       @NotBlank String nome,
                                       @NotNull Double salario,
                                       @NotBlank String localizacao) {

    public Cliente toCliente() {
        return new Cliente(
          idade, cpf, nome, salario, localizacao
        );
    }
}
