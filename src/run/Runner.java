package run;

import Bouquet.Bouquet;

public class Runner {

	public static void main(String[] args) {

		

		Bouquet bouquet = new Bouquet(4, 5); // sozdaem buket iz 4 roz i 5 georginov										
		
		bouquet.useAccessories();		
		
		bouquet.printSum();
	}

}
