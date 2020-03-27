import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestePilha {

    @Test
    public void pilhaVazia(){
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento(){
        Pilha p = new Pilha();
        p.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
    }

    @Test
    public void empilhaEDesenpilha(){
        Pilha p = new Pilha();
        p.empilha("primeiro");
        p.empilha("segundo");
        assertFalse(p.estaVazia());
        assertEquals(2, p.tamanho());
        assertEquals("segundo", p.topo());

        Object desempilhado = p.desempilha();
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
        assertEquals("segundo", desempilhado);
    }


}
