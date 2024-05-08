package celula;
public class Celula {
    Celula proxima;
    Object elemento;
    
    Celula(Celula proxima, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    Celula(Object elemento){
        this.elemento = elemento;
    }
    
    void setProxima(Celula proxima){
        this.proxima = proxima;
    }
    
    Celula getProxima(){
        return proxima;
    }
    
    Object getElemento(){
        return elemento;
    }
}
