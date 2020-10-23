package br.com.helciodasilva.lojavirtual.copiadora;

import org.junit.Test;
import org.mockito.Mockito;

public class CopiadoraTeste {
	@Test
	public void deveLerEEnviarOConteudoLido() {
		Escritor e = Mockito.mock(Escritor.class);
		Leitor l = Mockito.mock(Leitor.class);
		Mockito.when(l.temCaracteres()).thenReturn(true, false);
		Mockito.when(l.leCaracteres()).thenReturn("mauricio");
		Copiadora c = new Copiadora(l, e);
		c.copiar();
		Mockito.verify(e).escreve("mauricio");
	}

}
