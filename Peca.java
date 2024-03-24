public class Peca {
    private String cor ;
    private int posicao ;
    
    //Construtor
    public Peca(String cor,int posicao) {
        this.cor = cor ;
        this.posicao = posicao ;
    }


//getters e setters

public String getCor() {
    return cor ;
}

public int getPosicao() {
    return posicao ;
}

public void setCor(String cor) {
    this.cor = cor ;
}

public void setPosicao(int posicao) {
    this.posicao = posicao ;
}
}

//        Peca peca1 = new Peca("vermelho",1) ;
//Peca peca2 = new Peca("azul",2) ;