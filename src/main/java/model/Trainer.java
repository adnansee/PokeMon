package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trainer {

    @Id
    @GeneratedValue
    private Integer idTrainer;
    private String userName;
    private int trainerLevel;

    public Trainer() {
    }

    public Trainer(String userName, int trainerLevel) {
        this.userName = userName;
        this.trainerLevel = trainerLevel;
    }

    public Integer getIdTrainer() {
        return idTrainer;
    }

    public Trainer setIdTrainer(Integer idTrainer) {
        this.idTrainer = idTrainer;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Trainer setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public int getTrainerLevel() {
        return trainerLevel;
    }

    public Trainer setTrainerLevel(int trainerLevel) {
        this.trainerLevel = trainerLevel;
        return this;
    }
}
