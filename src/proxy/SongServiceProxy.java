package proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SongServiceProxy implements SongService {
    private RealSongService realService;
    private Map<Integer, Song> cache;

    public SongServiceProxy(RealSongService realService) {
        this.realService = realService;
        this.cache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        Song song = cache.get(songID);
        if (song == null) {
            song = realService.searchById(songID);
            cache.put(songID, song);
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return realService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return realService.searchByAlbum(album);
    }
}