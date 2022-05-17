package org.example;
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    private Map<String, String> abbreviationHMap = new HashMap<>();

    public Abbreviations(){}


    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationHMap.put(abbreviation, explanation);

    }
    public boolean hasAbbreviation(String abbreviation){
        return this.abbreviationHMap.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation) {
        return abbreviationHMap.get(abbreviation);
    }
}
