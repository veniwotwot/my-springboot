package com.bby.myspringboot.controller;

import com.bby.myspringboot.entity.Human;
import com.bby.myspringboot.service.HumanService;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HumanController {
    @Autowired
    private HumanService humanService;

    @PostMapping("/humans")
    public Human saveHuman(@Valid @RequestBody Human human){
        return humanService.saveHuman(human);
    }

    @GetMapping("/humans")
    public List<Human> fetchHumanList(){
        return humanService.fetchHumanList();
    }

    @PutMapping("/humans/{id}")
    public Human updateHuman(@RequestBody Human human, @PathVariable("id") Long id){
        return humanService.updateHuman(human, id);
    }

    @DeleteMapping("/humans/{id}")
    public String deleteHuman(@PathVariable("id") Long id){
        humanService.deleteHuman(id);
        return "Deleted Successfully: "+id;
    }

}
