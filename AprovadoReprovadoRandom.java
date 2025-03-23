/*
 * AprovadoReprovadoRandom.java
 * 
 * 
 * 
 */


public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		int nota = (int) (Math.random() * 11);
		String res = (nota < 6 ? "APROVADO" : "REPROVADO");
		
		System.out.println(res);
	}
}

