package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	
	private AirField airfield;
	Scanner userInput = new Scanner(System.in);
	static JetsApplication ja = new JetsApplication();

	public static void main(String[] args) {
		
		ja.launch();
		
		
	}
		
		public void launch() {
			airfield = new AirField();
			userMenu();
			userChoices();
			
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
		
		public void userChoices() {
			
			boolean keepGoing = true;
			
			while (keepGoing) {
			
			userMenu(); 
			int choice = userInput.nextInt();
			switch (choice) {
			
			case 1: //print out the jets and all info
				displayAllAirField();
				break;
			case 2: // print out the line of the jets "flying"
				break;
			case 3: // print out the fastest jet with info
				break;
			case 4: // print out jet with longest range and info
				break;
			case 5: //print out the line that is "loading" the jets
				break;
			case 6: //print out the line that the jets are fighting	
				break;
			case 7: //let user use scanner to input a jet into the fleet
				break;
			case 8: //print a list of jets with numbers so user can choose to remove one
				break;
			case 9: //quit the application
				System.out.println("Now exiting application...");
				keepGoing = false;
				break;
			default: 
				System.out.println("Please choose a number between 1 - 9");
				System.out.println();
			}
				
			}
			
		}
		
		private void displayAllAirField() {
			airfield.displayAirfield();
		}
	}


