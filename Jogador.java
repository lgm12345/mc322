public class Jogador {
    private int id ;
    private int dinheiro ;
    private String nome ;
    private String cpf ;
    private String foto ;
    private String email ;
    private static int numeroJogadores = 0 ;

    public Jogador(int dinheiro,String nome,String cpf,String foto,String email) {
        numeroJogadores = numeroJogadores + 1 ;
        this.id = numeroJogadores ;
        this.dinheiro = dinheiro ;
        this.nome = nome ;
        this.cpf = cpf ;
        this.foto = foto ;
        this.email = email ;
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
}