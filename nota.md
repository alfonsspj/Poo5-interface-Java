




### Interface: es una colección de métodos abstractos(sin implementar) y de valorres constantes que puede realizar un objeto determinado
* el que se hace(comportamiento) - que debe hacer un objeto, una clase pero no su implementación. Las clases que implementan esta interfaz tienen que implementar este metodo

* es similar a una clase abstracta pero no permite que ninguno de sus métodos esté implementado
* Capturar simitudes entre clases no relacionadas sin forzar una relación entre ellas.
* Es decir definen comportamientos que una o varias clases necesitan implementar
* Es un tipo de dato de referencia, puede utilizarse como tipo de datos del objeto(argumento de método y una declaración de variable)

* Las interfaces permiten pasar del estilo de diseño "orientado a la implementación" a uno "orientado a la interfaz"
* donde todas las clases acceden a servicios a traves de interfaces que son implementadas por clases concretas.
* y al no depender de clases concretas(solo de entidades abstractas) nuestro diseño  será más reutilizable
* Herencia multiple a nivel de interfaces

```java
public interface Imprimible{
    public void imprimir();
}

// clases que implementan una interfaz
public class Curriculum implements Imprimible{
    
    @Override
    public void imprimir(){}
}
```


