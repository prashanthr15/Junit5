package dao;

public class SpringBootCourse implements Course {

	@Override
	public boolean coursePurchased() {
		// TODO Auto-generated method stub
		System.out.println("SpringBootCourse purchased");
		return true;
	}

	
}
