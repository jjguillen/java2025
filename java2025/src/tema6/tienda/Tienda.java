package tema6.tienda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> inventario;
    private ArrayList<Compra> compras;

    public Tienda() {
        this.inventario = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        this.inventario.add(producto);
    }

    public void delProducto(String codigo) {
        //Producto prod = null;

        //Si la clase padre es abstracta no es recomendable
        //ProductoBase pb = new ProductoBase(codigo, ....);
        //Equipamiento eq = new Equipamiento(codigo, ....);
        //int posicion = this.inventario.indexOf(pb);
        //this.inventario.remove(posicion);

        for(Producto producto : this.inventario) {
            if (producto.getCodigo().equals(codigo)) {
                this.inventario.remove(producto); //Permitido a partir de la versión 21 Java
                return;
            }
        }

        //this.inventario.removeIf(p -> p.getCodigo().equals(codigo));

    }

    public void updateProducto(String codigo, Double precio, Integer stock) {
        for(Producto producto : this.inventario) {
            if (producto.getCodigo().equals(codigo)) {
                producto.setPrecio(precio);
                producto.setStock(stock);
                return; //No sigas recorriendo el ArrayList, ya lo has encontrado (break)
            }
        }
    }

    public void makeShopping(String codigo, Integer cantidad) throws StockInsuficienteException {
        for(Producto producto : this.inventario) {
            if (producto.getCodigo().equals(codigo)) {
                if (producto.getStock() >= cantidad) {
                    producto.descontarStock(cantidad);
                    Compra compra = new Compra(producto, cantidad);
                    this.compras.add(compra);
                } else {
                    throw new StockInsuficienteException("Stock insuficiente de " + producto.getCodigo());
                }
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("INVENTARIO -------------");
        for(Producto pr : this.inventario) {
            System.out.println(pr.getInfo());
        }
    }

    public void mostrarHistorialCompras() {
        System.out.println("COMPRAS -------------");
        for(Compra copra: this.compras) {
            System.out.println(copra);
        }
    }

}
