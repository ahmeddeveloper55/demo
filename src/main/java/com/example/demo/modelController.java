package com.example.demo;

import com.example.demo.Repo.Data;
import com.example.demo.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class modelController {
   @Autowired
    public final Repo myrep;

    public modelController(Repo myrep) {
        this.myrep = myrep;
    }
    @RequestMapping(value = "/Users",method = RequestMethod.GET)
    public List<Data> getlist(){
        return myrep.findAll();
    }
}
