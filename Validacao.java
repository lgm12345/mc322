import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacao {
    public static boolean validarCpf(String cpf) {
        String cpfAux = cpf.replaceAll("[^0-9]", "") ;
        if (cpfAux.length() < 11) {
            return false ;
        }
        boolean saoIguais = true ;
        char primeiroNumero = cpfAux.charAt(0) ;
        for (int i = 1;i < cpfAux.length();i++) {
            if (primeiroNumero != cpfAux.charAt(i)) {
                 saoIguais = false ;
            }
        }
        if (saoIguais == true) {
            return false ;
        }
        int soma = 0 ;
        for (int i = 0;i < 9;i++) {
             soma = soma + (Character.getNumericValue(cpfAux.charAt(i)) * (10 - i)) ;
        }
        int primeiroDigito = 11 - (soma % 11) ;
        if (primeiroDigito > 9) {
            primeiroDigito = 0 ;
        }
        soma = 0 ;
        for (int i = 0;i < 9;i++) {
            soma = soma + (Character.getNumericValue(cpfAux.charAt(i)) * (11 - i)) ;
        }
        soma = soma + (primeiroDigito * 2) ;
        int segundoDigito = 11 - (soma % 11) ;
        if (segundoDigito > 9) {
            segundoDigito = 0 ;
        }
        if ((primeiroDigito == Character.getNumericValue(cpfAux.charAt(9))) && (segundoDigito == Character.getNumericValue(cpfAux.charAt(10)))) {
            return true ;
        }
        else {
            return false ;
        }
    }
    public static boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
