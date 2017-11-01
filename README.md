# tarea1segundoparcial

public class Personas { 

    creo las variables que voy a utilizar para realizar las operaciones   
     
    public  String nombre;
    public String apellido;
    public  int edad;

      
   creo un constructor de la clase personas que contenga las variables que cree anteriormente
  
    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
   
    declaro una clase de tipo estatico que contenga un arreglo donde se
    guardara la informacion que estara almacenada directamente 

    private static Personas[] listapersonas={

            new Personas("juan","veliz",21),
            new Personas("cristian","ramos",23),
            new Personas("josue","cordoba",15),
            new Personas("alaster","nehemias",15),

    };
 El método matches de String nos permite comprobar
 si un String cumple una expresión regular pasado como parámetro. Si es cierta devuelve true, sino false
 
   en esta parde llamo el nombre tipo string que voy a comparar y a comparar con todos
   los demas que tengo en listapersonas donde utilizo el metodo 
   de startswith que me buscara las primeras letras o palabras del nombre  
   que yo le introduzca  y hace la comparacion asi mismo cuando encuentre los que se parecen me los muestre
   en el siclo for el cual yo llamare en el controller Personas.Primernombre(buscar.getText());  que esta en el on
   action de enviar 
   para que este me lo imprima  un sout para que me lo imprima aqui en consola 
 
    public static void Primernombre(String nombre){
        String nombres="";
        for (int i=0;i<listapersonas.length;i++){

            if (listapersonas[i].nombre.startsWith(nombre)){

                System.out.println(listapersonas[i].nombre+" "+listapersonas[i].apellido+" "+listapersonas[i].edad);
            }

        }


    }
}
