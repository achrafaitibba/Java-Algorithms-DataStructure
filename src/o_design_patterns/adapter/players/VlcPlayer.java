package o_design_patterns.adapter.players;


import o_design_patterns.adapter.AdvancedMediaPlayer;

// Concrete implementation of AdvancedMediaPlayer
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        // Do nothing
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file: " + filename);
    }
}