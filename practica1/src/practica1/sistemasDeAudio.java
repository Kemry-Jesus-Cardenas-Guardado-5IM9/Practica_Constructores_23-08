
package practica1;

public class sistemasDeAudio {
    private String marca;
    private String tipo;
    private String color;
    private int precio;
    private int canales;
    public sistemasDeAudio(String marca){
        this.marca=marca;
        this.tipo="tipo";
        this.color="color";
        this.precio=123;
        this.canales=12;
    }
    public sistemasDeAudio(String marca,String tipo){
        this.marca=marca;
        this.tipo=tipo;
        this.color="color";
        this.precio=123;
        this.canales=12;
    }
    public sistemasDeAudio(String marca,String tipo,String color){
        this.marca=marca;
        this.tipo=tipo;
        this.color=color;
        this.precio=123;
        this.canales=12;
    }
    public sistemasDeAudio(String marca,String tipo,String color, int precio){
        this.marca=marca;
        this.tipo=tipo;
        this.color=color;
        this.precio=precio;
        this.canales=12;
    }
    public sistemasDeAudio(String marca,String tipo,String color, int precio, int canales){
        this.marca=marca;
        this.tipo=tipo;
        this.color=color;
        this.precio=precio;
        this.canales=canales;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCanales() {
        return canales;
    }

    public void setCanales(int canales) {
        this.canales = canales;
    }
    
}
