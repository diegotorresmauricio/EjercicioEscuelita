package Logica;

public class Gaseosa extends Producto{

    public Gaseosa() {
    }

    public Gaseosa(String nombre, String Litros, int valor) {
        super(nombre, Litros, valor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLitros() {
        return Litros;
    }

    public void setLitros(String Litros) {
        this.Litros = Litros;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int valor) {
        this.Precio = valor;
    }
    
    
}
