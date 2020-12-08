package Logica;

public class Fruta extends Producto {
    public String unidad_venta;

    public Fruta(String unidad_venta, String nombre, String contenido, int valor) {
        super(nombre, contenido, valor);
        this.unidad_venta = unidad_venta;
    }

    public Fruta() {
    }

    public String getUnidad_venta() {
        return unidad_venta;
    }

    public void setUnidad_venta(String unidad_venta) {
        this.unidad_venta = unidad_venta;
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
        return "Nombre: " + nombre + " /// Valor: " + Precio + " /// Unidad de venta: " + unidad_venta;
    }

    
}
