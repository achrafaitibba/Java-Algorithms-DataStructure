package o_design_patterns.adapter;

// The concrete implementation of the MediaPlayer that uses the adapter
class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String filename) {
        // Play mp3 files natively
        if (filename.endsWith(".mp3")) {
            System.out.println("Playing mp3 file: " + filename);
        }
        // Use adapter for other formats
        else if (filename.endsWith(".vlc") || filename.endsWith(".mp4")) {
            mediaAdapter = new MediaAdapter(filename.substring(filename.length() - 3));
            mediaAdapter.play(filename);
        } else {
            System.out.println("Invalid media format: " + filename);
        }
    }
}

