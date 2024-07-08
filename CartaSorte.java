public class CartaSorte extends Carta{
    private Jogador dono ;
    private int movimento ;
    private int efeito ;
    private float valor ;
    private String acao ;
    private int tempo ;
    private String restricao ;

    //Construtor implicito
    public CartaSorte() {

    }

    //Construtor explicito
    public CartaSorte(int id,String descricao,TipoCarta tipo,Jogador dono,int movimento,int efeito,float valor,String acao,int tempo,String restricao) {
        super(id,descricao,tipo) ;
        this.dono = dono ;
        this.movimento = movimento ;
        this.efeito = efeito ;
        this.valor = valor ;
        this.acao = acao ;
        this.tempo = tempo ;
        this.restricao = restricao ;
    }

    public void executaAcao(Jogador jogador) {
        jogador.setDinheiro(Math.round(valor));
    }
    //getters e setters
    //conferir se existem metodos para sobrescrever
    public int getMovimento() {
        return movimento ;
    }
    
    public int getEfeito() {
        return efeito ;
    }
    
    public float getValor() {
        return valor ;
    }
    
    public String getAcao() {
        return acao ;
    }
    
    public int getTempo() {
        return tempo ;
    }
    
    public String getRestricao() {
        return restricao ;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento ;
    }
    
    public void setEfeito(int efeito) {
        this.efeito = efeito ;
    }
    
    public void setValor(float valor) {
        this.valor = valor ;
    }
    
    public void setAcao(String acao) {
        this.acao = acao ;
    }
    
    public void setTempo(int tempo) {
        this.tempo = tempo ;
    }
    
    public void setRestricao(String restricao) {
        this.restricao = restricao ;
    }
}
