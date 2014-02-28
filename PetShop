import java.util.*;

public class PetShop {

	public static void main(String[] args) {
		
		char choice;
		String line, input;
		int idNum;
		boolean found = false;					//Local Variables
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();		//ArrayList object to store Animal objects
		printMenu();			//Display Menu
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("What would you like to do?");
			
			try {
				line = scan.nextLine().trim();
				choice = line.charAt(0);
				choice = Character.toUpperCase(choice);		
			}catch(StringIndexOutOfBoundsException e) {			//Catching Exception
				//Do nothing
				choice = scan.nextLine().charAt(0);
				choice = Character.toUpperCase(choice);
			}
			
			switch(choice) {
			case 'A':			//Add Animal
				System.out.println("Enter Animal info in the following format:");
				System.err.println("\ntype/name/size/color/id/price/neutered/claws");
				input = scan.nextLine().trim();
				Animal animal1 = AnimalParser.parseStringToAnimal(input);		//Adding and Parsing
				animalList.add(animal1);
				break;
			case 'F':			//Find Animal
				System.out.println("Enter ID number to find");
				idNum = scan.nextInt();
				
				found = false;
				for(int i=0; i<animalList.size();i++) {			//Searches for id number
					if(idNum==animalList.get(i).getId()) {
						found = true;
					}
				}
				
				if(found==true) 
					System.out.println("Animal is in the shop.");
				else if(found==false)
					System.err.println("Animal is not in the shop.");
				break;
			case 'R':			//Remove Animal
				System.out.println("Enter ID number to remove");
				idNum = scan.nextInt();
				
				found = false;
				for(int i=0; i<animalList.size();i++) {
					if(idNum==animalList.get(i).getId()) {
						found = true;
						animalList.remove(i);
					}
				}
				if(found==true) 
					System.out.println("Animal has been removed.");
				else
					System.err.println("Animal is not in the shop.");
				break;
			case 'L':			//List Animals
				if(animalList.size()>0) {
            		for(int i=0; i<animalList.size();i++) {
            			System.out.println(animalList.get(i).toString());		//toString to print objects
            		}
            	}
            	else
            		System.out.println("No animals in the shop.");
               break;
             case 'Q':  		//Quit
               break;
             case '?':   		//Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
			}
		} while(choice!='Q');		//Quit when Q is read
	}
	
	public static void printMenu() {
		
		System.out.print("A\t\tAdd Animal\n" +
                "F\t\tFind Animal\n" +
                "R\t\tRemove Animal\n" +
                "L\t\tList Animals\n" +
                "Q\t\tQuit\n" +
                "?\t\tDisplay Options\n\n");
	}

	

}
