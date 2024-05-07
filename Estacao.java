public class Estacao extends Propriedade{
    
    //construtor implicito
    public Estacao() {
        super() ;
    }
    //construtor explicito
    public Estacao(int id,String descricao,Jogador dono,String nome,int preco,float aluguel) {
        super(id,descricao,dono,nome,preco,aluguel) ;
    }
    //sem sobrecarga de métodos
}
