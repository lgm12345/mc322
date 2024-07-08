import java.util.ArrayList ;
public class Jogador {
    private int id ;
    private int dinheiro ;
    private String nome ;
    private String cpf ;
    private String foto ;
    private String email ;
    private ArrayList<Carta> cartas = new ArrayList<>() ;
    private ArrayList<Propriedade> propriedades = new ArrayList<>() ;
    private Peca peca ;
    private static int numeroJogadores = 0 ;

    public Jogador(int dinheiro,String nome,String cpf,String foto,String email,Peca peca) {
        numeroJogadores = numeroJogadores + 1 ;
        this.id = numeroJogadores ;
        this.dinheiro = dinheiro ;
        this.nome = nome ;
        this.cpf = cpf ;
        this.foto = foto ;
        this.email = email ;
        this.peca = peca ;
    }
    public boolean compraPropriedade(Propriedade propriedade) {
        if (dinheiro > propriedade.getPreco()) {
            return propriedades.add(propriedade) ;
        }
        else {
            return false ;
        }
    }
    public int getId() {
        return id ;
    }
    public int getDinheiro() {
        return dinheiro ;
    }
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro ;
    }
    public String getNome() {
        return nome ;
    }
    public void setNome(String nome) {
        this.nome = nome ;
    }
    public String getCpf() {
        return cpf ;   
    }
    public void setCpf(String cpf) {
        this.cpf = cpf ;
    }
    public String getFoto() {
        return foto ;
    }
    public void SetFoto(String foto) {
        this.foto = foto ;
    }
    public String getEmail() {
        return email ;
    }
    public void setEmail(String email) {
        this.email = email ;
    }
    public boolean adicionaCarta(Carta carta) {
        return cartas.add(carta) ;
    }
    public boolean removeCarta(Carta carta)  {
        return cartas.remove(carta) ;
    }
    public String getPeca() {
        return peca.toString() ;
    }
    public void setPeca(Peca peca) {
        this.peca = peca ;
    }
    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", dinheiro=" + dinheiro +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", foto='" + foto + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}