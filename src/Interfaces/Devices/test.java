package Interfaces.Devices;

public class test {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.makeCall("8767876545");
        smartphone.stopCall();
        smartphone.playMusic();
        smartphone.stopMusic();
        smartphone.takePhoto();
        smartphone.takeVideo();

        // calling all the methods present in different interfaces
    }
}
