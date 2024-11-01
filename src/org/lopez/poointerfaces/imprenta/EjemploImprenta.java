package org.lopez.poointerfaces.imprenta;

import org.lopez.poointerfaces.imprenta.modelo.*;
import static org.lopez.poointerfaces.imprenta.modelo.Genero.*;
import static org.lopez.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("john", "Doe"),
                "Ingeniero de Sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Eric", "Gamma"),
                "Patrones de diseños: Elem. Reusables POO",
                PROGRAMACION);

        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));


        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"),
                "Estudio sobre microservicios");
//        imprimir(cv);
//        imprimir(informe);
//        imprimir(libro);
//        a travez de la interface/ -- metodo static de la interface
//        Imprimible.imprimir(cv);
//        Imprimible.imprimir(informe);
//        Imprimible.imprimir(libro);
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        // clase anonima de Imprimible
//        imprimir(new Imprimible() {
//        });  lo mismo a continuacion
        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        };
        imprimir(objImp);

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

//    public static void imprimir(Imprimible imprimible) {
//        System.out.println(imprimible.imprimir());
//    }
}
