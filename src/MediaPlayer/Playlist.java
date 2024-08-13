package MediaPlayer;

import java.util.ArrayList;

public class Playlist {
    String title;
    ArrayList<Track> tracks;
    int numberOfTracks;

    Playlist(String title) {
        this.title = title;
        this.tracks = new ArrayList<>();
        this.numberOfTracks = 0;
    }

    void addTrack(Track track) {
        this.tracks.add(track);
        this.numberOfTracks++;
    } 

    String getTitle() {
        return this.title;
    }

    int getDuration() {
        int totalSeconds = 0;
        for (var i : tracks) {
            totalSeconds += i.getTotalSeconds();
        }
        return totalSeconds;
    }

    int getNumberOfTracks() {
        return numberOfTracks;
    }
}
