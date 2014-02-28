import java.text.NumberFormat;				//importing formats

abstract public class Animal {
	
	protected String type, name, size, color;
	protected int idNum;
	protected double price;					//Protected Instance Variables
	
	public Animal(String type, String name, String size, String color, int idNum, double price) {
		this.type = type;
		this.name = name;
		this.size = size;
		this.color = color;			//Constructor for Parent
		this.idNum = idNum;
		this.price = price;
	}
	
	public int getId() {
		return idNum;		//Gets the id number
	}
	
	public abstract String isNeutered();
	public abstract String hasClaws();			//Abstract methods for Children Classes
	
	public String toString() {					//Parent toString
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String form = "\nAnimal:\t"+type+"\nName:\t"+name+"\nSize:\t"+size+"\nColor:\t"+color
				+"\nID:\t"+idNum+"\nPrice:\t"+fmt.format(price);
		return form;
	}
}
