package NexDB;

import model.PokeMon;

public interface PokemonDAO<Pokemon> extends GenericDAO<PokeMon> {
    Pokemon addPokemon(PokeMon pokeMon);
    PokeMon giveDetails();

}
