package cl.ds.app.mystore.helper;

import cl.ds.app.mystore.model.entity.Gpu;

import java.util.ArrayList;
import java.util.List;

//Creo la clase GpuHelper
public class GpuHelper {

    private static Gpu gpu;     //Creo un objeto llamado gpu de la clase Gpu

    private static List<Gpu> gpuList = new ArrayList<>();   //Creo una lista llamada gpuList que contendra objetos de la clase Gpu

    public static void main(String[] args) {
        //llamo desde la main al metodo crearGpuVacio que me agregara un objeto de la clase Gpu con los valores getteados
        agregarGpu(crearGpuVacio());

        //llamo desde la main al metodo crearGpuConParametros que me agregara un objeto de la clase Gpu con los valores setteados
        agregarGpu(crearGpuConParametros1());
        agregarGpu(crearGpuConParametros2());

        //me imprime la lista llamada gpulist que contiene objetos gpu que agregue en las lineas anteriores
        System.out.println(gpuList);

        elimitarGpu("1");
        System.out.println(gpuList);
    }

    //Creo un metodo de la clase Gpu que me tomara los valores de la clase Gpu y me devolvera un nuevo objeto gpu
    private static Gpu crearGpuVacio(){
        gpu = new Gpu();
        gpu.getId();
        gpu.getModelo();
        gpu.getMemoria();
        gpu.getFrecuenciaCore();
        gpu.getFrecuenciaMemorias();
        gpu.getBus();
        gpu.getFabricante();

        return gpu; //Como el metodo no es void si o si me debe retornar algo, en este caso un objeto gpu
    }
    //Creo un metodo de la clase Gpu que en los que puedo settear los valores de la clase Gpu y me devolvera un nuevo objeto gpu
    private static Gpu crearGpuConParametros1(){
        gpu = new Gpu();
        gpu.setId("1");
        gpu.setModelo("GTX10090");
        gpu.setMemoria("24GB");
        gpu.setFrecuenciaCore("12000MHz");
        gpu.setFrecuenciaMemorias("8000MHz");
        gpu.setBus("320bit");
        gpu.setFabricante("Evga");

        return gpu;
    }
    //Creo otro metodo mas para agregar el segundo objeto con parametros setteado
    private static Gpu crearGpuConParametros2(){
        gpu = new Gpu();
        gpu.setId("2");
        gpu.setModelo("GTX1060");
        gpu.setMemoria("6GB");
        gpu.setFrecuenciaCore("3000MHz");
        gpu.setFrecuenciaMemorias("4500MHz");
        gpu.setBus("320bit");
        gpu.setFabricante("Evga");

        return gpu;
    }

    //Creo metodo para agregar un nuevo objeto gpu a la lista
    private static List<Gpu> agregarGpu(Gpu placaVideo) {
        gpuList.add(placaVideo);
        return gpuList;
    }
    //TODO arreglar para que pueda borrar objetos por id de alguna manera (pensar mejor en la condicion if)
    private static List<Gpu> elimitarGpu (String id){
        if (id == gpu.getId())
        gpuList.remove(gpu);
        return gpuList;
    }
}
