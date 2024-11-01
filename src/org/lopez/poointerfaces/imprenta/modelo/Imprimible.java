package org.lopez.poointerfaces.imprenta.modelo;

public interface Imprimible {
//    String imprimir(); // metodo sin implementar
//    puoblic es redundante en un metodo interface

    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";
//    con implementacion
    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
