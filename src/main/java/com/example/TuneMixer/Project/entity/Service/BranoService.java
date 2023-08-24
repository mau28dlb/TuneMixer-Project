package com.example.TuneMixer.Project.entity.Service;

import com.example.TuneMixer.Project.entity.Brano;
import com.example.TuneMixer.Project.entity.Dao.BranoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranoService {

    private BranoDao branoDao;

    @Autowired
    public BranoService(BranoDao branoDao){
        this.branoDao = branoDao;
    }

    public void addBrano(Brano brano){
        branoDao.addBrano(brano);
    }

    public void deleteBrano(Brano brano){
        branoDao.deleteBrano(brano);
    }

    public void updateBrano(Brano brano){
        branoDao.updateBrano(brano);
    }

    public List<Brano> getBranoList(){
        return branoDao.getBranoList();
    }
}
