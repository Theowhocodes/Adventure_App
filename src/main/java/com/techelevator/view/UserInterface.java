package com.techelevator.view;

import com.techelevator.model.characters.CharacterRace;
import com.techelevator.services.DnDServices;

import java.util.Scanner;

public class UserInterface {

    private final DnDServices dnDServices = new DnDServices();
    private final Scanner scanner = new Scanner(System.in);

    public void appGreeting(){
        System.out.println("**************************");
        System.out.println("Welcome to the guild new adventurer!");

    }

    public void optionsMenu(){
        System.out.println("1. Character Races");
        System.out.println("2. Character Alignments");
        System.out.println("3. Character Classes");
        System.out.println("4. How to DnD?");
        System.out.println("5. Create a new character");
    }

    public String racesSubMenu(){
        System.out.println("Enter race name for more information: ");
        String raceOption = scanner.nextLine();
        return raceOption;

    }

    public String continueOption(){
        System.out.print("Do you want to see another (Y/N): ");
        String choice = scanner.nextLine();
    return choice;
    }

    public int pathSelector(){
        int pathChoice;
        System.out.print("Please Choose a path: ");
        try{
        pathChoice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Invalid path adventurer!" + e.getMessage());
            pathChoice = -1;
        }
        return pathChoice;
    }



}
