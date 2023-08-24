package com.example.TuneMixer.Project.entity.Service;

import com.example.TuneMixer.Project.entity.Artista;
import com.example.TuneMixer.Project.entity.Dao.ArtistaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {

    private ArtistaDao artistaDao;

    @Autowired
    public ArtistaService(ArtistaDao artistaDao){
        this.artistaDao = artistaDao;
    }

    public void addArtista(Artista artista){
        artistaDao.addArtista(artista);
    }

    public void deleteArtista(Artista nomeArtista){
        artistaDao.deleteArtista(nomeArtista);
    }

    public void updateArtista(Artista artista){
        artistaDao.updateArtista(artista);
    }

    public List<Artista> getArtistaList(){
        return artistaDao.getArtistaList();
    }
}
