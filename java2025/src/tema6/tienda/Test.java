package tema6.tienda;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<ProductoBase> products = new ArrayList<ProductoBase>();

        Equipamiento eq = new Equipamiento("Pr1", "Pr1", 100.0, 5, "", "Adidas");
        RopaDeportiva rp = new RopaDeportiva("Rp1", "Rp1", 100.0, 5, "", TipoRopa.CHAQUETA);

        products.add(eq);
        products.add(rp);

        //Objeto utilizado para buscar
        Equipamiento eq2 = new Equipamiento("Rp1", "Rp1", 0.0, 0, "", "Adidas");
        //ProductoBase es abstracta

        System.out.println(products.indexOf(eq));
        System.out.println(products.indexOf(eq2));

        Tienda tienda = new Tienda();
        tienda.addProducto(eq);
        tienda.addProducto(rp);
        tienda.mostrarInventario();
        tienda.delProducto(eq2.getCodigo());
        tienda.mostrarInventario();

    }
}
