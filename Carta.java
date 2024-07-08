public class Carta {
    private int id ;
    private String descricao ;
    private TipoCarta tipo ;
    //construtor implicito
    public Carta() {

    }

    //construtor explicito
    public Carta(int id,String descricao,TipoCarta tipo) {
        this.id = id ;
        this.descricao = descricao ;
        this.tipo = tipo ;
    }
    public int getId() {
        return id ;
    }
    public void setId(int id) {
        this.id = id ;
    }
    public String getDescricao() {
        return descricao ;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao ;
    }
    public TipoCarta geTipoCarta() {
        return tipo ;
    }
    public void setTipoCarta(TipoCarta tipo) {
        this.tipo = tipo ;
    }
}
