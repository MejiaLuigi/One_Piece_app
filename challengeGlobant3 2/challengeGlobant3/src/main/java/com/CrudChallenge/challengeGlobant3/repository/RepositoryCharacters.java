package com.CrudChallenge.challengeGlobant3.repository;

import com.CrudChallenge.challengeGlobant3.model.CharactersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryCharacters extends JpaRepository<CharactersEntity,String> {
    Optional<CharactersEntity> findByNameCharacters(String nameCharacter);
    void existsByNameCharacters(String nameCharacter);

    void deleteByNameCharacters(String nameCharacter);


}
