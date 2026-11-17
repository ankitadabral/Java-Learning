package Interfaces.Devices;

public class SmartPhone implements Camera, Phone, MusicPlayer {
    // implementing more than 1 interface
    // Achieving multiple inheritance effectively

    @Override
    public void takePhoto() {
        System.out.println("taking photo");
    }

    @Override
    public void takeVideo() {
        System.out.println("taking video");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music");

    }

    @Override
    public void stopMusic() {
        System.out.println("stopping music");
    }

    @Override
    public void makeCall(String Number) {
        System.out.println("calling " + Number);
    }

    @Override
    public void stopCall() {
        System.out.println("Stopping call");
    }


}
