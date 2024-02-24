package dao;

public class Junitcourse implements Course{

	@Override
	public boolean coursePurchased() {
		
		System.out.println("Junitcourse purchased");
		return true;
		
	}
}
