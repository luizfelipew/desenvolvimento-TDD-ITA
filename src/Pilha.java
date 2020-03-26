public class Pilha {

    private Object elemento;
    private int quantidade;

    public boolean estaVazia() {
        return (elemento == null);
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilha(final Object elemento) {
        this.elemento = elemento;
        quantidade ++;
    }

    public String topo() {
        return elemento.toString();
    }

}
