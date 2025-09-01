import java.util.Scanner;
public class EntradaUsuario {
    public boolean validarCEPEntrada(String entrada){
        if(entrada.length()==9){
            if(entrada.charAt(5) == '-'){
                for (int i = 0; i < 9; i++) {
                    if (entrada.charAt(i)<'0' || entrada.charAt(i)>'9'){
                        return false;
                    }
                }
                for (int i = 0; i < 9; i++) {
                    if (entrada.charAt(i)==' '){
                        return false;
                    }
                }
                return true;
            } else
                return false;
        } else if (entrada.length()==8){
            for (int i = 0; i < 9; i++) {
                if (entrada.charAt(i)<'0' || entrada.charAt(i)>'9'){
                    return false;
                }
            }
            for (int i = 0; i < 9; i++) {
                if (entrada.charAt(i)==' '){
                    return false;
                }
            }
            return true;
        } else
            return false;
    }
    public String lerEntradaUsuaro (Scanner scanner){
        System.out.println("Insira o cep a ser pesquisado (digite 0 para interromper): ");
        String entrada = scanner.nextLine();
        if(validarCEPEntrada(entrada)){
            if(entrada.length() == 9){
                return entrada.replace("-","");
            }
            else
                return entrada;
        }else
            return "O cep digitado é invalido";
    }
}
