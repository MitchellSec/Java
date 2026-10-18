public class Aula3TiposPrimitivosTamanhoMemoria {
    public static void main (String[] args) {
       // int, double, floar, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';

        // String náo é tipo primitivo é uma CLASSE
        String nome = "Mayck";

        
        System.out.println("Meu nome é "+nome+" prazer em te conhecer");
        System.out.println("A minha idade é "+idade+" anos");
        System.out.println("Meu salario é de R$ "+salarioDouble+" reais");
        
    }
} 
