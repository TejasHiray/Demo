package com.java.training1.controller;



import com.java.training1.dto.RequestDto;
import com.java.training1.dto.ResponseDto;
import com.java.training1.service.ServiceConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/conversion")

public class Controller {
    @Autowired
    private ServiceConversion serviceConversion;


    @PostMapping



    public ResponseDto convert (@RequestBody RequestDto requestDto){
        return ServiceConversion.convert(requestDto);
    }




}
