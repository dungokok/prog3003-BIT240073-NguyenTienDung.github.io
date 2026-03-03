package baiba_facade;

public class HomeTheaterFacade {
    private final TV tv;
    private final SoundSystem soundSystem;
    private final DVDPlayer dvdPlayer;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("=== Starting Home Theater ===");
        tv.on();
        soundSystem.on();
        dvdPlayer.on();
        System.out.println("Lights dimmed...");
        dvdPlayer.play(movie);
        System.out.println("=== Enjoy your movie! ===");
    }
}
