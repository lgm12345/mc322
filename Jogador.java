import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Jogador {
    private String nome;
    private String cpf ;
    private String email ;
    private String foto ;

    //Construtor 
    public Jogador(String nome,String cpf,String email,String foto) {
        this.nome = nome ;
        this.cpf =  cpf ;
        this.email = email ;
        this.foto = foto ;
    }


//getters e setters

public String getNome() {
    return nome ;
}

public String getCpf() {
    return cpf ;
}

public String getEmail() {
    return email ;
}

public String getFoto() {
    return foto ;
}

public void setNome(String nome) {
    this.nome = nome ;
}

public void setCpf(String cpf) {
    this.cpf = cpf ;
}

public void setEmail(String email) {
    this.email = email ;
}

public void setFoto(String foto) {
    this.foto = foto ;
}

public boolean validarCpf() {
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

public boolean validarEmail() {
    String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$" ;
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}

}

