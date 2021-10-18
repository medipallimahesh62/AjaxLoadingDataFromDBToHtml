package com.myprofile.myprofile.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import com.myprofile.myprofile.entity.MyProfile;
import com.myprofile.myprofile.repository.MyProfileRepository;

//import com.kgfsl.forum.Agenda;
// import com.kgfsl.eventapp.EventService;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/events")
public class MyProfileController {
    @Autowired
    private MyProfileRepository profileRepository;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<MyProfile>> all() {
        return new ResponseEntity<>(profileRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody MyProfile myprofile, UriComponentsBuilder ucBuilder) {
        profileRepository.save(myprofile);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(myprofile.getEmpid()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

}
