package com.techelevator.services;


import com.techelevator.model.characters.CharacterRace;
import com.techelevator.model.characters.Example;
import com.techelevator.model.characters.Starting_proficiencies;
import org.springframework.web.client.RestTemplate;

public class DnDServices {

    public static String API_BASE_URL = "https://www.dnd5eapi.co/api";
    private final RestTemplate restTemplate = new RestTemplate();
    private String raceUrl = "/races/";

    public CharacterRace[] showAllRaces(){
        String url = API_BASE_URL + raceUrl;
        return restTemplate.getForObject(url, Example.class).getResults();
    }

    public CharacterRace getRace(String raceName){
        String url = API_BASE_URL + raceUrl + raceName;
        CharacterRace race = restTemplate.getForObject(url, CharacterRace.class);
         return race;


    }
    public String race2String(CharacterRace race){
        return race.toString();
    }


    public void print1Race(CharacterRace singleChar){
            System.out.println(singleChar.toString());

    }

    public void printRaces(CharacterRace[] characterRaces) {

        for (CharacterRace race : characterRaces) {
            System.out.println(race.toString2());
        }
    }

    public void printProficiencies(Starting_proficiencies[] proficiencies) {

        for (Starting_proficiencies proficiency : proficiencies) {
            System.out.println(proficiencies.toString());
        }
    }




}
