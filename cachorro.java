public class cachorro {
    public class Cachorro extends animal {

        public Cachorro(String nome, int idade) {
            super(nome, idade);

        }

        @Override
        public void acao() {
            System.out.println("O cachorro esta correndo!");
        }

        @Override
        public void emitirSom() {
            System.out.println("auau");
        }

    }
}
