package Logica;

public class Shampoo extends Producto {

    public String Contenido;

    public Shampoo(String Contenido, String nombre, String contenido, int valor) {
        super(nombre, contenido, valor);
        this.Contenido = Contenido;
    }

    public Shampoo() {
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + Contenido + " /// Valor: " + Precio;
    }

    
}
