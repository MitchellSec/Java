package Estudos.Variaveis;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // O bloco 'if' executa apenas quando a condição é verdadeira (true)
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não Autorizado");
        }

        /*
          Formas equivalentes de verificar a negação:

          1) Operador de negação (!):
          if (!isAutorizadoComprarBebida) {
              System.out.println("Não Autorizado");
          }

          2) Comparação explícita com false:
          if (isAutorizadoComprarBebida == false) {
              System.out.println("Não Autorizado");
             }
         */

        System.out.println("Fora do if");
    }
}