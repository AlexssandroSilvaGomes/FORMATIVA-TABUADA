package br.senai.sp.jandira.model;

public class Multiplicacao {
	
	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	 	
	public void getTabuada() {
		while (minMultiplicador <= maxMultiplicador) {
			
			int res = multiplicando * minMultiplicador;
			System.out.println(multiplicando + "X" + minMultiplicador + "=" + res);
			minMultiplicador++;
		}
	}
}
