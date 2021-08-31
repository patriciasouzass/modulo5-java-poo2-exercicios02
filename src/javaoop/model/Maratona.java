package javaoop.model;

import java.util.HashMap;
import java.util.Map;

public class Maratona {

    HashMap<Integer, Maratonista> circuitoPequeno = new HashMap<>();
    HashMap<Integer, Maratonista> circuitoMedio = new HashMap<>();
    HashMap<Integer, Maratonista> circuitoGrande = new HashMap<>();
    int inscricao = 1;

    public void inscreverMaratonista(String categoria, Maratonista maratonista){
        switch (categoria){
            case "pequeno":
                circuitoPequeno.put(inscricao++, maratonista);
                if (maratonista.getIdade() <= 18){
                    maratonista.setValorInscricao(1300d);
                } else {
                    maratonista.setValorInscricao(1500d);
                }
                break;
            case "médio":
                circuitoMedio.put(inscricao++, maratonista);
                if (maratonista.getIdade() <= 18){
                    maratonista.setValorInscricao(2000d);;
                } else {
                    maratonista.setValorInscricao(2300d);
                }
                break;
            case "grande":
                circuitoGrande.put(inscricao++, maratonista);
                if (maratonista.getIdade() > 18){
                    maratonista.setValorInscricao(2800d);
                } else {
                    System.out.println(maratonista.getNome() +" "+ maratonista.getSobrenome() + ", inscrição não permitida para essa categoria, devido o limite de idade.");
                }
                break;
        }
    }

    public void mostrarListaPorCategoria(String categoria){
        switch (categoria){
            case "pequeno":
                System.out.println("\n...:::::: CATEGORIA CIRCUITO PEQUENO ::::::...");
                for (Map.Entry<Integer, Maratonista> maratonistaEntry : circuitoPequeno.entrySet()){
                    System.out.println(maratonistaEntry.getKey() + " - " + maratonistaEntry.getValue().toString());
                }
                break;
            case "médio":
                System.out.println("\n...:::::: CATEGORIA CIRCUITO MÉDIO ::::::...");
                for (Map.Entry<Integer, Maratonista> maratonistaEntry : circuitoGrande.entrySet()){
                    System.out.println(maratonistaEntry.getKey() + " - " + maratonistaEntry.getValue().toString());
                }
                break;
            case "grande":
                System.out.println("\n...:::::: CATEGORIA CIRCUITO GRANDE ::::::...");
                for (Map.Entry<Integer, Maratonista> maratonistaEntry : circuitoGrande.entrySet()){
                    System.out.println(maratonistaEntry.getKey() + " - " + maratonistaEntry.getValue().toString());
                }
                break;
        }
    }

    public void cancelarInscricao(String categoria, int numeroInscricao){
        switch (categoria){
            case "pequeno":
                circuitoPequeno.remove(numeroInscricao);
                break;
            case "médio":
                circuitoMedio.remove(numeroInscricao);
                break;
            case "grande":
                circuitoGrande.remove(numeroInscricao);
                break;
        }
    }
}
