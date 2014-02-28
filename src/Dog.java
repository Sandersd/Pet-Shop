public class Dog extends Animal {
	
	private String neutered;			//Only one new instance variable	
	
	public Dog(String type, String name, String size, String color, int idNum, double price, String neutered) {
		super(type, name, size, color, idNum, price);
		this.neutered = neutered;		//Parent constructor with new variable
	}
	
	public String isNeutered() {		//Are they neutered?
		return neutered;
	}
	
	public String hasClaws() {			//Does not Apply
		return null;
	}
	
	public String toString() {
		String form = super.toString() +"\nNeutered:\t"+neutered;
		return form;					//Parent toString with new variable
	}
}
