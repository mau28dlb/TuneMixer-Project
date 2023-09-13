package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.DTO.BranoDTO;
import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.DTO.AlbumDTO;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.repositories.AlbumRepo;
import com.example.TuneMixer.Project.repositories.ArtistaRepo;
import com.example.TuneMixer.Project.repositories.BranoRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    private AlbumRepo albumRepo;
    private ArtistaRepo artistaRepo;


    @Autowired
    public AlbumService(AlbumRepo albumRepo){
        this.albumRepo = albumRepo;
    }

    //Create
    public AlbumDTO insertAlbum(AlbumDTO albumDTO){
        Album album = new Album();
        BeanUtils.copyProperties(albumDTO, album);
        album = albumRepo.save(album);
        BeanUtils.copyProperties(album, albumDTO);
        return albumDTO;
    }

    //Read
    public AlbumDTO findAlbumById(Long id){
        Album album = albumRepo.findById(id).get();
        AlbumDTO albumDTO = new AlbumDTO();
        albumDTO.setId(album.getId());
        albumDTO.setNome(album.getNome());
        albumDTO.setAnno(album.getAnno());
        albumDTO.setGenere(album.getGenere());
        albumDTO.setDurataAlbum(album.getDurataAlbum());
        albumDTO.setPremio(album.getPremio());
        return albumDTO;
    }

    public List<AlbumDTO> findAllAlbum(){
        List<Album> albumList = albumRepo.findAll();
        List<AlbumDTO> albumDTOList = new ArrayList<>();
        for (Album a : albumList) {
            AlbumDTO albumDTO = new AlbumDTO();
            albumDTO.setId(a.getId());
            albumDTO.setNome(a.getNome());
            albumDTO.setAnno(a.getAnno());
            albumDTO.setGenere(a.getGenere());
            albumDTO.setDurataAlbum(a.getDurataAlbum());
            albumDTO.setPremio(a.getPremio());
            albumDTOList.add(albumDTO);
        } return albumDTOList;
    }

    public List<AlbumDTO> findByTitolo(String nome){
        List<Album> albumList = albumRepo.findByTitolo(nome);
        List<AlbumDTO> albumDTOList = new ArrayList<>();
        for (Album a : albumList) {
            AlbumDTO albumDTO = new AlbumDTO();
            albumDTO.setId(a.getId());
            albumDTO.setNome(a.getNome());
            albumDTO.setGenere(a.getGenere());
            albumDTO.setAnno(a.getAnno());
            albumDTO.setDurataAlbum(a.getDurataAlbum());
            albumDTO.setPremio(a.getPremio());
            albumDTOList.add(albumDTO);
        } return albumDTOList;
    }

    public List<AlbumDTO> findByAnnoDiUscita(Integer anno){
        List<Album> albumList = albumRepo.findByAnnoDiUscita(anno);
        List<AlbumDTO> albumDTOList = new ArrayList<>();
        for (Album a : albumList) {
            AlbumDTO albumDTO = new AlbumDTO();
            albumDTO.setId(a.getId());
            albumDTO.setNome(a.getNome());
            albumDTO.setGenere(a.getGenere());
            albumDTO.setAnno(a.getAnno());
            albumDTO.setDurataAlbum(a.getDurataAlbum());
            albumDTO.setPremio(a.getPremio());
            albumDTOList.add(albumDTO);
        } return albumDTOList;
    }

    public List<AlbumDTO> findByGenere(GenereEnum genere){
        List<Album> albumList = albumRepo.findByGenere(genere);
        List<AlbumDTO> albumDTOList = new ArrayList<>();
        for (Album a : albumList) {
            AlbumDTO albumDTO = new AlbumDTO();
            albumDTO.setId(a.getId());
            albumDTO.setNome(a.getNome());
            albumDTO.setGenere(a.getGenere());
            albumDTO.setAnno(a.getAnno());
            albumDTO.setDurataAlbum(a.getDurataAlbum());
            albumDTO.setPremio(a.getPremio());
            albumDTOList.add(albumDTO);
        } return albumDTOList;
    }

    public List<AlbumDTO> findByArtista(String nomeArtista){
        ArtistaService artistaService = new ArtistaService(artistaRepo);
        artistaService.findArtistaByNome(nomeArtista);
        List<Album> albumList = albumRepo.findByArtista(nomeArtista);
        List<AlbumDTO> albumDTOList = new ArrayList<>();
        for (Album a : albumList) {
            AlbumDTO albumDTO = new AlbumDTO();
            albumDTO.setId(a.getId());
            albumDTO.setNome(a.getNome());
            albumDTO.setGenere(a.getGenere());
            albumDTO.setAnno(a.getAnno());
            albumDTO.setDurataAlbum(a.getDurataAlbum());
            albumDTO.setPremio(a.getPremio());
            albumDTOList.add(albumDTO);
        } return albumDTOList;
    }

    //Update
    public Optional<Album> updateAlbum(Long id, AlbumDTO albumDTO){
        Optional<Album> albumDaAggiornare = albumRepo.findById(id);
        if (albumDaAggiornare.isPresent()){
            albumDaAggiornare.get().setNome(albumDTO.getNome());
            albumDaAggiornare.get().setAnno(albumDTO.getAnno());
            albumDaAggiornare.get().setGenere(albumDTO.getGenere());
            albumDaAggiornare.get().setDurataAlbum(albumDTO.getDurataAlbum());
            albumDaAggiornare.get().setPremio(albumDTO.getPremio());
            albumRepo.save(albumDaAggiornare.get());
        } else { return Optional.empty();}
        return albumDaAggiornare;
    }

    public void deleteAlbum(Long id){
        this.albumRepo.deleteById(id);
    }

}
