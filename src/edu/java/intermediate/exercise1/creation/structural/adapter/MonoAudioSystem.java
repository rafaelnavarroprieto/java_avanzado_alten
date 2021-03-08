package edu.java.intermediate.exercise1.creation.structural.adapter;

public class MonoAudioSystem implements AudioSystem{

    @Override
    public void play() {
        System.out.println("start reproduce mono audio.....");
    }
}
