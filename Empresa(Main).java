package Empresa;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

       productos.add(new Perecedero(111, "Carne", 12.50, 2));
       productos.add(new Perecedero(112, "Pollo", 10.20, 3));
       productos.add(new Perecedero(113, "Pan", 2.80, 1));

       productos.add(new NoPerecedero(211, "Lentejas", 4.70, TipoProducto.B));
       productos.add(new NoPerecedero(212, "Aceite", 9.30, TipoProducto.A));
       productos.add(new NoPerecedero(213, "Harina", 3.90, TipoProducto.C));
       for (Producto producto : productos) {
            imprimirFormato1(producto);
        }

        for (Producto producto : productos) {
            imprimirFormato2(producto);
        }
    }

    private static void imprimirFormato1(Producto producto) {
        if (producto instanceof Perecedero) {
            Perecedero perecedero = (Perecedero) producto;
            System.out.println("Perecedero, " + perecedero.getCodigo() + ", "
                    + perecedero.getDescripcion() + ", " + perecedero.getPrecio() + ", "
                    + perecedero.getDiasACaducar());
        } else if (producto instanceof NoPerecedero) {
            NoPerecedero noPerecedero = (NoPerecedero) producto;
            System.out.println("No Perecedero, " + noPerecedero.getCodigo() + ", "
                    + noPerecedero.getDescripcion() + ", " + noPerecedero.getPrecio() + ", "
                    + noPerecedero.getTipo());
        }
    }

    private static void imprimirFormato2(Producto producto) {
        if (producto instanceof Perecedero) {
            Perecedero perecedero = (Perecedero) producto;
            System.out.println("Perecedero, " + perecedero.getCodigo() + ", "
                    + perecedero.getDescripcion() + ", " + perecedero.getPrecio() + ", "
                    + perecedero.getDiasACaducar() + ", " + perecedero.calcularPrecioVenta());
        } else if (producto instanceof NoPerecedero) {
            NoPerecedero noPerecedero = (NoPerecedero) producto;
            System.out.println("No Perecedero, " + noPerecedero.getCodigo() + ", "
                    + noPerecedero.getDescripcion() + ", " + noPerecedero.getPrecio() + ", "
                    + noPerecedero.getTipo() + ", " + noPerecedero.calcularPrecioVenta());
        }
    }
}
