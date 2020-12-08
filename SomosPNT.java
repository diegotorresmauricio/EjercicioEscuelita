package Logica;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SomosPNT {

    public static void main(String[] args) {
       
        //declaro los objetos
        Gaseosa coca1 = new Gaseosa();
        coca1.setNombre("Coca-Cola Zero" );
        coca1.setLitros("1.5");
        coca1.setPrecio(20);
       
        Gaseosa coca2 = new Gaseosa();
        coca2.setNombre("Coca-Cola");
        coca2.setLitros("1.5");
        coca2.setPrecio(18);
        
        Shampoo shampoo1 = new Shampoo();
        shampoo1.setNombre("Sedal");
        shampoo1.setContenido("500ml");
        shampoo1.setPrecio(19);
        
        Fruta fruta1 = new Fruta();
        fruta1.setNombre("Frutillas");
        fruta1.setPrecio(64);
        fruta1.setUnidad_venta("kilo");
        
        //creo una lista
        ArrayList<Producto> lista = new ArrayList<Producto>();
        
        lista.add(coca1);
        lista.add(coca2);
        lista.add(shampoo1);
        lista.add(fruta1);
        
        //imprimo lista de productos
        lista.forEach(System.out::println);
        System.out.println("=============================");
        //imprimo mayores y menores               
        Producto productoMayorPrecio = Collections.max(lista, Comparator.comparing(c -> c.getPrecio()));
        System.out.println("Producto mas caro: " + productoMayorPrecio.getNombre());
        
        Producto productoMenorPrecio = Collections.min(lista, Comparator.comparing(c -> c.getPrecio()));
        System.out.println("Producto mas barato: " + productoMenorPrecio.getNombre());
        
    }
    
}
