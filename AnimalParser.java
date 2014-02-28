
public class AnimalParser {
	
	public static Animal parseStringToAnimal(String lineToParse) {
		
		String[] words = lineToParse.trim().split("/");		//Setting up Parse
		String type = words[0];
		String name = words[1];
		String size = words[2];
		String color = words[3];
		int id = Integer.parseInt(words[4]);
		double price = Double.parseDouble(words[5]);		//Storing info in array
		String neutered;
		String claws;
		
		if(type.equalsIgnoreCase("cat")) {			//Uses both new variables
			neutered = words[6];
			claws = words[7];
			Cat animalParser = new Cat(type, name, size, color, id, price, neutered, claws);
			return animalParser;
		}
		else if(type.equalsIgnoreCase("dog")) {		//Uses "neutered" new variable
			neutered = words[6];
			Dog animalParser = new Dog(type, name, size, color, id, price, neutered);
			return animalParser;
		}
		else {										//Uses inherited variables only
			Bird animalParser = new Bird(type, name, size, color, id, price);
			return animalParser;
		}
	}
}
