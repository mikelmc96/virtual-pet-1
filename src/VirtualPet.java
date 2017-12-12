import java.util.Random;

public class VirtualPet {

	public String name;
	int interest;
	int nutrition;
	int energy;
	int hygiene;
	public VirtualPet(String name, int interest, int nutrition, int energy, int hygiene) {
		this.name = name;
		this.interest = interest;
		this.nutrition = nutrition;
		this.energy = energy;
		this.hygiene = hygiene;
	}

	public String showMenu() {
		return "What would you like to do? \n\tPress 1 to play with " + name + "\n\tPress 2 to feed " + name
				+ "\n\tPress 3 to make " + name + " sleep" + "\n\tPress 4 to give " + name
				+ " a bath\n\tPress 5 to see how " + name + " is doing\n";
	}

	public void tick() {
		interest -= 1;
		nutrition -= 1;
		energy -= 1;
		hygiene -= 1;
	}

	public void play() {
		interest += 5;
		energy -= 3;
		hygiene -= 1;
	}

	public void feed() {
		nutrition += 7;
		energy -= 1;
		hygiene -= 2;
	}

	public void sleep() {
		energy += 10;
		interest -= 3;
		nutrition -= 3;
		hygiene -= 1;
	}

	public void bathe() {
		hygiene += 7;
		interest -= 1;
		energy -= 1;
		nutrition -= 1;
	}

	public String showStatus() {
		return "\t" + name + "'s interest:  " + interest + "\n\t" + name + "'s nutrition: " + nutrition + "\n\t" + name
				+ "'s energy: " + energy + "\n\t" + name + "'s hygiene: " + hygiene;
	}

	boolean myPetIsAlive() {
		if (hygiene > 0 && interest > 0 && energy > 0 && nutrition > 0) {
			return true;
		}
		return false;
	}

	public String showHappyPicture() {
		return ("\t                      ____\n\t                .---'-    \\\n\t     .-----------/           \\\n\t     /           (         ^  |   __\n\t&   (             \\        O  /  / .'\n\t'._/(              '-'  (.   (_.' /\n\t     \\                    \\     ./\n\t      |    |       |    |/ '._.'\n\t       )   @).____\\|  @ |\n\t   .  /    /       (    |\n\t  \\|, '_:::\\  . ..  '_:::\\ ..\\)\n");
	}

	public String showBathingPicture() {
		return ("                                 __\n         _,-'`````--.___..----.,'__`---..__\n       ,''                   ,'    `.`.    `.\n     ,''                    /        ` )     \\\n    //                     |          /       \\\n   //                      :         :     __\n---    ---       ---    ---        ---    ---    *          *");
	}

	public String showPlayingPicture() {
		return ("      _  _ \\\n     ( \\--,/)\n ,---\\ ` '_/\n/( ___'--/` \n |_|\\ |_|\\");
	}

	public String showFoodPicture() {
		return ("      |\n    \\|/|/\n  \\|\\\\|//|/\n   \\|\\|/|/\n    \\\\|//\n     \\|/\n     \\|/\n      |\n_\\|/__|_\\|/____\\|/_");
	}

	public String showSleepingPicture() {
		return ("  ()_\n()//__/)_________________()\n||(___)//#/_/#/_/#/_/#()/||\n||----|#| |#|_|#|_|#|_|| ||\n||____|_|#|_|#|_|#|_|#||/||\n||    |#|_|#|_|#|_|#|_||");
	}

	public String showElephantAngelPicture() {
		return ("\t           /}/}\n\t,         / / }\n\t\\\\   .-=.( (   }\n\t \\'--\"   `\\\\_.---,='\n\t   '-,  \\__/       \\___\n\t   .-'.-.'      \\___.'\n\t  / // /-..___,-`--'\n\t  `\" `\"");
	}

	String[] exclamatoryMessage = { "Great job!", "Excellent!", "Fantastic!", "Much better!", "Awesome!" };
	Random random = new Random();
	int i = random.nextInt(exclamatoryMessage.length);

	public String dangerZone() {
		if (energy == 1 || energy == 2) {
			return "Oh no! " + name + " is tired.";
		}
		if (hygiene == 1 || hygiene == 2) {
			return "Oh no! " + name + " is dirty.";
		}
		if (interest == 1 || interest == 2) {
			return "Oh no! " + name + " is bored.";
		}
		if (nutrition == 1 || nutrition == 2) {
			return "Oh no! " + name + " is hungry.";
		} else
			return exclamatoryMessage[i];
	}

	String causeOfDeath() {
		if (energy <= 0) {
			return "exhaustion.";
		}
		if (hygiene <= 0) {
			return "disease.";
		}
		if (interest <= 0) {
			return "boredom.  Yes, it's possible!";
		}
		if (nutrition <= 0) {
			return "starvation.";
		} else
			return name;
	}
}
