package model;


public class User {

    private String userName;
    private int characterLevel;

    public User() {

    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public User setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
        return this;
    }

    public User(String userName, int characterLevel) {
        this.userName = userName;
        this.characterLevel = characterLevel;
    }
}
