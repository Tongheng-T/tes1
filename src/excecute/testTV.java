package excecute;
import TV1.TV;
import Util.util;

public class testTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();

        tv1.setOn(true);
        tv2.setOn(true);
        tv1.setChannelUp();
        tv2.setChannel(100);
        tv1.setVolumeLevel(40);

        util.showTVOnOff(tv1.isOn(),1);
        util.showTVOnOff(tv2.isOn(),2);
        util.showChannel(tv1.getChannel(),1);
        util.showChannel(tv2.getChannel(),2);
        util.showVolumeLevel(tv1.getVolumeLevel(),1);
        util.showVolumeLevel(tv2.getVolumeLevel(),2);

    }
}