public class Fila {
    VetorD lista = new VetorD();

    public void inserir(Object objeto) {
        lista.adiciona(objeto);
        //System.out.print(lista);
    }
    
    private boolean fEmpty() {
        return lista.vazia();
    }
    
    public Object mostra(){
        return lista;
    }
   
    public Object remover() {
        if (!fEmpty()) {
            Object objeto = lista.pega(0);
            lista.remove(0);
            return objeto;
        }
        return null;
    }
    
}