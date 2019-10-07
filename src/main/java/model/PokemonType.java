package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PokemonType {
    @Id
    private int id;
    private String typeName;
    private String description;
    private int baseHitpoints;
    private int baseAttack;
    private int baseDefense;


    public int getId() {
        return id;
    }

    public PokemonType setId(int id) {
        this.id = id;
        return this;
    }

    public String getTypeName() {
        return typeName;
    }

    public PokemonType setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PokemonType setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getBaseHitpoints() {
        return baseHitpoints;
    }

    public PokemonType setBaseHitpoints(int baseHitpoints) {
        this.baseHitpoints = baseHitpoints;
        return this;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public PokemonType setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
        return this;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public PokemonType setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
        return this;
    }

    public PokemonType() {
    }

    @Override
    public String toString() {
        return "PokemonType { " +
                "ID = " + id +
                ", Type Name = " + typeName + '\'' +
                ", Description = " + description + '\'' +
                ", Base Hit Points = " + baseHitpoints +
                ", Base Attack = " + baseAttack +
                ", Base Defense = " + baseDefense +
                " }";
    }
}
