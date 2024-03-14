package view;

import java.util.Random;

import controller.ThreadVet;
public class Main {

	public static void main(String[] args) {
		
		int vet[] = new int [1000];
		Random r = new Random();
		int numero = r.nextInt(50);
		System.out.println("Numero: " + numero);
		
		for(int i =0; i < 1000; i++) {
			vet[i]= r.nextInt(101);
			System.out.println(vet[i]);
		}
		
		for(int i=0; i<1;i++) {
			Thread ThreadVetor = new ThreadVet(vet, numero);
			ThreadVetor.start();
		}

	}

}
