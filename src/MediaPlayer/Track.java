package MediaPlayer;

public class Track {
    final String title;
    final String artist;
    final String album;
    final int year;
    final Duration duration;

    class Duration {
        final int totalSeconds;
        final int hours;
        final int minutes;
        final int seconds;

        Duration(int totalSeconds) {
            this.totalSeconds = totalSeconds;
            this.hours = totalSeconds/3600;
            this.minutes = (totalSeconds%3600)/60;
            this.seconds = (totalSeconds%3600)%60;
        }
    }

    Track(String title, String artist, String album, int year, Duration duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.duration = duration;
    }

    int getTotalSeconds() {
        return this.duration.totalSeconds;
    }

    void printDuration() {
        System.out.printf("%d:%d:%d", this.duration.hours, this.duration.minutes, this.duration.seconds);
    }
}
