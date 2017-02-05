
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		{
			if (year > 1832)
				this.year = year;
			if (price > 0)
				this.price = price;
			if (hardDiskMemory > 0)
				this.hardDiskMemory = hardDiskMemory;
			if (freeMemory > 0 && freeMemory < hardDiskMemory)
				this.freeMemory = freeMemory;
		}
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		if (operationSystem != null)
			this.operationSystem = operationSystem;
	}

	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null)
			operationSystem = newOperationSystem;
	}
	
	int comparePrice(Computer c){
		if (this.price > c.price)
			return -1;
		if (this.price > c.price)
			return 1;
		return 0;
	}

	void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
			return;
		}
		freeMemory -= memory;
	}
}
