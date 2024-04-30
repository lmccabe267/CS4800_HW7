package proxy;

public class Driver {
    public static void main(String[] args) {
        RealSongService realService = new RealSongService();

        realService.addSong(1, new Song("Title1", "Artist1", "Album1", 180));
        realService.addSong(2, new Song("Title2", "Artist2", "Album1", 200));
        realService.addSong(3, new Song("Title3", "Artist3", "Album2", 220));
        realService.addSong(4, new Song("Title4", "Artist1", "Album2", 190));
        realService.addSong(5, new Song("Title5", "Artist2", "Album3", 210));

        SongService proxyService = new SongServiceProxy(realService);

        System.out.println(proxyService.searchById(1).getTitle());
        System.out.println(proxyService.searchById(1).getTitle());
        System.out.println(proxyService.searchById(2).getTitle());

        System.out.println(proxyService.searchByTitle("Title1"));

        System.out.println(proxyService.searchByAlbum("Album2"));
    }
}