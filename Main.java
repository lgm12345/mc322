public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("lucas","052.700.529-03","lucasgmaciel@gmail.com","/home/lucas/fotos") ;
        Jogador jogador2 = new Jogador("ana","111.111.111.-11","anasilva123@gmail.com","/home/ana/fotos") ;
        Jogador jogador3 = new Jogador("joão","123.456.789-00","joaobatista.gmail.com","home/joao/fotos") ;
        //teste de getters e setters
        System.out.println(jogador1.getNome()) ;
        System.out.println(jogador1.getEmail());
        jogador1.setNome("anderson") ;
        jogador1.setEmail("andersonborges@gmail.com") ;
        System.out.println(jogador1.getNome()) ;
        System.out.println(jogador1.getEmail()) ;
        //teste do metodo validarCpf
        System.out.println(jogador1.validarCpf()) ;
        System.out.println(jogador2.validarCpf()) ;
        System.out.println(jogador3.validarCpf()) ;
        //teste do método validar Email
        System.out.println(jogador1.validarEmail()) ;
        System.out.println(jogador3.validarEmail()) ;
    }
}