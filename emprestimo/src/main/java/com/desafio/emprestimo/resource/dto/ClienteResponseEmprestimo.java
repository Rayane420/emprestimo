package com.desafio.emprestimo.resource.dto;

import java.util.List;

public record ClienteResponseEmprestimo(String cliente,
                                        List<EmprestimoResponse> emprestimos) {
}
