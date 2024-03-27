package com.CrudChallenge.challengeGlobant3.controller;

import com.CrudChallenge.challengeGlobant3.DTO.CharactersDTO;
import com.CrudChallenge.challengeGlobant3.model.CharactersEntity;
import com.CrudChallenge.challengeGlobant3.service.CharactersService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping("/api/v1/character")
public class CharactersController {
    @Autowired
    private CharactersService charactersService;

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.ACCEPTED)
    private CharactersDTO findCharactersByName(@RequestParam String nameCharacters){

        return charactersService.searchCharacterByName(nameCharacters);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public CharactersDTO addCharacter(@RequestBody CharactersDTO charactersDTO) {
        return charactersService.addCharacters(charactersDTO);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public  CharactersDTO updateCharacter(@RequestBody CharactersDTO charactersDTO){
        return charactersService.updateCharacterByName(charactersDTO);
    }

    @DeleteMapping("/delete")

    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCharacter(@RequestParam String nameCharacters){
         charactersService.deleteByNameCharacter(nameCharacters);
    }
}
