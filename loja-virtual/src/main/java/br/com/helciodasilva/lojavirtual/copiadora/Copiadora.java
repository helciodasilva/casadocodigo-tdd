package br.com.helciodasilva.lojavirtual.copiadora;

public class Copiadora {
	private Escritor escritor;
	private Leitor leitor;

	public Copiadora(Leitor leitor, Escritor escritor) {
		this.leitor = leitor;
		this.escritor = escritor;
	}

	public void copiar() {
		LeitorDeXML leitor = new LeitorDeXML();
		EscritorPelaSerial escritor = new EscritorPelaSerial();
		while (leitor.temCaracteres()) {
			escritor.escreve(leitor.leCaracteres());
		}
	}
}
