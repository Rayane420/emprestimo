package com.desafio.emprestimo.resource;

import com.desafio.emprestimo.resource.dto.ClienteRequestEmprestimo;
import com.desafio.emprestimo.resource.dto.ClienteResponseEmprestimo;
import com.desafio.emprestimo.service.EmprestimoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmprestimoResource {

    private EmprestimoService emprestimoService;

    public EmprestimoResource(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping("/customer-loans")
    public ResponseEntity<ClienteResponseEmprestimo> customerLoans(@Valid @RequestBody ClienteRequestEmprestimo clienteRequest){
        var emprestimoResponse = emprestimoService.verificarEmprestimosDisponiveis(clienteRequest);
        return ResponseEntity.ok(emprestimoResponse);
    }

}
