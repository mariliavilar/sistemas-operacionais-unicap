package threadOs;

import java.util.List;

public class MyRunnable implements Runnable {
	
	List<Integer> listaVerificacao;
	int totalPrimos;
	
	public MyRunnable(List<Integer> listaRecebida) {
		listaVerificacao = List.copyOf(listaRecebida);
		totalPrimos = 0;
	}

	@Override
	public void run() {
				
		for (int i = 0; i < listaVerificacao.size(); i++) {
			int numero = listaVerificacao.get(i);
			
			boolean ePrimo = VerificarPrimo(numero);
			
			if (ePrimo) {
				totalPrimos++;
			}
		}
		
		System.out.print("O total de primos da thread foi de: ");
		System.out.println(totalPrimos);
	}
	
	public boolean VerificarPrimo (int numero) {
		 if (numero <= 1) {			 
			 return false;
		 }
		 
		 for (int i = 2; i < numero; i++) {
			 if (numero % i == 0) {				 
				 return false;
			 }
		 }
	     return true;		
	}

}
