package Estudos.Variaveis;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {

        // idade < 15 cartegoria infantil
        // idade >= 15 cartegoria juvenil
        // idade >= 18 cartegoria adulto

        int idade = 20;

        String Cartegoria;

        if (idade < 15) {
            Cartegoria = "Cartegoria infantil";
        } else if (idade >= 15 && idade < 18) {
            Cartegoria = "Cartegoria Juvenil";
        } else {
            Cartegoria = "Cartegora Adulto";
        }
        System.out.println(Cartegoria);
    }
}
