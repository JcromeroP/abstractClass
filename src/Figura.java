public abstract class Figura {

    //Este comportamiento será obligatorio en las clases que hereden de figura
    //No se puede instanciar
    abstract double calcularArea();

    void imprimirInformacion(){
        System.out.println("Esta información viene desde la clase abstracta");
    }

}
