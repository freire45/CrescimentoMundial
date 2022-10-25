package br.com.erickfreire.crescimentomundial;

import java.util.Scanner;

public class CrescimentoMundial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double populacao;
		double taxa;
		double calculo = 0.0;
		
		System.out.println("Programa que calcula a taxa de crescimento mundial: ");
		System.out.print("Informe o tamanho da população mundial em bilhões: ");
		populacao = entrada.nextDouble();
		
		System.out.print("Informe a taxa de crescimento: ");
		taxa = entrada.nextDouble();
		
		calculo = populacao + (populacao * (taxa / 100));
		
		System.out.printf("Primeiro Ano: %.2f%n", calculo);
		
		calculo = calculo + (calculo * (taxa / 100));
		
        System.out.printf("Segundo Ano: %.2f%n", calculo);
		
		calculo = calculo + (calculo * (taxa / 100));
		
        System.out.printf("Terceiro Ano: %.2f%n", calculo);
		
		calculo = calculo + (calculo * (taxa / 100));
		
        System.out.printf("Quarto Ano: %.2f%n", calculo);
		
		calculo = calculo + (calculo * (taxa / 100));
		
        System.out.printf("Quinto Ano: %.2f%n", calculo);
		
		calculo = calculo + (calculo * (taxa / 100));

	}

}
