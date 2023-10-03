public class Pokedex  extends PokemonAbstract{

    @Override
    public String pokemonInfo(Pokemon pokemon){
        return "Nome do Pokemon" + pokemon.getNome()+ "tipo" + pokemon.getTipo() + "sua" + pokemon.getSaude();
    }
}
