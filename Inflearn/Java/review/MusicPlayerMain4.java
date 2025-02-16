package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.on();
        musicPlayer.volumUp();
        musicPlayer.volumUp();
        musicPlayer.volumUp();
        musicPlayer.volumDown();
        musicPlayer.checkSound();
        musicPlayer.off();
    }
}
