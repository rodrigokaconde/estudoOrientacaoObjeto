package com.rfoliveira.bancoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BancoApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BancoApiApplication.class, args);

		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo");

		Conta cc = new ContaCorrente(rodrigo);
		Conta poupanca = new ContaPoupanca(rodrigo);

		Banco banco = new Banco();
		List<Conta> contas = new ArrayList<>();

		cc.depositar(100);

		cc.transferir(50, poupanca);
		cc.imprimirExtrato();

		poupanca.imprimirExtrato();
		contas.add(cc);

		contas.add(poupanca);
		banco.setContas(contas);
		banco.setNome("Banco Atual");
		banco.listarClientes();

	}

}
