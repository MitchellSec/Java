package Estudos.Variaveis;

public class Aula04Operadores {
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

        System.out.println("isDezMaiorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        //Operadores_Logicos
        // && (AND), || (OR), !(NOT)

        int idade = 35;
        float salario = 3500F;

        boolean isDenstroDaLei = idade > 30 && salario > 4612;
        boolean isForaDaLei = idade < 30 && salario < 3381;

        System.out.println("isDentroDaLei " + isDenstroDaLei);
        System.out.println("isForaDaLei " + isForaDaLei);

        double valorTotalContaCorrente = 300;
        double valorTotalContaPoupanca = 6000;
        double valorPs5 = 5000;

        boolean isPs5Comprarvel = valorTotalContaCorrente > valorPs5;
        System.out.println("Ps5Compravel "+isPs5Comprarvel);

        // = += *= /= %=

        double bonus = 1200;

        bonus += 1000; // 2200
        bonus -= 2000; // 200
        bonus *= 10; // 2000
        bonus /= 2; // 1000

        System.out.println(bonus);
        //
        int contador =0;
        contador += 1; // contador recebe contador + 1

        contador++; // 2
        contador--; // 1

        ++contador; // 2
        --contador;

        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);
    }
}
