import java.util.Random ;

public class Main {
    public static void main(String args[]) {
        Peca peca1 = new Peca("azul",1) ;
        Peca peca2 = new Peca("vermelha",2) ;
        Peca peca3 = new Peca("verde",3) ;
        Jogador jogador1 = new Jogador(300,"lucas","052.700.529-03","/home/lucas/fotos","lucasgmaciel@gmail.com",peca1) ;
        Jogador jogador2 = new Jogador(200,"ana","111.111.111.-11","/home/ana/fotos","anasilva123@gmail.com",peca2) ;
        Jogador jogador3 = new Jogador(400,"joão","123.456.789-00","home/joao/fotos","joaobatista.gmail.com",peca3) ;
        Propriedade propriedade1 = new Propriedade(123,"propriedade xx",TipoCarta.SORTE,jogador1,"casa",600,150) ;
        Propriedade propriedade2 = new Propriedade(1234,"propriedade yy",TipoCarta.SORTE,jogador2,"apartamento",500,200) ;
        ServicoPublico servicoPublico = new ServicoPublico(12345,"propriedade zz",TipoCarta.SORTE,jogador3,"servicopublico",550,175,5) ;
        Estacao estacao = new Estacao(123456,"estacao",TipoCarta.SORTE,jogador1,"estacao inicial",650,225) ;
        CartaSorte cartaSorte = new CartaSorte(1, "Sorte", TipoCarta.SORTE, jogador1, 2, 0, 100.0f, "Avance 2 casas", 0, "");
        cartaSorte.executaAcao(jogador1);
        Random rand = new Random() ;
        int dados = rand.nextInt(6) + 1;
        System.out.println(servicoPublico.calcularAluguel(dados));
        Tabuleiro tabuleiro = new Tabuleiro() ;
        System.out.println(tabuleiro.addJogador(jogador1)) ;
        System.out.println(tabuleiro.addJogador(jogador2)) ;
        System.out.println(tabuleiro.addJogador(jogador3));
        System.out.println(jogador1.compraPropriedade(propriedade2));
        tabuleiro.inicializarCartas();
        Carta carta1 = tabuleiro.distribuiCarta() ;
        jogador1.adicionaCarta(carta1) ;
        Carta carta2 = tabuleiro.distribuiCarta() ;
        jogador2.adicionaCarta(carta2) ;
        Carta carta3 = tabuleiro.distribuiCarta() ;
        jogador3.adicionaCarta(carta3) ;
        System.out.println(tabuleiro.addPropriedade(propriedade1));
        System.out.println(tabuleiro.addPropriedade(propriedade2));
        System.out.println(tabuleiro.addPropriedade(servicoPublico));
        System.out.println(tabuleiro.addPropriedade(estacao));
        System.out.println(Validacao.validarCpf(jogador1.getCpf())) ;
        System.out.println(Validacao.validarEmail(jogador2.getEmail())) ;
        System.out.println(Validacao.validarCpf(jogador2.getCpf())) ;
        System.out.println(Validacao.validarEmail(jogador3.getEmail())) ;
    }
}
