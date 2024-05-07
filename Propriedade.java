public class Propriedade extends Carta{
    private String nome ;
    private int preco ;
    private float aluguel ;
    
    //Construtor implicito
    public Propriedade() {
        super() ;
    }
    //Construtor explicito
    public Propriedade(int id,String descricao,Jogador dono,String nome,int preco,float aluguel) {
        super(id,descricao,dono) ;
        this.nome = nome ;
        this.preco = preco ;
        this.aluguel = aluguel ;
    }
    
    //getters e setters
    public String getNome() {
        return nome ;
    }
    public void setNome(String nome) {
        this.nome = nome ;
    }
    public int getPreco() {
        return preco ;
    }
    public void setPreco(int preco) {
        this.preco = preco ;
    }
    public float calcularAluguel() {
        return aluguel ;
    }
    public void setAluguel(float aluguel) {
        this.aluguel = aluguel ;
    }
}
