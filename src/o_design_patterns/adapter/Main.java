package o_design_patterns.adapter;

// Example usage
class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("song.mp3");
        audioPlayer.play("movie.mp4");
        audioPlayer.play("video.vlc");
        audioPlayer.play("music.wav");
    }
}