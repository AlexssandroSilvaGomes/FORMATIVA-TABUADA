package br.senai.sp.jandira.model;

public class Multiplicacao {
	
	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	 	
	public String[] getTabuada() {
		
		int tamanhoVetor = maxMultiplicador - minMultiplicador + 1;
		String[] tabuada = new String[tamanhoVetor];
		int i = 0;
		
		while (minMultiplicador <= maxMultiplicador) {
			
			int produto = multiplicando * minMultiplicador;
			String resultado = multiplicando + " X " + minMultiplicador + " = " + produto;
			
			tabuada[i] = resultado;
			
			minMultiplicador++;
			i++;
		}
		
		return tabuada;
	}
}
