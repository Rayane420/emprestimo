package com.desafio.emprestimo.service;

import com.desafio.emprestimo.domain.Emprestimo;
import com.desafio.emprestimo.domain.TiposEmprestimo;
import com.desafio.emprestimo.resource.dto.ClienteRequestEmprestimo;
import com.desafio.emprestimo.resource.dto.ClienteResponseEmprestimo;
import com.desafio.emprestimo.resource.dto.EmprestimoResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmprestimoService {

    public ClienteResponseEmprestimo verificarEmprestimosDisponiveis(ClienteRequestEmprestimo clienteRequest){

        var cliente = clienteRequest.toCliente();
        var emprestimo = new Emprestimo(cliente);

        List<EmprestimoResponse> emprestimos = new ArrayList<>();

        if (emprestimo.emprestimoPessoalDisponivel()) {
            emprestimos.add(new EmprestimoResponse(TiposEmprestimo.PESSOAL, emprestimo.taxaDeJurosEmprestimoPessoal()));
        }

        if (emprestimo.emprestimoConsignadoDisponivel()) {
            emprestimos.add(new EmprestimoResponse(TiposEmprestimo.CONSIGNADO, emprestimo.taxaDeJurosEmprestimoConsignado()));
        }

        if (emprestimo.emprestimoGarantiaDisponivel()) {
            emprestimos.add(new EmprestimoResponse(TiposEmprestimo.GARANTIDO, emprestimo.taxaDeJurosEmprestimoGarantia()));
        }



        return new ClienteResponseEmprestimo(clienteRequest.nome(), emprestimos);
    }
}
