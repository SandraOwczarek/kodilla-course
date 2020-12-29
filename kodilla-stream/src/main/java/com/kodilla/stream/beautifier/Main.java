package com.kodilla.stream.beautifier;

public class Main {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println();poemBeautifier.beautify("Let's make small big...", text -> text + text.toUpperCase());
        poemBeautifier.beautify("Ktora karte wybierasz?", text -> text + " ♥ ♦ ♣ ♠");
        poemBeautifier.beautify("Listen: ", text -> text + " ♪♪♪♪ ♫ ♪ ♫ ♫");
        poemBeautifier.beautify(" Isn't that much prettier?", text -> "░░░░░ " + text + "  ░░░░░");
    }
}