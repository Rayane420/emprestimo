package com.desafio.emprestimo.factory;

import com.desafio.emprestimo.domain.Cliente;

public class ClienteFactory {
    public static Cliente build(){
        return new Cliente(25, "5135415454", "Ray Teste", 5000.00, "SP");
    }

    public static Cliente build(Double salario){
        return new Cliente(25, "5135415454", "Ray Teste", salario, "SP");
    }
}
