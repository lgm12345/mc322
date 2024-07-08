public class ServicoPublico extends Propriedade{
    private int multiplicador ;
    //construtor implicito
    public ServicoPublico() {
        super() ;
    }
    public ServicoPublico(int id,String descricao,TipoCarta tipo,Jogador dono,String nome,int preco,float aluguel,int multiplicador) {
        super(id,descricao,tipo,dono,nome,preco,aluguel) ;
        this.multiplicador = multiplicador ;
    }
    //sobrecarga do método calcular aluguel
    public float calcularAluguel(int dados) {
        return (super.calcularAluguel() * dados * multiplicador) ;
    }
}
