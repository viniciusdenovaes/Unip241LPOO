package le_inteiro;
import java.util.Scanner;

class LeInteiro{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numero = leInteiro();
        System.out.println("O inteiro entrado foi: \"" + numero + "\"");
    }

    static int leInteiro(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com um inteiro:");
        String numeroString = in.nextLine();
        try{
            int numeroInteiro = Integer.parseInt(numeroString);
            return numeroInteiro;
        }catch(NumberFormatException e){
            System.out.println("O valor entrado nao eh um inteiro: " + numeroString);
            return leInteiro();
        }
    }
}