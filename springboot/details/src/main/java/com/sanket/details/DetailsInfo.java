package com.sanket.details;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class DetailsInfo {

    @Autowired
    DetailService service;

    @GetMapping("/details")
    public List<Data>getDetails(){
        return service.getAllData();
    }

}
