/**
 * celula
 */
public class Celula {
     private Celula proxima;
     private Object elemento;
     private Celula anterior;

    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    Celula getAnterior() {
        return anterior;
    }

    void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getProxima() {
        return proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}