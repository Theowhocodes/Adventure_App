package com.techelevator;

import com.techelevator.services.DnDServices;
import com.techelevator.view.UserInterface;

public class AdventureApp {

    DnDServices dnDServices = new DnDServices();
    UserInterface userInterface = new UserInterface();


    public static void main(String[] args) {

    AdventureApp app = new AdventureApp();
    app.run();
    }

    public void run(){
       int menuInput = -1;

       while (menuInput != 0){
           userInterface.appGreeting();
           userInterface.optionsMenu();
           menuInput = userInterface.pathSelector();
           if(menuInput == 1){
               dnDServices.printRaces(dnDServices.showAllRaces());
               String choice = userInterface.racesSubMenu();
               dnDServices.print1Race(dnDServices.getRace(choice));
               dnDServices.printProficiencies(dnDServices.getRace(choice).getStarting_proficiencies());

           }

       }


    }


}
