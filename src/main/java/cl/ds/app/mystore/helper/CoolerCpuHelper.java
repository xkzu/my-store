package cl.ds.app.mystore.helper;

import cl.ds.app.mystore.model.entity.CoolerCpu;

import java.util.ArrayList;
import java.util.List;

public class CoolerCpuHelper {

    private static CoolerCpu coolerCpu;

    private static List<CoolerCpu> coolerCpuList = new ArrayList<>();

    public static void main(String[] args) {
        agregarCooler(crearCoolerCpuConstructorVacio());
        agregarCooler(crearCoolerCpuConstructorConParametros());
        agregarCooler(crearCoolerCpuConstructorVacio());
        agregarCooler(crearCoolerCpuConstructorVacio());
        agregarCooler(crearCoolerCpuConstructorVacio());
        agregarCooler(crearCoolerCpuConstructorVacio());
        agregarCooler(crearCoolerCpuConstructorVacio2());
        System.out.println(coolerCpuList);
        eliminarCoolerPorId("2");
        System.out.println("--------------------------------------------");
        System.out.println(coolerCpuList);
    }

    private static CoolerCpu crearCoolerCpuConstructorVacio() {
        coolerCpu = new CoolerCpu();
        coolerCpu.setId("1");
        coolerCpu.setAltura("1.5");
        coolerCpu.setFabricante("Asus");
        coolerCpu.setPeso("31");
        coolerCpu.setRgb("No");
        coolerCpu.setRpm("2200");
        coolerCpu.setTipo("Agua");
        coolerCpu.setRuido("22");
        coolerCpu.setFlujoDeAire("55");
        return coolerCpu;
    }

    private static CoolerCpu crearCoolerCpuConstructorVacio2() {
        coolerCpu = new CoolerCpu();
        coolerCpu.setId("6");
        coolerCpu.setAltura("1.5");
        coolerCpu.setFabricante("Asus");
        coolerCpu.setPeso("31");
        coolerCpu.setRgb("No");
        coolerCpu.setRpm("2200");
        coolerCpu.setTipo("Agua");
        coolerCpu.setRuido("22");
        coolerCpu.setFlujoDeAire("55");
        return coolerCpu;
    }

    private static CoolerCpu crearCoolerCpuConstructorConParametros() {
        coolerCpu = new CoolerCpu(
                "2",
                "Msi",
                "Aire",
                "23",
                "2500",
                "80",
                "75",
                "5.8",
                "Si"
        );
        return coolerCpu;
    }

    private static List<CoolerCpu> agregarCooler(CoolerCpu cooler) {
        coolerCpuList.add(cooler);
        return coolerCpuList;
    }

    private static boolean existeId(String id) {
        boolean esVlido = false;
        System.out.println("existe??? " + coolerCpu.getId());
        System.out.println("existe??? " + coolerCpu.getId().equals(id));

        System.out.println("coolerCpu.getId() " + coolerCpu.getId());
        for (CoolerCpu culer: coolerCpuList) {
            System.out.println("culer " + culer);
            if (culer.getId().equals(id)) {
                System.out.println("lo encontre!!");
                esVlido = true;
                break;
            }
        }
        return esVlido;
    }

    //TODO modificar el metodo para poder eliminar a traves del objeto y no por index
    private static void eliminarCoolerPorId(String id) {
        boolean existeId = existeId(id);
        System.out.println("existeId [" + existeId + "]");

        if(existeId) {
            System.out.println("es verdadero");
        }
        System.out.println(id);
        int idConvertido = Integer.parseInt(id);
        System.out.println("idConvertido " + idConvertido);
        System.out.println("largo lista " + coolerCpuList.size());

        System.out.println("coolerCpu "+ coolerCpu);
        //TODO aca hay un error
        coolerCpuList.remove(coolerCpu);
        System.out.println("largo lista " + coolerCpuList.size());
    }
}
