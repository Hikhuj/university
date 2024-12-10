/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Arbol {
    
    // Variables
    private Nodo raiz;
    
    
    public void inserta(int num){
        
        // Preguntar si la raiz NULA o no
        if(raiz == null){
            // Si la raiz es nula, se crea un nodo con el valor
            raiz = new Nodo(num);
        }else{
            // Cuando la raiz esta vacia pasamos por este proceso recursivo
            // Cada vez que insertamos, necesitamos saber en que nivel estamos
            insertaRec(num, raiz);
        }
        
    }
    
    // Insertar de forma recursivamente
    private void insertaRec(int num, Nodo n){
        
        // Inserta de forma recursiva si la RAIZ igual a NULA
        // Recibe: Int y Nodo
        
        // Si NUM es menor a NUM.RAIZ: Inserta a la izquierda de RAIZ
        if(num < n.getDato()){
            // 
            if(n.getHijoIzq() == null){
                // Si RAIZ.HIJOIzq es igual a NULL, se agrega a la izquierda de RAIZ
                n.setHijoIzq(new Nodo(num));
            }else{
                // Sino vuelve a llamarse con una nueva raiz
                insertaRec(num, n.getHijoIzq());
            }
        // Si NUM es MAYOR a NUM.RAIZ: Inserta a la derecha de RAIZ
        }else{
            if(n.getHijoDer() == null){
                // Si RAIZ.HIJODer es igual a NULL, se agrega a la derecha de RAIZ
                n.setHijoDer(new Nodo(num));
            }else{
                // Sino vuelve a llamarse con una nueva raiz
                insertaRec(num, n.getHijoDer());
            }
        }
        
    }
    
    // Metodo de Recorrido inOrden
    public void inOrden(){
        
        // Si RAIZ es diferente de NULL
        if(raiz != null){
            System.out.println("InOrden");
            // Llamado recursivo
            inOrdenRec(raiz);
        }
        
    }
    
    // Recursivo de inOrden
    private void inOrdenRec(Nodo n){
        
        // Recorre e imprime los datos
        
        // Siempre que trabajemos con recursividad es recordar que debe haber una condicion de parada
        // Nunca pueden haber ciclos
        
        if(n != null){
            inOrdenRec(n.getHijoIzq());
            System.out.print(" " + n);
            inOrdenRec(n.getHijoDer());
        }
        
    }
    
    // Metodo de Recorrido PreOrden
    public void preOrden(){
        
        if(raiz != null){
            System.out.println("PreOrden");
            preOrdenRec(raiz);
        }
        
    }
    
    private void preOrdenRec(Nodo n){
        
        if(n != null){
            System.out.print(" " + n);
            preOrdenRec(n.getHijoIzq());
            preOrdenRec(n.getHijoDer());
        }
        
    }
    
    // Metodo de Recorrido PostOrden
    public void postOrden(){
        
        if(raiz != null){
            System.out.println("PostOrden");
            postOrdenRec(raiz);
        }
        
    }
    
    private void postOrdenRec(Nodo n){
        
        if(n != null){
            postOrdenRec(n.getHijoIzq());
            postOrdenRec(n.getHijoDer());
            System.out.print(" " + n);
        }
        
    }
    
    // Metodo de Recorrido inOrden
    public void imprimirMenor(){
        
        if(raiz != null){
            System.out.println("El menor: ");
            imprimirMenorRec(raiz);
        }
        
    }

    private void imprimirMenorRec(Nodo n){
        
        if(n.getHijoIzq() != null){
            imprimirMenorRec(n.getHijoIzq());
        }else{
            System.out.println("El numero menor es: " + n.getDato());
        }
        
    }
    
    // Contar nodos 1
    public void imprimeCantidadNodos(){
        
        if(raiz != null){
            imprimeCantidadNodos(raiz);
        }
        
    }
    
    private void imprimeCantidadNodos(Nodo n){
        
        int counter = 0;
        
        if(n != null){
            imprimeCantidadNodos(n.getHijoIzq());
            imprimeCantidadNodos(n.getHijoDer());
            System.out.println("Nivel: " + 0);
        }
        
    }
    
    // Metodo contar nodos 2 (funcional y llamado en el main)
    public void contarNodos() {
        
        int cant = 0;
        
        if(raiz != null){
            cant = contarNodosRec(raiz);
        }
        
        System.out.println("El arbol tiene " + cant + " nodos.");
        
    }
    
    private int contarNodosRec(Nodo n){
        
        if(n != null){
            int nodosIzq = contarNodosRec(n.getHijoIzq());
            int nodosDer = contarNodosRec(n.getHijoDer());
            int nodos = nodosDer + nodosIzq + 1;
            return nodos;
        }else{
            return 0;
        }
        
    }
    
    // Metodo altura
    public void alturaArbol(){
        
        int altura = 0;
        
        if(raiz != null){
            altura = alturaArbolRec(raiz);
        }
        
        System.out.println("El arbol tiene una altura de " + altura);
        
    }
    
    private int alturaArbolRec(Nodo n){
        
        if(n != null){
            
            int alturaHijoIzq = alturaArbolRec(n.getHijoIzq());
            int alturaHijoDer = alturaArbolRec(n.getHijoDer());
            if(alturaHijoIzq > alturaHijoDer){
                alturaHijoIzq = alturaHijoIzq + 1;
                return alturaHijoIzq;
            }else{
                alturaHijoDer = alturaHijoDer + 1;
                return alturaHijoDer;
            }
        }else{
            return 0;
        }
        
    }
    
    // Imprimir hojas de arbol binario
    public void arbolBinarioHojas() {
	if(raiz != null){ // Evaluar si la raiz es NULL o no
                System.out.println("Hojas de arbol binario: ");
                // Llamado recursivo
		arbolBinarioHojasRec(raiz);
	}else{
		System.out.println("El arbol esta vacio");
	}
    }

    private void arbolBinarioHojasRec(Nodo n){
        // Evaluar
        // el hijo izquierdo es diferente de NULL
	if(n.getHijoIzq() != null){
            // llamar recursivamente al siguiente nodo izquierdo
            arbolBinarioHojasRec(n.getHijoIzq());
            // Si el nodo izquierdo es null, llamaremos al nodo derecho
            if(n.getHijoDer() != null){
                // llamar recursivamente al siguiente nodo derecho
                arbolBinarioHojasRec(n.getHijoDer());
            }
	}else{
            // imprimir el dato
            System.out.print(n.getDato() + ", ");
	}
    }
    
    public void arbolImprimeNivel(int nivel){
        // evaluar si la raiz es diferente de null
        if(raiz != null){
            System.out.println("Datos de nivel " + nivel + ": ");
            arbolImprimeNivelRec(raiz, 0 ,nivel);
        }else{
            // Si el arbol esta vacio desplega mensaje
            System.out.println("El arbol esta vacio");
        }
    }
    
    public void arbolImprimeNivelRec(Nodo n, int level, int aBuscar){
        if(n != null){
            arbolImprimeNivelRec(n.getHijoDer(), level + 1, aBuscar);
            if(level == aBuscar){
                
            }
        }
    }
    
}