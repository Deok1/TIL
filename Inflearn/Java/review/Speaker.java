package access;

public class Speaker {
    int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUP() {
        if (volume > 100) {
            System.out.println("음량을 증가시킬 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가시킵니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("음량을 감소시킬 수 없습니다. 최소 음량입니다.");
        } else {
            volume -= 10;
            System.out.println("음량을 10 감소시킵니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 음량:" + volume);
    }

}
