public class ServicoPublico extends Propriedade{
    //construtor implicito
    public ServicoPublico() {
        super() ;
    }
    public ServicoPublico(int id,String descricao,Jogador dono,String nome,int preco,float aluguel) {
        super(id,descricao,dono,nome,preco,aluguel) ;
    }
    //sobrecarga do método calcular aluguel
    public float calcularAluguel(int dados) {
        return (super.calcularAluguel() * dados) ;
    }
}
