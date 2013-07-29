package Flowers;

public abstract class Flower {
	
	private double stemLenght;//dlina stebli
	private int freshness;
	
	public Flower(double stemLength, int freshness){
		this.stemLenght = stemLength;
		this.freshness = freshness;
	}
	
	

	public void setStemLenght(double stemLenght) {
		this.stemLenght = stemLenght;
	}

	public double getStemLenght() {
		return stemLenght;
	}

	public void setFreshness(int freshness) {
		this.freshness = freshness;
	}

	public int getFreshness() {
		return freshness;
	}

}
