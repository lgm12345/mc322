public class Estacao extends Propriedade{
    private int tarifa ;
    //construtor implicito
    public Estacao() {
        super() ;
    }
    //construtor explicito
    public Estacao(int id,String descricao,TipoCarta tipo,Jogador dono,String nome,int preco,float aluguel) {
        super(id,descricao,tipo,dono,nome,preco,aluguel) ;
    }

    public float calcularAluguel() {
        return (super.calcularAluguel() + tarifa ) ;
    }
}
