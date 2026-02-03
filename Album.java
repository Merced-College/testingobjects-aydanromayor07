// Aydan Romayor
// 2-3-2026
// Dog class for my Dog objects

// Step 1
public class Album {
    // data variables
    // Step 4
    private String name;
    private int year;
    private String artist;

    // constructors
    // Step 6
    public Album() {
        name = "Unknown";
        year = 1900;
        artist = "Unknown";
    }

    public Album(String name, String artist, int year) { // parameterized constructor
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    // Getter and setter methods
    // Step 12
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    
    public void setYear(int year) { 
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Step 8
    @Override
    public String toString() {
        return "Album{name='" + name + "', artist='" + artist + "', year=" + year + "}";
    }
}