package ar.edu.unlam.trabajo.practico1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circulo {

	private Double perimetro;
	private Double area;
	private Double radio;
	
	private DecimalFormat formato = new DecimalFormat("#0.00");
	
	//Construcor con Radio
	public Circulo(Double radio) {
		formato.setRoundingMode(RoundingMode.DOWN);
		this.radio = radio;
		calcularPerimetro();
		calcularArea();
	}
	
	private void calcularArea() {
		area = radio * radio * Math.PI;
	}
	
	private void calcularPerimetro() {
		perimetro = 2 * Math.PI * radio;
	}
	
	public String getPerimetroTruncado() {
		return formato.format(perimetro);
	}
	
	public String getAreaTruncada() {
		return formato.format(area);
	}
	
	public Double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
}
