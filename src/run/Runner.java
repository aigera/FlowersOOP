package run;

import Bouquet.Bouquet;

public class Runner {

	public static void main(String[] args) {

		Bouquet bouquet = new Bouquet(4, 5); // ������� ����� �� 4 ��� � 5
												// �������
		bouquet.useAccessories();
		
		bouquet.printSum();
	}

}
