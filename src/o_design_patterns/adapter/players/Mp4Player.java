package o_design_patterns.adapter.players;

import o_design_patterns.adapter.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file: " + filename);
    }

    @Override
    public void playVlc(String filename) {
        // Do nothing
    }
}