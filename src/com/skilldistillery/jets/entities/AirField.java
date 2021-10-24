package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	AirField jts = new AirField();
	private ArrayList<Jet> fleet = new ArrayList<>();
	String jetsFile = "jets.txt";

	public AirField() {
		
		

	}

private void readJetsFromFile() {
	
		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetsFile))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] lineSplit = line.split(",");
				String type = lineSplit[0];
				String model = lineSplit[1];
				int speed = Integer.parseInt(lineSplit[2]);
				int range = Integer.parseInt(lineSplit[3]);
				double price = Double.parseDouble(lineSplit[4]);
				
				if(lineSplit.equals("Fighter")) {
					Jet newJet = new FighterJet(type, model, speed, range, price);
					fleet.add(newJet);
				}
				else if(lineSplit.equals("Cargo")) {
					Jet newJet = new CargoPlane(type, model, speed, range, price);
					fleet.add(newJet);
				}
				else if(lineSplit.equals("Passenger")) {
						Jet newJet = new PassengerJet(type, model, speed, range, price);
						fleet.add(newJet);
				}
			
			} 
		}
		catch (IOException e) {
			System.err.println(e);
			}
		
}

public void displayAirfield(ArrayList<Jet> fleet) {
	System.out.println();
	for (int i = 0; i < fleet.size(); i++) {
		System.out.println((i + 1) + ": " + fleet.get(i));
	}
	System.out.println();
	
}
		

}
