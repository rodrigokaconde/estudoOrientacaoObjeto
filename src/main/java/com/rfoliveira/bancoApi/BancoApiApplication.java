package com.rfoliveira.bancoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BancoApiApplication.class, args);

		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo");

		Conta cc = new ContaCorrente(rodrigo);
		Conta poupanca = new ContaPoupanca(rodrigo);

		cc.depositar(100);

		cc.transferir(50, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
