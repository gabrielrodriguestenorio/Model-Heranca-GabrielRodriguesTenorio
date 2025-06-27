public class Pokemon {
    // Tema escolhido: pokemon, porque eu gosto de pokemon :D
    String apelido;
    Integer numero_pokedex;
    String especie;
    Integer geracao;

    public Pokemon(){}

    public Pokemon (String apelido, Integer numero_pokedex, String especie, Integer geracao) {
        this.apelido = apelido;
        this.numero_pokedex = numero_pokedex;
        this.especie = especie;
        this.geracao = geracao;
    }
public String getapelido(){
    return apelido;
}
}
