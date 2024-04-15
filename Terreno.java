public class Terreno extends Propriedade {
    private int numeroCasas ;
    private int valorCasas ;
    private int valorHotel ;
    private boolean hotel ;

    //Construtor implicito
    public Terreno() {
        super() ;
        this.numeroCasas = 0 ;
        this.valorCasas = 0 ;
        this.valorHotel = 0 ;
        this.hotel = false ;
    }
    
    public Terreno(int id,String nome,String proprietario,int preco,float aluguel,int numeroCasas,int valorCasas,int valorHotel,boolean hotel) {
        super(id,nome,proprietario,preco,aluguel) ;
        this.numeroCasas = numeroCasas ;
        this.valorCasas = valorCasas ;
        this.valorHotel = valorHotel ;
        this.hotel = hotel ;
    }

    public int getNumeroCasas() {
        return numeroCasas ;
    }
    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas ;
    }
    public int getValorCasas() {
        return valorCasas ;
    }
    public void setValorCasas(int valorCasas) {
        this.valorCasas = valorCasas ;
    }
    public int getValorHotel() {
        return valorHotel ;
    }
    public void setValorHotel(int valorHotel) {
        this.valorHotel = valorHotel ;
    }
    public boolean getHotel() {
        return hotel ;
    }
    public void setHotel(boolean hotel) {
        this.hotel = hotel ;
    }
    public boolean comprarCasa() {
        return true ;
    }
    public boolean comprarHotel() {
        return true ;
    }
}
