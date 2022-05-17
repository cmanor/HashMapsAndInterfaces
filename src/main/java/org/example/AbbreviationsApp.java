package org.example;

public class AbbreviationsApp {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("deez", "nuts");
        abbreviations.addAbbreviation("abbreviation", "abbr");
        abbreviations.addAbbreviation("hemoglobin", "hemo");
        abbreviations.addAbbreviation("test", "hemo");

        String text = "deez abbrevation hemoglobin test";

        for (String part: text.split(" ")){
            if(abbreviations.hasAbbreviation(part)){
                part = abbreviations.findExplanationFor(part);
            }

            System.out.println(part);
            System.out.println(" ");
        }
        System.out.println();
    }
}
