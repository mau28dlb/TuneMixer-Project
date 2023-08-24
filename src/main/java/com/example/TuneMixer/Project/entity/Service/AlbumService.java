package com.example.TuneMixer.Project.entity.Service;

import com.example.TuneMixer.Project.entity.Album;
import com.example.TuneMixer.Project.entity.Dao.AlbumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    private AlbumDao albumDao;

    @Autowired
    public AlbumService (AlbumDao albumDao){
        this.albumDao = albumDao;
    }

    public String getAlbum(){
        return "Album";
    }

    public void addAlbum(Album album){
        if(album != null) throw  new IllegalArgumentException("Album non può essere nullo!");
        if(album.getNome() == null || album.getNome().isEmpty()) throw  new IllegalArgumentException("L'Album deve avere un nome");
        if(album.getDurata_album() <= 0) throw  new IllegalArgumentException("La durata dell'album deve essere superiore a 0");
        if(album.getGenere() == null) throw  new IllegalArgumentException("Il genere dell'album non può essere nullo");
        if(album.getAnno() <= 1800 || album.getAnno() >= 2024) throw  new IllegalArgumentException("L'anno non può essere minore di 1800 o superiore all'anno corrente");
        albumDao.addAlbum(album);
    }

    public void deleteAlbum (String albumName){
        albumDao.deleteAlbum(albumName);
    }

    public void updateAlbum(Album album) {
        albumDao.updateAlbum(album);
    }

    public List<Album> getAlbums(){
        return albumDao.getAlbums();
    }

}
