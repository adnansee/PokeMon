package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class PokeMon {
    @Id
    @GeneratedValue
    private int id;
    private String pokemonName;
    private int pokemonType;
    private int level;
    private int attack;
    private int defence;
    private int hitPoints;
    private int CombatPower;

    @Transient
    private Integer dust;

    public PokeMon(String pokemonName, int pokemonType, int level, int attack, int defence, int hitPoints, int combatPower) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.level = level;
        this.attack = attack;
        this.defence = defence;
        this.hitPoints = hitPoints;
        CombatPower = combatPower;
    }

    public PokeMon() {
    }

    @Override
    public String toString() {
        return "PokeMon { " +
                "ID = " + id +
                ", Pokemon Name = '" + pokemonName + '\'' +
                ", Pokemon Type = " + pokemonType +
                ", Level = " + level +
                ", Attack = " + attack +
                ", Defence = " + defence +
                ", Hit Points = " + hitPoints +
                ", Combat Power = " + CombatPower +
                 " }";
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public PokeMon setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
        return this;
    }

    public int getPokemonType() {
        return pokemonType;
    }

    public PokeMon setPokemonType(int pokemonType) {
        this.pokemonType = pokemonType;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public PokeMon setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getAttack() {
        return attack;
    }

    public PokeMon setAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public int getDefence() {
        return defence;
    }

    public PokeMon setDefence(int defence) {
        this.defence = defence;
        return this;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public PokeMon setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
        return this;
    }

    public int getCombatPower() {
        return CombatPower;
    }

    public PokeMon setCombatPower(int combatPower) {
        this.CombatPower = combatPower;
        return this;
    }


}
