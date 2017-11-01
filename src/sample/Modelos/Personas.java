package sample.Modelos;

/**
 * Created by veliz on 30/10/2017.
 */
public class Personas {

    public  String nombre;
    public String apellido;
    public  int edad;



    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    private static Personas[] listapersonas={

            new Personas("juan","veliz",21),
            new Personas("cristian","ramos",23),
            new Personas("josue","cordoba",15),
            new Personas("alaster","nehemias",15),

    };


    public static void Primernombre(String nombre){
        String nombres="";
        for (int i=0;i<listapersonas.length;i++){

            if (listapersonas[i].nombre.startsWith(nombre)){

                System.out.println(listapersonas[i].nombre+" "+listapersonas[i].apellido+" "+listapersonas[i].edad);
            }

        }


    }
}
