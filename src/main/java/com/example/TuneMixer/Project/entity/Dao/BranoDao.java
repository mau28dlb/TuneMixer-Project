package com.example.TuneMixer.Project.entity.Dao;

import com.example.TuneMixer.Project.entity.Artista;
import com.example.TuneMixer.Project.entity.Brano;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BranoDao {

    private List<Brano> branoList = new ArrayList<>();

    public void addBrano(Brano brano){
        this.branoList.add(brano);
    }

    public void deleteBrano(Brano titoloBrano){
        this.branoList.removeIf(brano -> brano.getTitolo().equals(titoloBrano));
    }

    public void updateBrano(Brano brano){
        this.branoList.removeIf(brano1 -> brano1.getTitolo().equals(brano.getTitolo()));
        this.branoList.add(brano);
    }

    public List<Brano> getBranoList(){
        return this.branoList;
    }
}
