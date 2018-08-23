
package practica1;


public class Practica1 {

   
    public static void main(String[] args) {
        sistemasDeAudio sA=new sistemasDeAudio("lg","audifonos","rojo",1000,5);
        sistemasDeAudio sA2=new sistemasDeAudio("sony","bocina","gris",500,7);
        sistemasDeAudio sA3=new sistemasDeAudio("beats","audifonos","blanco",3000,5);
        sistemasDeAudio sA4=new sistemasDeAudio("lg","teatro en casa","azul",5000,7);
        System.out.println("Marca "+sA.getMarca()+" Tipo "+sA.getTipo()+" Color "+sA.getColor()+" Precio "+sA.getPrecio()+" Canales "+sA.getCanales());
        System.out.println("Marca "+sA2.getMarca()+" Tipo "+sA2.getTipo()+" Color "+sA2.getColor()+" Precio "+sA2.getPrecio()+" Canales "+sA2.getCanales());
        System.out.println("Marca "+sA3.getMarca()+" Tipo "+sA3.getTipo()+" Color "+sA3.getColor()+" Precio "+sA3.getPrecio()+" Canales "+sA3.getCanales());
        System.out.println("Marca "+sA4.getMarca()+" Tipo "+sA4.getTipo()+" Color "+sA4.getColor()+" Precio "+sA4.getPrecio()+" Canales "+sA4.getCanales());
       
        

    }
    
}
