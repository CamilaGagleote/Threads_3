package controller;

public class ThreadVet extends Thread{
	private int vet[];
	private int num;
	public ThreadVet(int vet[], int numero) {
		this.vet = vet;
		this.num = numero;
	}
	public void run(){
		ThreadVetor();
	}

		public void ThreadVetor() {
			if (num % 2 == 0){
				int length = vet.length;
				double tempInic = System.nanoTime(); 
				for(int i=0; i<length; i++) {
					System.out.println(vet[i]);
				}
				double tempFin = System.nanoTime();
				double tempTot = tempFin - tempInic;
				tempTot = tempTot / Math.pow(10, 9);
				System.out.println("Tempo total número par ==> " + tempTot);
			}
			else {
				double tempInic2 = System.nanoTime(); 
				for(int i : vet) {
					System.out.println(vet[i]);
				}
				double tempFin2 = System.nanoTime();
				double tempTot2 = tempFin2 - tempInic2;
				tempTot2 = tempTot2 / Math.pow(10, 9);
				System.out.println("Tempo total número ímpar ==> " + tempTot2);
				
			}
		}
}
	