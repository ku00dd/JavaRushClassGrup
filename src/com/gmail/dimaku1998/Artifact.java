package com.gmail.dimaku1998;

public class Artifact {
    private int number;
    private String culture;
    private int century;

    public Artifact(int number) {
        this.number = number;
    }

    public Artifact(int number, String calture) {
        this.number = number;
        this.culture = calture;
    }

    public Artifact(int number, String calture, int century) {
        this.number = number;
        this.culture = calture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact topor = new Artifact(123);
        Artifact knife = new Artifact(432 , "Atstec");
        Artifact helmat = new Artifact(543 , "Fashizm" , 20);
    }
}
