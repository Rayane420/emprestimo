package com.desafio.emprestimo.resource.dto;

import com.desafio.emprestimo.domain.TiposEmprestimo;

public record EmprestimoResponse(TiposEmprestimo tipo,
                                 Double taxaJuros) {
}
