package entities;

import entities.enums.Color;

public abstract class Shape {

	private Color color;
	
	//Construtor padrão
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	//Padrão para forçar o programador que for usar a minha classe, implemente
	//este método!
	public abstract double area();
}
