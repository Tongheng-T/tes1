package Util;

public class util {
    public static void showTVOnOff(boolean on, int numtv){
        System.out.println("TV" + numtv + (on ? " On" : " Off"));

    }
    public static void showChannel(int channel, int numtv){
        if (0 != channel){
            System.out.println("Tv "+ "channel " + channel);
            return;
        }
        System.out.println("Please turn On"+" TV" + numtv);
    }
    public static void showVolumeLevel(int volumeLevel, int numtv){
        if (0 != volumeLevel){
            System.out.println("TV " + numtv + " volume " +volumeLevel );
            return;
        }
        System.out.println("Please turn on "+ "TV "+ numtv);
    }
}
