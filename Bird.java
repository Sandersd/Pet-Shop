
public class Bird extends Animal {
	
	public Bird(String type, String name, String size, String color, int idNum, double price) {
		super(type, name, size, color, idNum, price);		//Using Parent's constructor
		
	}
	
	public String isNeutered() {		//Does not Apply
		return null;
	}
	
	public String hasClaws() {		//Does not Apply
		return null;
	}
	
	public String toString() {
		String form = super.toString();		//Does not Apply, uses Parent's toString
		return form;
	}
}
