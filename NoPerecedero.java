package Empresa;

public class NoPerecedero extends Producto {
    private TipoProducto tipo;

    public NoPerecedero(int codigo, String descripcion, double precio, TipoProducto tipo) {
        super(codigo, descripcion, precio);
        this.tipo = tipo;
        validarTipo();
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    private void validarTipo() {
        if (tipo == null) {
            tipo = TipoProducto.B;
        }
    }

    @Override
    public double calcularPrecioVenta() {
        double precio = getPrecio();

        switch (tipo) {
            case A:
                return precio * 1.03;
            case B:
                return precio * 1.02;
            case C:
                return precio * 1.015;
            default:
                return precio * 1.02;
        }
    }
}
