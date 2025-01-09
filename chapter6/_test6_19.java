package chapter6;
class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int Max_VOLUME = 100;
    final int Min_VOLUME = 0;
    final int Max_CHANNEL = 100;
    final int Min_CHANNEL = 1;

    void turnOnOff () {
        isPowerOn = !isPowerOn;
    }

    void volumeUp() {
        if (volume < Max_VOLUME) {
            volume += 1;
        }
    }

    void volumeDown() {
        if (volume > Min_VOLUME) {
            volume -= 1;
        }
    }

    void channelUp() {
        if (channel == Max_CHANNEL) {
            channel = Min_CHANNEL;
        }
        channel += 1;
    }

    void channelDown() {
        if (channel == Min_CHANNEL) {
            channel = Max_CHANNEL;
        }
        channel -= 1;
    }
}

public class _test6_19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH : " + t.channel + ", VOL : " + t.volume);
    }
}
