package Bouquet;

import java.util.Arrays;

import Flowers.Dahlia;
import Flowers.Rose;
import decor.Decor;
import decor.Pack;

public class Bouquet implements Decor {
	private int roseCount;
	private int dahliaCount;
	private double cost = 0;

	private Rose rose[];
	private Dahlia dahlia[];
	private Pack pack; // упаковка

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
			rose[i] = new Rose((int) (Math.random() * 10 + 5), 2);
		}

		for (int i = 0; i < dahliaCount; i++) {
			dahlia[i] = new Dahlia((int) (Math.random() * 10 + 5), 2);
		}
	}

	private double calculateCost() {
		for (Dahlia d : dahlia) {
			cost += d.cost;
		}
		for (Rose r : rose) {
			cost += r.cost;
		}
		return cost;
	}

	@Override
	public void useAccessories() {
		pack = new Pack();
		cost += pack.cost;
	}

	public void printSum() {
		System.out.println("Цена букета = " + (cost + calculateCost()));
	}

}
