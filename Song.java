public class Song {
    String artist;
    String songName;
    String genre;
    int year;
    int noofsong;
    String time;

    @Override
    public String toString() {
        return artist+", "+songName+", "+genre+", "+year+", "+noofsong+", "+time;
    }

    Song(String artist, String songName, String genre, int year,  String time) {
        this.artist = artist;
        this.songName = songName;
        this.genre = genre;
        this.year = year;
        this.time = time;
    }

    Song(String artist, String songName, String genre, int year, int noofsong, String time) {
        this.artist = artist;
        this.songName = songName;
        this.genre = genre;
        this.year = year;
        this.noofsong = noofsong;
        this.time = time;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNoofsong() {
        return noofsong;
    }

    public void setNoofsong(int noofsong) {
        this.noofsong = noofsong;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    

    

}
