package TV1;

public class TV {
  private int channel = 1;
  private int volumeLevel = 1;
  private boolean on;

    public int getChannel() {
        if(on ){
            return channel;
        }
        return 0;
    }

    public void setChannel(int channel) {
        if(on && channel >= 1 && channel <= 120) {
            this.channel = channel;
        }else {
            System.out.println("channel must rang in [1,120]");
        }
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= 100){
            this.volumeLevel = volumeLevel;
        }
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setChannelUp(){
        if(on && channel < 120){
            channel++;
        }
    }
    public void setChannelDown(){
        if(on && channel > 1){
            channel--;
        }
    }
    public void setVolumeLevelUp(){
        if(on && volumeLevel <100){
            volumeLevel++;
        }
    }
    public void setVolumeLevelDown(){
        if(on && volumeLevel <1){
            volumeLevel--;
        }
    }
}
