package le_inteiro_positivo;
import java.util.Scanner;

class LeInteiroPositivo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numero = leIdade();
        System.out.println("A idade entrada foi \"" + numero + "\"");
    }
    
    public static int leIdade() {
    	System.out.println("Entra com a idade do animal");
    	try {
    		int idade = pegaIdade();
    		return idade;
    	}
    	catch (NumeroNegativoException e) {
			System.out.println("O numero entrado eh negativo");
			return leIdade();
		}
    	catch (NumberFormatException e) {
			System.out.println("Nao eh um numero valido, entre com um inteiro");
			return leIdade();
		}
    	
    }

    static int pegaIdade() throws NumberFormatException, NumeroNegativoException{
        Scanner in = new Scanner(System.in);
        String numeroString = in.nextLine();
        try{
            int numeroInteiro = Integer.parseInt(numeroString);
            if(numeroInteiro<0) {
            	throw new NumeroNegativoException();
            }
            return numeroInteiro;
        }catch(NumberFormatException e){
        	throw e;
        }
    }
}