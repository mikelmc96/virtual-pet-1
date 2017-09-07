import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet myPet = new VirtualPet();
		myPet.name = "Panchu";

		System.out.println("\t\tWelcome to Virtual Pet!  \n\tPanchu the Elephant needs your help!\n");
		String userOption;
		while (myPet.myPetIsAlive() == true) {
			do {
				myPet.showMenu();
				userOption = input.next();
			} while (!userOption.equals("1") && !userOption.equals("2") && !userOption.equals("3")
					&& !userOption.equals("4"));
			switch (userOption) {
			case "1":
				myPet.play();
				myPet.tick();
				System.out.println("Now " + myPet.name + " is excited!");
				break;
			case "2":
				myPet.feed();
				myPet.tick();
				System.out.println("Now " + myPet.name + " is full!");
				break;
			case "3":
				myPet.sleep();
				myPet.tick();
				System.out.println("Now " + myPet.name + " has lots of energy!");
				break;
			case "4":
				myPet.tick();
				myPet.showStatus();
			}
		}
		if (myPet.myPetIsAlive() == false) {
			System.out.println("Uh oh!  You killed " + myPet.name);
			System.exit(0);
		}
		input.close();
	}
}
