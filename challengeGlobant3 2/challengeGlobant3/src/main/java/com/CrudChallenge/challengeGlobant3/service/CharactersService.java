package com.CrudChallenge.challengeGlobant3.service;

import com.CrudChallenge.challengeGlobant3.DTO.CharactersDTO;
import com.CrudChallenge.challengeGlobant3.model.CharactersEntity;
import com.CrudChallenge.challengeGlobant3.repository.RepositoryCharacters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CharactersService {

    @Autowired
    private RepositoryCharacters repositoryCharacters;

    public CharactersDTO addCharacters(CharactersDTO charactersDTO) {
        CharactersEntity charactersEntity = new CharactersEntity();
        charactersEntity.setNameCharacters(charactersDTO.getNameCharacters());
        charactersEntity.setNicknameCharacters(charactersDTO.getNicknameCharacters());
        charactersEntity.setImageCharacters(charactersDTO.getImageCharacters());
        repositoryCharacters.save(charactersEntity);
        return charactersDTO;
    }

    public CharactersDTO searchCharacterByName(String nameCharacter) {
        Optional<CharactersEntity> optionalCharacters = repositoryCharacters.findByNameCharacters(nameCharacter);
        CharactersDTO charactersDTO = new CharactersDTO();

        if (optionalCharacters.isPresent()) {
            CharactersEntity character = optionalCharacters.get();
            charactersDTO.setNameCharacters(character.getNameCharacters());
            charactersDTO.setImageCharacters(character.getImageCharacters());
            charactersDTO.setNicknameCharacters(character.getNicknameCharacters());
        } else {
            // Si el Optional está vacío, puedes manejarlo de alguna manera. Por ejemplo, puedes lanzar una excepción.
            throw new NoSuchElementException("No se encontró ningún personaje con el nombre especificado: " + nameCharacter);
        }

        return charactersDTO;

    }

    public CharactersDTO updateCharacterByName (CharactersDTO charactersDTO){
        Optional<CharactersEntity> optionalCharacters = repositoryCharacters.findByNameCharacters(charactersDTO.getNameCharacters());

        if (optionalCharacters.isPresent()){
            CharactersEntity charactersEntity = optionalCharacters.get();
            charactersEntity.setNameCharacters(charactersDTO.getNameCharacters());
            charactersEntity.setImageCharacters(charactersDTO.getImageCharacters());
            charactersEntity.setNicknameCharacters(charactersDTO.getNicknameCharacters());

            repositoryCharacters.save(charactersEntity);
        }
        return charactersDTO;
    }

    @Transactional
    public void deleteByNameCharacter (String nameCharacter){
        repositoryCharacters.existsByNameCharacters(nameCharacter);
        repositoryCharacters.deleteByNameCharacters(nameCharacter);
    }
}