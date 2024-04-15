public class Propriedade {
    private int id ;
    private String nome ;
    private String proprietario ;
    private int preco ;
    private float aluguel ;
    
    //Construtor implicito
    public Propriedade() {
    }
    //Construtor explicito
    public Propriedade(int id,String nome,String proprietario,int preco,float aluguel) {
        this.id = id ;
        this.nome = nome ;
        this.proprietario = proprietario ;
        this.preco = preco ;
        this.aluguel = aluguel ;
    }
    
    //getters e setters
    public int getId() {
        return id ;
    }
    public void setId(int id) {
        this.id = id ;
    }
    public String getNome() {
        return nome ;
    }
    public void setNome(String nome) {
        this.nome = nome ;
    }
    public String getProprietario() {
        return proprietario ;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario ;
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
