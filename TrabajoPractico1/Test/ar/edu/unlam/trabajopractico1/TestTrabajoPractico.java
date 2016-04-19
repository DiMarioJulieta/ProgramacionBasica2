package ar.edu.unlam.trabajopractico1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestTrabajoPractico {

	private DecimalFormat formato = new DecimalFormat("#0.00");

	@Test
	public void init() {
		formato.setRoundingMode(RoundingMode.DOWN);
	}

	@Test
	public void debeCrearRadiosCorrectos() {

		// Dado que
		Circulo miCirculo;

		// Cuando
		miCirculo = new Circulo(new Double(3.7));
		// Entonces
		Assert.assertEquals(new Double(3.7), miCirculo.getRadio());

		// Cuando
		miCirculo = new Circulo(new Double(5));
		// Entonces
		Assert.assertEquals(new Double(5), miCirculo.getRadio());

		// Cuando
		miCirculo = new Circulo(new Double(10.9));
		// Entonces
		Assert.assertEquals(new Double(10.9), miCirculo.getRadio());

	}

	@Test
	public void debeTenerPerimetroCorrecto() {
		Circulo miCirculo = new Circulo(new Double(9.8));
		Assert.assertEquals("61,57", formato.format(miCirculo.getPerimetro()));
	}

	@Test
	public void debeTenerAreaCorrecta() {
		Circulo miCirculo = new Circulo(new Double(16.6));
		Assert.assertEquals("865,67", formato.format(miCirculo.getArea()));
	}
}
