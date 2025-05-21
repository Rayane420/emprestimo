package com.desafio.emprestimo.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cliente {
    private Integer idade;
    private String cpf;
    private String nome;
    private Double salario;
    private String localizacao;

    public boolean salarioMenorOuIgual(double valor) {
        return salario <= valor;
    }

    public boolean salarioMaiorOuIgual(double valor) {
        return salario >= valor;
    }

    public boolean salarioEstaEntre(double valorMin, double valorMax){
        return salario >= valorMin && salario <= valorMax;
    }

    public boolean idadeMenorQue(int valorIdade){
        return idade < valorIdade;
    }

    public boolean residenciaSP(String local){
        return this.localizacao.equalsIgnoreCase(local);
    }
}
