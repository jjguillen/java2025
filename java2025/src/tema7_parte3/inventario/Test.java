package tema7_parte3.inventario;

import tema7_parte3.inventario.io.FileUtils;
import tema7_parte3.inventario.models.Departamento;
import tema7_parte3.inventario.models.EstadoMaterial;
import tema7_parte3.inventario.models.Material;
import tema7_parte3.inventario.models.TipoMaterial;
import tema7_parte3.inventario.services.Inventario;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        try {
            Inventario inventario = new Inventario(FileUtils.loadMaterialCSV());
            inventario.getMateriales().forEach(System.out::println);

            //Añadimos material
            inventario.addMaterial(new Material("8ff6ce90-778e-49af-9031-f79287701869",
                    "Impresora láser", "Impresora multifuncional láser",
                    EstadoMaterial.DEFECTUOSO, TipoMaterial.PERIFERICO, Departamento.INFORMATICA,
                    FileUtils.buscar(2l, FileUtils.loadLocalizacionesCSV())));

            //Eliminamos material
            inventario.removeMaterial("59177db0-2919-4f0d-9d59-243260946d0c");

            //Grabamos a disco
            //FileUtils.saveMaterialesCSV(inventario.getMateriales());

            inventario.materialesPorLocalizacion();
            inventario.materialesPorDepartamento();
            inventario.materialesPorEstado();
            System.out.println("Materiales tirar de Informática:");
            inventario.materialesParaTirarInformatica()
                    .forEach(System.out::println);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
