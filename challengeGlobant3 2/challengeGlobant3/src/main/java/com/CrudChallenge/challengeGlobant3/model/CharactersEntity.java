package com.CrudChallenge.challengeGlobant3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Characters")
public class CharactersEntity {
    @Id
    @Column(name = "id_character")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CharactersID;
    @Column(name = "name_character")
    private String nameCharacters;
    @Column(name = "image_character")
    private String imageCharacters;
    @Column(name = "nickname_character")
    private String nicknameCharacters;

    public CharactersEntity() {

    }

    public CharactersEntity(Integer charactersID, String nameCharacters, String imageCharacters, String nicknameCharacters) {
        CharactersID = charactersID;
        this.nameCharacters = nameCharacters;
        this.imageCharacters = imageCharacters;
        this.nicknameCharacters = nicknameCharacters;
    }

    public Integer getCharactersID() {
        return CharactersID;
    }

    public void setCharactersID(Integer charactersID) {
        CharactersID = charactersID;
    }

    public String getNameCharacters() {
        return nameCharacters;
    }

    public void setNameCharacters(String nameCharacters) {
        this.nameCharacters = nameCharacters;
    }

    public String getImageCharacters() {
        return imageCharacters;
    }

    public void setImageCharacters(String imageCharacters) {
        this.imageCharacters = imageCharacters;
    }

    public String getNicknameCharacters() {
        return nicknameCharacters;
    }

    public void setNicknameCharacters(String nicknameCharacters) {
        this.nicknameCharacters = nicknameCharacters;
    }
}
