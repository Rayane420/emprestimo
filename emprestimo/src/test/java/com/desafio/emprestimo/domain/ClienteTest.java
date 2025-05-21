package com.desafio.emprestimo.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClienteTest {

    //Criando classe de teste interna
    @Nested
    class renda_igual_ou_menor_que{

        @Test
        void deve_ser_true_quando_salario_igual() {
            var cliente = new Cliente(25, "5135415454", "Ray Teste", 5000.00, "SP");

            assertTrue(cliente.salarioMenorOuIgual(5000.0));
        }

        @Test
        void deve_ser_false_quando_salario_maior() {
            var cliente = new Cliente(25, "5135415454", "Ray Teste", 5000.00, "SP");

            assertFalse(cliente.salarioMenorOuIgual(3000.0));
        }
    }
}