
public class VirtualPet {

	public String name;
	int interest = 5;
	int hunger = 5;
	int energy = 5;

	public void showMenu() {
		System.out.println("What would you like to do? \n\tPress 1 to play with " + name + "\n\tPress 2 to feed " + name
				+ "\n\tPress 3 to make " + name + " sleep" + "\n\tPress 4 to show " + name + "'s status\n");
	}

	public void showStatus() {
		System.out.println("\t" + name + "'s interest level is " + interest + "\n\t" + name + "'s hunger level is "
				+ hunger + "\n\t" + name + "'s energy level is " + energy);
	}

	public void tick() {
		interest -= 1;
		hunger -= 1;
		energy -= 1;
	}

	public void play() {
		interest += 3;
		energy -= 1;
	}

	public void feed() {
		hunger += 3;
		energy -= 1;
	}

	public void sleep() {
		energy += 3;
		interest -= 1;
		hunger -= 1;
	}

	boolean myPetIsAlive() {
		if (energy > 0 && interest > 0 && energy > 0) {
			return true;
		}
		return false;

	}
}