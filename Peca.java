public class Peca {
    private String cor ;
    private int posicao ;

    public Peca(String cor,int posicao) {
        this.cor = cor ;
        this.posicao = posicao ;
    }

    public String getCor() {
        return cor ;    
    }
    public void setCor(String cor) {
        this.cor = cor ;
    }
    public int getPosicao() {
        return posicao ;
    }
    public void setPosicao(int posicao) {
        this.posicao = posicao ;
    }
    @Override
    public String toString() {
        return "Peca{" +
                "cor='" + cor + '\'' +
                ", posicao=" + posicao +
                '}';
    }

}
