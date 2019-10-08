package services;

import NexDB.PokemonAbstractDAO;
import model.PokeMon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Scanner;

@Component
public class PokemonCalculator {

    PokemonAbstractDAO p = new PokemonAbstractDAO();
    Scanner sc = new Scanner(System.in);

    @Bean
    @Lazy
    public PokeMon addPokemon() {
        System.out.println("Please enter data for Pokemon...MATE");
        PokeMon pokeMon = new PokeMon(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        p.save(pokeMon);
        return pokeMon;
    }

    @Bean
    @Lazy
    public void delPokemon() {

        PokeMon pokeMon = p.returnPokemon();
        p.delete(pokeMon);
    }

    @Bean
    @Lazy
    private PokeMon getPokemon() {
        p.getPokemonOne();

        return null;
    }

    @Bean
    @Lazy
    public void giveListName() {
        p.giveNames();
    }

    @Bean
    @Lazy
    public void giveDetails() {
        p.giveDetails();
    }

    @Bean
    @Lazy
    public void giveType() {
        p.giveType();
    }
}

