package chapter7;

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            return;
        }
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
            return;
        }
        prevChannel = this.channel;
        this.channel = channel;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }

    // 또 다른방법
//    public void gotoPrevChannel() {
//        if (channel == MIN_CHANNEL) {
//            this.channel = MAX_CHANNEL;
//        }
//        this.channel -= 1;
//    }
}

public class _test7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOLUME : " + t.getVolume());
    }
}
