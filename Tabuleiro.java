import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Tabuleiro implements Salvavel{
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private ArrayList<Propriedade> propriedades = new ArrayList<>();
    private ArrayList<Carta> cartas = new ArrayList<>() ;
    
    //Construtor
    public Tabuleiro() {

    }
    
    public boolean addJogador(Jogador jogador) {
        return jogadores.add(jogador) ;
    }
    public boolean removeJogador(Jogador jogador) {
        return jogadores.remove(jogador) ;
    }
    public boolean addPropriedade(Propriedade propriedade) {
        return propriedades.add(propriedade) ;
    }
    public boolean removePropriedade(Propriedade propriedade) {
        return propriedades.remove(propriedade) ;
    }
    public boolean addCarta(Carta carta) {
        return cartas.add(carta) ;
    }
    public boolean removeCarta(Carta carta) {
        return cartas.remove(carta) ;
    }
    public void inicializarCartas() {
        // Adicionando cartas de SORTE
        cartas.add(new Carta(1, "Avance até a Go", TipoCarta.SORTE));
        cartas.add(new Carta(2, "Receba $200", TipoCarta.SORTE));
        cartas.add(new Carta(3, "Receba uma propriedade", TipoCarta.SORTE));
        cartas.add(new Carta(4, "Saia da Prisão grátis", TipoCarta.SORTE));

        // Adicionando cartas de REVES
        cartas.add(new Carta(5, "Pague uma multa de $50", TipoCarta.REVES));
        cartas.add(new Carta(6, "Volte 3 casas", TipoCarta.REVES));
        cartas.add(new Carta(7, "Pague $100 em taxas", TipoCarta.REVES));
        cartas.add(new Carta(8, "Perde um turno", TipoCarta.REVES));
    }
    public Carta distribuiCarta() {
        Collections.shuffle(cartas);
        return cartas.remove(0);
    }
public void salvaLog(String input, String output) {
        try {
            Scanner scanner = new Scanner(new FileInputStream(input));
            PrintWriter out = new PrintWriter(new FileWriter(output));

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
            }
            scanner.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
