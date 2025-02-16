package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(10);

        speaker.volumeUP();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();
        
        speaker.volumeDown();
        speaker.showVolume();
    }
}
