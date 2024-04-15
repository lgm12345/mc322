public class ServicoPublico extends Propriedade{
    //construtor implicito
    public ServicoPublico() {
        super() ;
    }
    public ServicoPublico(int id,String nome,String proprietario,int preco,float aluguel) {
        super(id,nome,proprietario,preco,aluguel) ;
    }
    //sobrecarga do método calcular aluguel
    public float calcularAluguel(int dados) {
        return (super.calcularAluguel() * dados) ;
    }
}
