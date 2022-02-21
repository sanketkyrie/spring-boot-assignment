package com.sanket.details;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DetailService 
{
    List<Data> getAllData(){
        List<Data> obj = Arrays.asList(
            new Data(1,"sanket puhan","sanketpuhan7@gmail.com","Quantiphi"),
            new Data(2,"sambit pradhan","sambit@gmail.com","Delliot")
        );
        return obj;
    }
}
