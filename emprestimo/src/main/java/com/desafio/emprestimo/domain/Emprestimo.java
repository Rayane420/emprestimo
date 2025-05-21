package com.desafio.emprestimo.domain;

import com.desafio.emprestimo.domain.exception.EmprestimoIndisponivelException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Emprestimo {

    private Cliente cliente;

    public boolean emprestimoPessoalDisponivel(){
        return avaliacaoBasicaDeEmprestimo();
    }

    public boolean emprestimoConsignadoDisponivel(){
        return cliente.salarioMaiorOuIgual(5000.0);
    }

    public boolean emprestimoGarantiaDisponivel(){
        return avaliacaoBasicaDeEmprestimo();
    }

    public double taxaDeJurosEmprestimoPessoal(){
        if (emprestimoPessoalDisponivel()){
            return 4.0;
        }
        throw new EmprestimoIndisponivelException();
    }

    public double taxaDeJurosEmprestimoConsignado(){
        if (emprestimoConsignadoDisponivel()){
            return 2.0;
        }
        throw new EmprestimoIndisponivelException();
    }

    public double taxaDeJurosEmprestimoGarantia(){
        if (emprestimoGarantiaDisponivel()){
            return 3.0;
        }
        throw new EmprestimoIndisponivelException();
    }

    private boolean avaliacaoBasicaDeEmprestimo() {
        if(cliente.salarioMenorOuIgual(3000.0)){
            return true;
        }
        return cliente.salarioEstaEntre(3000.0, 5000.0)
                && cliente.idadeMenorQue(30)
                && cliente.residenciaSP("SP");
    }


}
