public class Pilha {

    private String[] elementos;
    private int quantidade = 0;

    public Pilha(final int maximo) {
        elementos = new String[maximo];
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilha(final String elementos) {
        if (quantidade == elementos.length())
            throw new PilhaCheiaException("Nao eh possivel empilhar mais elementos");
        this.elementos[quantidade] = elementos;
        quantidade ++;
    }

    public String topo() {
        return elementos[quantidade-1];
    }

    public String desempilha() {
        if (estaVazia())
            throw new PilhaVaziaException("Nao eh possivel desempilhar");
        String topo = topo();
        quantidade--;
        return topo;
    }

}
