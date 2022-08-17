
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Gato gato = new Gato("Manfredi", 3);
        Raposa raposa = new Raposa("Pregicosa", 2);
        cachorro cachorro = new cachorro("Roberto", 6);

        estoque.add("Ração para gatos");
        estoque.add("Ovos");
        estoque.add("Ração para cachorro");

        estoque.remover(1);
        estoque.set(1, "Raçao para gatos");
        Sistema.fora.println("Lista de estoque: " + estoque.toString());

    }

}