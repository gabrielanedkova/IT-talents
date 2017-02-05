
public class Demo {

	public static void main(String[] args) {
		Computer asus = new Computer();
		Computer lenovo = new Computer(2015, 1999.99, 1000000, 89999);
		Computer dell = new Computer(2013, 1569, true, 1000000, 34421, "Windows 10");
		Computer samsung = new Computer();
		
		int result = lenovo.comparePrice(dell);
		if (result == -1)
			System.out.println("Lenovo is more expensive than Dell");
		else if (result == 1)
			System.out.println("Dell is more expensive than Lenovo");
		else System.out.println("Their prices are equal");
	}

}
