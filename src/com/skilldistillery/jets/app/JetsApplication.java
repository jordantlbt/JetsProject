package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		JetsApplication ja = new JetsApplication();
		ArrayList<Jet> fleet = new ArrayList<>();

		ja.launch(fleet);

	}

	public void launch(ArrayList<Jet> fleet) {

		AirField af = new AirField(fleet);
		af.readJetsFromFile(fleet);
		userChoices(fleet);

	}

	public void userMenu() {

		System.out.println("=======================");
		System.out.println("");
		System.out.println("---------MENU---------");
		System.out.println("");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with the longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. DogFight!");
		System.out.println("7. Add jet to Fleet");
		System.out.println("8. Remove a jet from fleet");
		System.out.println("9. Quit");
		System.out.println("");
		System.out.println("=======================");

	}

	public void userChoices(ArrayList<Jet> fleet) {

		boolean keepGoing = true;

		AirField af = new AirField(fleet);
		while (keepGoing) {

			userMenu();
			int choice = userInput.nextInt();
			switch (choice) {

			case 1: // print out the jets and all info
				af.displayAirfield(fleet);
				break;
			case 2: // print out the line of the jets "flying"
				af.jetsFlying();
				break;
			case 3: // print out the fastest jet with info
				af.fastestJet(fleet);
				break;
			case 4: // print out jet with longest range and info
				af.longestRange(fleet);
				break;
			case 5: // print out the line that is "loading" the jets
				af.loadCargoPlane();
				break;
			case 6: // print out the line that the jets are fighting
				af.fightJets();
				break;
			case 7: // let user use scanner to input a jet into the fleet
				af.addJet();
				break;
			case 8: // print a list of jets with numbers so user can choose to remove one
				af.removeJet();
				break;
			case 9: // quit the application
				System.out.println("Now exiting application...");
				keepGoing = false;
				break;
			default:
				System.out.println("Please choose a number between 1 - 9");
				System.out.println();
			}

		}

	}

}
