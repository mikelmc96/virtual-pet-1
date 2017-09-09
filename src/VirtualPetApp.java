import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet myPet = new VirtualPet();
		myPet.name = "Panchu";

		System.out.println("\t\tWelcome to Virtual Pet!  \n\tPanchu the Elephant needs your help!\n");
		System.out.println(myPet.showHappyPicture());
		String userOption;
		while (myPet.myPetIsAlive() == true) {
			do {
				System.out.println(myPet.showMenu());
				userOption = input.next();
			} while (!userOption.equals("1") && !userOption.equals("2") && !userOption.equals("3")
					&& !userOption.equals("4") && !userOption.equals("5"));
			switch (userOption) {
			case "1":
				myPet.play();
				myPet.tick();
				if (myPet.myPetIsAlive()==true) {
				System.out.println("Now " + myPet.name + " is excited!");
				System.out.println(myPet.dangerZone());}
				break;
			case "2":
				myPet.feed();
				myPet.tick();
				if (myPet.myPetIsAlive()==true) {
				System.out.println("Now " + myPet.name + " is full!");
				System.out.println(myPet.dangerZone());}
				break;
			case "3":
				myPet.sleep();
				myPet.tick();
				if (myPet.myPetIsAlive()==true) {
				System.out.println("Now " + myPet.name + " has lots of energy!");
				System.out.println(myPet.dangerZone());}
				break;
			case "4":
				myPet.bathe();
				myPet.tick();
				System.out.println(myPet.showBathingPicture());
				if (myPet.myPetIsAlive()==true) {
				System.out.println("Now " + myPet.name + " is so fresh and so clean!");
				System.out.println(myPet.dangerZone());}
				break;
			case "5":
				System.out.println(myPet.showStatus());
				break;
			}
		}
		if (myPet.myPetIsAlive() == false) {
			System.out.println(
					"Uh oh!  You killed " + myPet.name + "\n" + myPet.name + " died of " + myPet.causeOfDeath());
			System.out.println(myPet.showElephantAngelPicture());
			System.exit(0);
		}
		input.close();
	}
}
