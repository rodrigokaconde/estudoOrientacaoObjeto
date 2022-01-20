package com.rfoliveira.bancoApi;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void listarClientes(){
        System.out.println(String.format("=========== Clientes do Banco %s ============", this.nome));
        for (Conta conta : contas){
            System.out.println("Cliente: "+conta.getCliente().getNome());
        }
    }
}
