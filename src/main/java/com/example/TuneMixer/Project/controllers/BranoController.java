package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.services.BranoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/brano")
public class BranoController {
    public BranoService branoService;

    @Autowired
    public BranoController(BranoService branoService) {
        this.branoService = branoService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> insertNewBrano(@RequestBody Brano brano){
        branoService.insertBrano(brano);
        return ResponseEntity.ok().body("Nuovo brano inserito!");
    }

    @GetMapping("/retrieve")
    public ResponseEntity<Optional<Brano>> retrieveBranoById(@RequestParam Long id){
        Optional<Brano> brano = branoService.findBranoById(id);
        return ResponseEntity.ok().body(brano);
    }

    @PutMapping("/update")


    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteBrano(@RequestParam Long id){
        branoService.deleteBrano(id);
        return ResponseEntity.ok().body("Brano cancellato!");
    }

}
