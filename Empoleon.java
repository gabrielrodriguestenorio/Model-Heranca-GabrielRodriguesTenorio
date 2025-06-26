public class Empoleon extends Pokemon {
    String movimento1;
    String movimento2;
    String movimento3;
    String movimento4;

    public Empoleon(){
        super();
    }

    public Empoleon(String apelido, Integer numero_pokedex, String especie, Integer geracao, String movimento1, String movimento2, String movimento3, String movimento4) {
        super(apelido, numero_pokedex, especie, geracao);
        this.movimento1 = movimento1;
        this.movimento2= movimento2;
        this.movimento3= movimento3;
        this.movimento4= movimento4;
    }
    @Override
    public String getapelido(){
        return apelido;
    }
    public void SetMovimento1(){
        this.movimento1 = movimento1;
        this.movimento2 = movimento2;
        this.movimento3 = movimento3;
        this.movimento4 = movimento4;
    }
}
