package Estudos.Variaveis;

public class Aula04 {
    static void main(String[] args) {
        // Operadores / Aritiméticos
        // + - /

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 * numero02;

        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
    }
}
