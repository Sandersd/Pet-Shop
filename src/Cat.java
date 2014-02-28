
public class Cat extends Animal {
	
	private String claws, neutered;		//New Instance Variables
	
	public Cat(String type, String name, String size, String color, int idNum, double price, String neutered, String claws) {
		super(type, name, size, color, idNum, price);
		this.neutered = neutered;
		this.claws = claws;			//Using Parent's Constructor with new variables
	}
	
	public String isNeutered() {
		return neutered;				//Are they neutered?
	}
	
	public String hasClaws() {
		return claws;					//Do they have claws?
	}
	
	public String toString() {
		String form = super.toString() +"\nNeutered:"+neutered+"\nClaws:\t"+claws;
		return form;					//Parent toString with new variables
	}
}
