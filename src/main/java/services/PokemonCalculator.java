package services;

import model.PokeMon;
import model.PokemonType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class PokemonCalculator {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pokemon");
        EntityManager em = emf.createEntityManager();

    @Bean
    @Lazy
    public void giveListName() {
        for (int i = 1; i <= 4; i++) {
            PokeMon pokeMon = em.find(PokeMon.class, i);
            System.out.println(pokeMon.getPokemonName());
        }
    }


    @Bean
    @Lazy
    public void giveDetails() {
        for (int i = 1; i <= 4; i++) {
            PokeMon pokeMon = em.find(PokeMon.class, i);
            System.out.println(pokeMon);
        }
    }

    @Bean
    @Lazy
    public void giveType(){
        for (int i = 1; i <= 4; i++) {
            PokemonType pokemonType = em.find(PokemonType.class,i);
            System.out.println(pokemonType);
        }
    }
}

