package edu.java.intermediate.exercise1.creation.structural.adapter;

public class StereoMonoAudioSystemWrapper implements AudioSystem{

    private MonoAudioSystem monoAudioSystem;

    public StereoMonoAudioSystemWrapper(MonoAudioSystem monoAudioSystem) {
        this.monoAudioSystem = monoAudioSystem;
    }

    @Override
    public void play() {
        this.monoAudioSystem.play();
        System.out.println("Also it is Stereo.....");
    }
}
