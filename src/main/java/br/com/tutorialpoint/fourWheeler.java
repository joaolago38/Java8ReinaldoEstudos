package br.com.tutorialpoint;

public interface fourWheeler {
    default void print() {
        System.out.println("I am a four wheeler!");
    }
}
