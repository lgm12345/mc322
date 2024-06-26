import java.util.ArrayList;
public class Tabuleiro {
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private ArrayList<Propriedade> propriedades = new ArrayList<>();
    
    //Construtor
    public Tabuleiro() {

    }
    
    public boolean addJogador(Jogador jogador) {
        return jogadores.add(jogador) ;
    }
    public boolean removeJogador(Jogador jogador) {
        return jogadores.remove(jogador) ;
    }
    public boolean addPropriedade(Propriedade propriedade) {
        return propriedades.add(propriedade) ;
    }
    public boolean removePropriedade(Propriedade propriedade) {
        return propriedades.remove(propriedade) ;
    }
}
