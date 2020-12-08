package Logica;

public class Producto implements Comparable<Producto>{
    public String nombre;
    public String Litros;
    public int Precio;

    @Override
    public String toString() {
        return "" +"Nombre: " + nombre + " /// Litros: " + Litros + " /// Valor: " + Precio;
    }
    
    public Producto() {
    }

    public Producto(String nombre, String contenido, int valor) {
        this.nombre = nombre;
        this.Litros = contenido;
        this.Precio = valor;
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

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public int compareTo(Producto t) {
        return this.Precio-t.Precio;
    }
    
}
