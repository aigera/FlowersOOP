package run;

import Bouquet.Bouquet;

public class Runner {

	public static void main(String[] args) {

		Bouquet bouquet = new Bouquet(4, 5); // создаем букет из 4 роз и 5
												// георгин
		bouquet.useAccessories();
		
		bouquet.printSum();
	}

}
