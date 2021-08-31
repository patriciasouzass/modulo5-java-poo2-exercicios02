package javaoop;

import javaoop.model.Maratona;
import javaoop.model.Maratonista;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Maratonista> maratonistas = new ArrayList<>();

        maratonistas.add(new Maratonista("0101010101", "Paulo", "Silva", "999999988", "999999977", "O-", 42));
        maratonistas.add(new Maratonista("0101010101", "Jessica", "Alves", "999999988", "999999977", "AB+", 32));
        maratonistas.add(new Maratonista("0101010101", "Jeferson", "Silva", "999999988", "999999977", "O+", 19));
        maratonistas.add(new Maratonista("0101010101", "Francisca", "Santos", "999999988", "999999977", "B-", 39));
        maratonistas.add(new Maratonista("0101010101", "Natália", "Silva", "999999988", "999999977", "A-", 18));
        maratonistas.add(new Maratonista("0101010101", "Paulo", "Koch", "999999988", "999999977", "AB+", 15));
        maratonistas.add(new Maratonista("0101010101", "Maria", "Souza", "999999988", "999999977", "O+", 60));

        Maratona maratona = new Maratona();

        maratona.inscreverMaratonista("pequeno", maratonistas.get(0));
        maratona.inscreverMaratonista("médio", maratonistas.get(1));
        maratona.inscreverMaratonista("grande", maratonistas.get(2));
        maratona.inscreverMaratonista("grande", maratonistas.get(3));
        maratona.inscreverMaratonista("pequeno", maratonistas.get(4));
        maratona.inscreverMaratonista("grande", maratonistas.get(5));
        maratona.inscreverMaratonista("médio", maratonistas.get(6));

        maratona.mostrarListaPorCategoria("pequeno");

        maratona.mostrarListaPorCategoria("médio");

        maratona.mostrarListaPorCategoria("grande");

        maratona.cancelarInscricao("grande", 2);

        maratona.cancelarInscricao("pequeno", 4);

        maratona.mostrarListaPorCategoria("grande");

        maratona.mostrarListaPorCategoria("pequeno");

    }
}
