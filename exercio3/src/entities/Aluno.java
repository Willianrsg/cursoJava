package entities;

public class Aluno {
	public String nome;
	public double primeiro, segundo, terceiro;
	
	public double notaFinal() {
		return primeiro + segundo + terceiro;
		
	}

	public double mediaPontos() {
		if (notaFinal() < 60.0 ){
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
		
	}
}
