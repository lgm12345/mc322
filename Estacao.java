public class Estacao extends Propriedade{
    
    //construtor implicito
    public Estacao() {
        super() ;
    }
    //construtor explicito
    public Estacao(int id,String nome,String proprietario,int preco,float aluguel) {
        super(id,nome,proprietario,preco,aluguel) ;
    }
    //sem sobrecarga de métodos
}
