package Bouquet;

import Flowers.Dahlia;
import Flowers.Rose;
import decor.Decor;

public class Bouquet implements Decor {
	private int roseCount;
	private int dahliaCount;
	private double cost = 0;

	private Rose rose[];
	private Dahlia dahlia[];

	public Bouquet(int roseCount, int dahliaCount) {
		
		rose = new Rose[roseCount];
		dahlia = new Dahlia[dahliaCount];
		this.roseCount = roseCount;
		this.dahliaCount = dahliaCount;
		createBouquet();
	}

	// sozdaem buket iz roz i georginov
	private void createBouquet() {

		for (int i = 0; i < roseCount; i++) {
			rose[i] = new Rose();
			cost = cost + rose[i].cost;
		}

		for (int i = 0; i < dahliaCount; i++) {
			dahlia[i] = new Dahlia();
			cost = cost + dahlia[i].cost;
		}
	}

	@Override
	public void useAccessories() {
		cost = cost + costTape;
	}

	public void printSum() {
		System.out.println("Цена букета = "+ cost);
	}

}
