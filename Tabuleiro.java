import java.util.ArrayList;
public class Tabuleiro {
    private ArrayList<Integer> jogadores = new ArrayList<>();
    private ArrayList<Integer> propriedades = new ArrayList<>();
    
    //Construtor
    public Tabuleiro() {

    }
    
    public boolean addJogador(int jogador) {
        return jogadores.add(jogador) ;
    }
    public boolean removeJogador(int jogador) {
        return jogadores.remove(Integer.valueOf(jogador)) ;
    }
    public boolean addPropriedade(int propriedade) {
        return propriedades.add(propriedade) ;
    }
    public boolean removePropriedade(int propriedade) {
        return propriedades.remove(Integer.valueOf(propriedade)) ;
    }
}
