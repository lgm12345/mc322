import java.util.Random ;

public class Main {
    public static void main(String args[]) {
        Jogador jogador1 = new Jogador(300,"lucas","052.700.529-03","/home/lucas/fotos","lucasgmaciel@gmail.com") ;
        Jogador jogador2 = new Jogador(200,"ana","111.111.111.-11","/home/ana/fotos","anasilva123@gmail.com") ;
        Jogador jogador3 = new Jogador(400,"joão","123.456.789-00","home/joao/fotos","joaobatista.gmail.com") ;
        Propriedade propriedade1 = new Propriedade(1,"casa","lucas",600,150) ;
        Propriedade propriedade2 = new Propriedade(2,"apartamento","ana",500,200) ;
        ServicoPublico servicoPublico = new ServicoPublico(3,"servicopublico","jose",550,175) ;
        Estacao estacao = new Estacao(4,"estacao","joao",650,225) ;
        Random rand = new Random() ;
        int dados = rand.nextInt(6) + 1;
        System.out.println(servicoPublico.calcularAluguel(dados));
        Tabuleiro tabuleiro = new Tabuleiro() ;
        System.out.println(tabuleiro.addJogador(jogador1.getId())) ;
        System.out.println(tabuleiro.addJogador(jogador2.getId())) ;
        System.out.println(tabuleiro.removeJogador(jogador1.getId())) ;
        System.out.println(tabuleiro.removeJogador(jogador2.getId())) ;
        System.out.println(tabuleiro.addPropriedade(propriedade1.getId()));
        System.out.println(tabuleiro.addPropriedade(propriedade2.getId()));
        System.out.println(tabuleiro.addPropriedade(servicoPublico.getId()));
        System.out.println(tabuleiro.addPropriedade(estacao.getId()));
        System.out.println(tabuleiro.removePropriedade(propriedade1.getId())) ;
        System.out.println(tabuleiro.removePropriedade(propriedade2.getId())) ;
        System.out.println(tabuleiro.removePropriedade(estacao.getId())) ;
        System.out.println(Validacao.validarCpf(jogador1.getCpf())) ;
        System.out.println(Validacao.validarEmail(jogador2.getEmail())) ;
        System.out.println(Validacao.validarCpf(jogador2.getCpf())) ;
        System.out.println(Validacao.validarEmail(jogador3.getEmail())) ;
    }
}
