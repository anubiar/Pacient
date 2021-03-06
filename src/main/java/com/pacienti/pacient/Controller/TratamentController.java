package com.pacienti.pacient.Controller;

import com.pacienti.pacient.DTO.TratamentDto;
import com.pacienti.pacient.DTO.Tratamente;
import com.pacienti.pacient.Model.UserDao;
import com.pacienti.pacient.Repository.TratamentRepository;
import com.pacienti.pacient.Service.JwtUserDetailsService;
import com.pacienti.pacient.Service.TratamentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/tratament")
public class TratamentController {
   @Autowired
   private TratamentService tratamentService;

   @Autowired
   private JwtUserDetailsService userService;

   
   @PostMapping
    public ResponseEntity<?> addTratament(@RequestBody TratamentDto tratamentInfo,Authentication authentication){

        UserDao user = userService.currentUser(authentication);
        tratamentService.addTratament(tratamentInfo,user);

        return ResponseEntity.noContent().build();
    }


    @GetMapping
    public Tratamente getTratamente(@RequestParam Integer page,@RequestParam Integer size){
        return tratamentService.getTratamente(page, size);
    }

    @GetMapping(value = "/delete")
    public void deleteTratament(@RequestParam Integer id){
        tratamentService.removeTratament(id);
    }

    @PostMapping(value = "/update")
    public void updateTratament(@RequestBody TratamentDto tratament){
        tratamentService.updateTratament(tratament);
    }
}
