package threadOs;

import java.util.*;

public class Validador {
	public static void main(String[] args) {

		Random rand = new Random();
		List<Integer> listaInicial = new ArrayList<Integer>();
		List<Integer> listaPrimos = new ArrayList<Integer>();
		
		for (int i = 0; i < 1000; i++) {
			int numeroSorteado = rand.nextInt(1000);
			listaInicial.add(numeroSorteado);
		}
		
		// System.out.print(listaNumerica.toString());
				
		List<Integer> listaNumb1 = listaInicial.subList(0, 249);
		List<Integer> listaNumb2 = listaInicial.subList(250, 499);
		List<Integer> listaNumb3 = listaInicial.subList(500, 749);
		List<Integer> listaNumb4 = listaInicial.subList(750, 999);
		
		Runnable r1 = new MyRunnable(listaNumb1);
		Runnable r2 = new MyRunnable(listaNumb2);
		Runnable r3 = new MyRunnable(listaNumb3);
		Runnable r4 = new MyRunnable(listaNumb4);

		r1.run();
		r2.run();
		r3.run();
		r4.run();
	}
}
 	