package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RealSongService implements SongService {
    private Map<Integer, Song> songDatabase;

    public RealSongService() {
        songDatabase = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        simulateDelay();
        return songDatabase.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        simulateDelay();
        List<Song> songs = new ArrayList<>();
        for (Song song : songDatabase.values()) {
            if (song.getTitle().equals(title)) {
                songs.add(song);
            }
        }
        return songs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        simulateDelay();
        List<Song> songs = new ArrayList<>();
        for (Song song : songDatabase.values()) {
            if (song.getAlbum().equals(album)) {
                songs.add(song);
            }
        }
        return songs;
    }

    private void simulateDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addSong(Integer songID, Song song) {
        songDatabase.put(songID, song);
    }
}