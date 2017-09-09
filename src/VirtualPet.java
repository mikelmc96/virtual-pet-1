import java.util.Random;

public class VirtualPet {

	public String name;
	int interest = 10;
	int hunger = 10;
	int energy = 10;
	int hygiene = 10;
	String [] exclamatoryMessage = {"Great job!", "Excellent!", "Fantastic!", "Right on!", "Alright!"};

	public String showMenu() {
		return "What would you like to do? \n\tPress 1 to play with " + name + "\n\tPress 2 to feed " + name
				+ "\n\tPress 3 to make " + name + " sleep" + "\n\tPress 4 to give " + name
				+ " a bath\n\tPress 5 to see how " + name + " is doing\n";
	}

	public void tick() {
		interest -= 1;
		hunger -= 1;
		energy -= 1;
		hygiene -= 1;
	}

	public void play() {
		interest += 5;
		energy -= 3;
		hygiene -=1;
	}

	public void feed() {
		hunger += 5;
		energy -= 1;
		hygiene -= 2;
	}

	public void sleep() {
		energy += 10;
		interest -= 3;
		hunger -= 3;
		hygiene -=1;
	}

	public void bathe() {
		hygiene += 7;
		interest -= 1;
		energy -= 1;
		hunger -= 1;
	}

	public String showStatus() {
		return "\t" + name + "'s interest:  " + interest + "\n\t" + name + "'s satiety: " + hunger
				+ "\n\t" + name + "'s energy level is " + energy + "\n\t" + name + "'s hygiene: " + hygiene;
	}

	boolean myPetIsAlive() {
		if (energy > 0 && interest > 0 && energy > 0 && hygiene > 0) {
			return true;
		}
		return false;
	}

	public String showPicture() {
		return ("\t                      ____\n\t                .---'-    \\\n\t     .-----------/           \\\n\t     /           (         ^  |   __\n\t&   (             \\        O  /  / .'\n\t'._/(              '-'  (.   (_.' /\n\t     \\                    \\     ./\n\t      |    |       |    |/ '._.'\n\t       )   @).____\\|  @ |\n\t   .  /    /       (    |\n\t  \\|, '_:::\\  . ..  '_:::\\ ..\\)\n");
	}
	Random random = new Random();
	int i =random.nextInt(exclamatoryMessage.length);
	public String dangerZone() {
		if (energy==1 || energy ==2) {return "Oh no!" +name + " is tired.";}
		if (hygiene==1 || hygiene==2) {return "Oh no!" +name + " is dirty.";}
		if (interest==1 || interest ==2) {return "Oh no!" + name + " is bored.";}
		if (hunger==1 || hunger==2) {return "Oh no!" + name + " is hungry.";}
		else return exclamatoryMessage[i] ;
		}
	String causeOfDeath() {
		if (energy<=0) {return "exhaustion.";}
		if (hygiene<=0) {return "disease.";}
		if (interest<=0) {return "boredom.  Yes, it's possible!";}
		if (hunger <=0) {return "starvation." ;}
		else return name;
		}
	}
//restart game
//quit game
//better warning
