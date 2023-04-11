package cl.ds.app.mystore.helper;

import cl.ds.app.mystore.model.entity.CoolerCpu;
import cl.ds.app.mystore.model.entity.Gpu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Creo la clase GpuHelper
public class GpuHelper {

    private static Gpu gpu;     //Creo un objeto llamado gpu de la clase Gpu

    private static List<Gpu> gpuList = new ArrayList<>();   //Creo una lista llamada gpuList que contendra objetos de la clase Gpu

    public static void main(String[] args) {
        //llamo desde la main al metodo crearGpuVacio que me agregara un objeto de la clase Gpu con los valores getteados
        //agregarGpu(crearGpuVacio());      //ESTA COMENTADO PORQUE ME GENERA UN NULL POINTER ERROR



        //llamo desde la main al metodo crearGpuConParametros que me agregara un objeto de la clase Gpu con los valores setteados
        agregarGpu(crearGpuConParametros1());
        agregarGpu(crearGpuConParametros2());
        agregarGpu(crearGpuConParametros3());
        agregarGpu(crearGpuConParametros4());
        agregarGpu(crearGpuConParametros5());
        System.out.println("Antes de borrar: " + gpuList); //me imprime la lista llamada gpulist que contiene objetos gpu que agregue en las lineas anteriores
        System.out.println("______________________________________________________");
        eliminarGpuPorID("2");
        System.out.println("______________________________________________________");
        System.out.println("Despues de borrar por primera vez: " + gpuList);
        System.out.println("______________________________________________________");
        eliminarGpuPorID("4");
        System.out.println("______________________________________________________");
        System.out.println("Despues de borrar por segunda vez: " + gpuList);
        System.out.println("______________________________________________________");
        modificarGpu("1");
        System.out.println("______________________________________________________");
        System.out.println("Despues de MODIFICAR");
        System.out.println(gpuList);
        System.out.println("______________________________________________________");
        modificarGpu("40");
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
        gpu = new Gpu("1" , "GTX10090" , "24GB" , "12000MHz" , "8000MHz" , "320bit" , "Evga" );
        return gpu;
    }

    //Creo otro metodo mas para agregar el segundo objeto con parametros setteado
    private static Gpu crearGpuConParametros2(){
        gpu = new Gpu("2", "GTX1060", "6GB" , "3000MHz", "4500MHz", "320bit", "Evga");
        return gpu;
    }

    private static Gpu crearGpuConParametros3(){
        gpu = new Gpu("3", "GTX680", "3GB" , "1500MHz", "450MHz", "320bit", "Msi");
        return gpu;
    }

    private static Gpu crearGpuConParametros4(){
        gpu = new Gpu("4", "GTX480", "1GB" , "700MHz", "450MHz", "320bit", "Msi");
        return gpu;
    }

    private static Gpu crearGpuConParametros5(){
        gpu = new Gpu("5", "GTX560", "2GB" , "800MHz", "450MHz", "320bit", "Evga");
        return gpu;
    }

    //Creo metodo para agregar un nuevo objeto gpu a la lista
    private static List<Gpu> agregarGpu(Gpu placaVideo) {
        gpuList.add(placaVideo);
        return gpuList;
    }


    private static Gpu verificar(String id) {
        Gpu test = new Gpu();

        /*Esto es un for each y no lo habiamos visto ú.u*/
        /*Gpu: es el tipo de dato del arreglo que usamos, osea la clase Gpu de model.entity*/
        /*iGPU: es el identificador que elegi para el iterador GPU que sera de la clase anterior mencionada(Gpu)*/
        /*gpuList: es la lista que quiero que revise 1 a 1*/
        for (Gpu iGPU: gpuList) {
            System.out.println(iGPU);
            if (iGPU.getId().equals(id)) {
                System.out.println("Coinciden id: " + id);
                test = iGPU;
                break;
            } else {
                System.out.println("No coincide id: " +iGPU.getId()+ " distito de " +id);
            }
        }
        return test;
    }

    private static void eliminarGpuPorID(String id){
        //verificar(id); es redundante, ya lo hace en la siguiente linea
        gpuList.remove(verificar(id));
        System.out.println("GPU " + id + " borrada");
    }






                                /*PORQUE KZARKA ES MI AMIGO QUE ME ILUMINO CON SU MALDAD HIZO QUE ESTA MIERDA FUNCIONE*/

    private static boolean existeId(String id) {
        boolean esVlido = false;

        for (Gpu iGPU : gpuList) {
            System.out.println(iGPU);
            if (iGPU.getId().equals(id)) {
                System.out.println("Coinciden id: " + id);
                esVlido = true;
                break;
            } else {
                System.out.println("No coincide id: " + iGPU.getId() + " distito de " + id);
            }
        }
        return esVlido;
    }



        private static Gpu modificarGpu(String id){
        boolean existeId = existeId(id);
        verificar(id);

        if (existeId == true ){
            verificar(id).setModelo(JOptionPane.showInputDialog("Ingrese el modelo de su GPU"));
            verificar(id).setMemoria(JOptionPane.showInputDialog("Ingrese la memoria de su GPU"));
            verificar(id).setFrecuenciaCore(JOptionPane.showInputDialog("Ingrese la frecuencia del nucleo de su GPU"));
            verificar(id).setFrecuenciaMemorias(JOptionPane.showInputDialog("Ingrese la frecuencia de memoria de su GPU"));
            verificar(id).setBus(JOptionPane.showInputDialog("Ingrese el bus de su GPU"));
            verificar(id).setFabricante(JOptionPane.showInputDialog("Ingrese el fabricante de su GPU"));
            gpuList.add(verificar(id));
        }else{
            System.out.println("La GPU solicitada para modificar no existe");
        }
        return gpu;
    }
}
