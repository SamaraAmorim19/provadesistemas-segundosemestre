import java.util.Scanner;

public class App {

    public static String valor1;
    public static String valor2;
    public static String operacao;
  
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


    System.out.print("Digite o primeiro valor binário: ");
    valor1 = scanner.nextLine();

    int valorMax;
    valorMax = valor1.length();


 
    for( int i = 0; i<valorMax; i++){
    char posicaoMax = valor1.charAt(i);

            if(posicaoMax != '1' && posicaoMax != '0'){

            System.out.println("Valor " + posicaoMax + " inválido. Digite apenas numeros de valor binario.");
            
            break;

            }
    }

    System.out.println("Digite a operação desejada: (+, -, / ou *)");
    operacao = scanner.nextLine();

    char vOperacao = operacao.charAt(0);
    if (  vOperacao != '+' &&  vOperacao != '-' &&   vOperacao != '/' &&  vOperacao != '*'){
    System.out.println("Operação inválida!");

    } else {
        System.out.print("Digite o segundo valor binário: ");
        valor2 = scanner.nextLine();

        int valorMaxim;
        valorMaxim = valor2.length();

        for( int i = 0; i<valorMax; i++){
        char posicaoMaxim = valor2.charAt(0);

            if(posicaoMaxim != '1' && posicaoMaxim != '0'){

            System.out.println("Valor "+ posicaoMaxim + " inválido. Digite apenas numeros de valor binario.");
            break;

            }
    }

    int resultado = 0; 

 

 
 
    if (operacao.equals("+")) { 
        resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2); 
    } else if (operacao.equals("-")) { 
        resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2); 
    } else if (operacao.equals("*")) { 
        resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2); 
    } else if (operacao.equals("/")) { 
        resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2); 
    } else  

 

{ 
        System.out.println("Operação inválida."); 
        return; 
    } 
 
    System.out.println("Resultado binário: " + Integer.toBinaryString(resultado)); 



    }


    
}
}

