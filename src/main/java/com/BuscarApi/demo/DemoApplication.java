package com.BuscarApi.demo;

import com.BuscarApi.demo.CEP.ConsultaCep;
import com.BuscarApi.demo.CEP.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ConsultaCep consultaCep = new ConsultaCep();

		System.out.println("Digite o CEP: ");
		var cep = ler.nextLine();

		try {
			Endereco endereco = consultaCep.buscarEndereco(cep);
			System.out.println(endereco.bairro());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Erro");
		}


	}
}
