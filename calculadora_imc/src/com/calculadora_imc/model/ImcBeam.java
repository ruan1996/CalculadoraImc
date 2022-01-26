package com.calculadora_imc.model;

import java.text.DecimalFormat;

public class ImcBeam {

	private float peso;
	private float altura;
	public ImcBeam() {
		
	}
	
		public ImcBeam(String peso, String altura) {
			
			setPeso(peso);
			setAltura(altura);
		}
		public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+")==false ? 0f:Float.parseFloat(peso));
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+")==false ? 0f:Float.parseFloat(altura));
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public String getResult() {
		Float imc = peso / (altura * 2);
		StringBuilder result = new StringBuilder("Seu IMC = "+ new DecimalFormat("#.##").format(imc));
		if(imc.isNaN())
			return "deu ruim";
		if(imc<15) {
			result.append("Você é um atleta");
		}else {
			result.append("Você está fora do peso");
		}
		return result.toString();
		
	}
	@Override
	public String toString() {
		return "ImcBeam [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}

	}
	

