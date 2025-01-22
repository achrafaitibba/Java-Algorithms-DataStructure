package o_design_patterns.adapter;


import o_design_patterns.adapter.players.Mp4Player;
import o_design_patterns.adapter.players.VlcPlayer;

// The Adapter class that makes AdvancedMediaPlayer compatible with MediaPlayer
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String filename) {
        if (filename.endsWith(".vlc")) {
            advancedMusicPlayer.playVlc(filename);
        } else if (filename.endsWith(".mp4")) {
            advancedMusicPlayer.playMp4(filename);
        }
    }
}
