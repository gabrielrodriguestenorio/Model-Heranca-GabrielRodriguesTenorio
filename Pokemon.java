public class Pokemon {

        String apelido;
        Integer numero_pokedex;
        String especie;
        Integer geracao;

        public Pokemon(){} 

        public Pokemon (Integer numero_pokedex, String especie, Integer geracao) {
            this.numero_pokedex = numero_pokedex;
            this.especie = especie;
            this.geracao = geracao;
        }
    }
