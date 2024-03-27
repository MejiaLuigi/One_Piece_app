package com.CrudChallenge.challengeGlobant3.DTO;




public class CharactersDTO {
    private String nameCharacters;
    private String imageCharacters;
    private String nicknameCharacters;

    public CharactersDTO() {
    }

    public CharactersDTO(String nameCharacters, String imageCharacters, String nicknameCharacters) {
        this.nameCharacters = nameCharacters;
        this.imageCharacters = imageCharacters;
        this.nicknameCharacters = nicknameCharacters;
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
