package cl.ds.app.mystore.helper;

import cl.ds.app.mystore.model.entity.CoolerCpu;
import cl.ds.app.mystore.model.entity.PlacaMadre;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParameterList;

import java.util.*;

public class PlacaMadreHelper {

    //Variable placaMadre tipo PlacaMadre
    private static PlacaMadre placaMadre;

    //Lista (Para traer el objeto como matriz)
    private static List<PlacaMadre> placaMadreList = new ArrayList<>();

    //Método main
    public static void main(String[] args){
    addPlacaMadre(crearPlacaMadre()); //añadir objeto placa madre
        addPlacaMadre(crearPlacaMadre2());
        addPlacaMadre(crearPlacaMadre3());//no lo añade porque ya existe
        System.out.println(placaMadreList);
    //removePlacaMadre(crearPlacaMadre2());
    System.out.println(placaMadreList);
        removeById("1");
        System.out.println(placaMadreList);
     }

     //Constructor vacío
    private static PlacaMadre crearPlacaMadre(){
        placaMadre = new PlacaMadre();
        placaMadre.setId("1");
        placaMadre.setChipset("AMD TRX40");
        placaMadre.setSocket("sTRX4");
        placaMadre.setFabricante("Asus");
        placaMadre.setFormato("EATX");
        placaMadre.setMemorias("DDR4");
        return placaMadre;
    }

    private static PlacaMadre crearPlacaMadre2(){
        placaMadre = new PlacaMadre();
        placaMadre.setId("2");
        placaMadre.setChipset("AMD TRX40");
        placaMadre.setSocket("sTRX4");
        placaMadre.setFabricante("Asus");
        placaMadre.setFormato("EATX");
        placaMadre.setMemorias("DDR4");
        return placaMadre;
    }

    private static PlacaMadre crearPlacaMadre3(){
        placaMadre = new PlacaMadre();
        placaMadre.setId("2");
        placaMadre.setChipset("AMD TRX40");
        placaMadre.setSocket("sTRX4");
        placaMadre.setFabricante("Asus");
        placaMadre.setFormato("EATX");
        placaMadre.setMemorias("DDR4");
        return placaMadre;
    }

    //Añadir
    private static List<PlacaMadre> addPlacaMadre(PlacaMadre placaMadre){
        if (!placaMadreList.contains(placaMadre)){//añadir solo si el objeto no existe
        placaMadreList.add(placaMadre);
        }
        return placaMadreList;
    }

    //Eliminar
    private static List<PlacaMadre> removePlacaMadre(PlacaMadre placaMadre){
        if (placaMadreList.contains(placaMadre)){ //si existe se elimina
            placaMadreList.remove(placaMadre);
        }
        return placaMadreList;
    }
    //existe por ID

    private static boolean existeId(String id) {
        boolean esVlido = false;
        System.out.println("existe??? " + placaMadre.getId());
        System.out.println("existe??? " + placaMadre.getId().equals(id));

        System.out.println("placa.getId() " + placaMadre.getId());
        for (PlacaMadre placa: placaMadreList) {
            System.out.println("placa " + placa);
            if (placa.getId().equals(id)) {
                System.out.println("lo encontre!!");

                esVlido = true;
                break;
            }
        }
        return esVlido;
    }

    private static void removeById(String id) {
        Optional placaMadreOpt = placaMadreList.stream()
                .filter(placaMadre -> placaMadre.getId().equals(id))
                .findFirst();
        if (placaMadreOpt.isPresent()) {
            placaMadreList.remove(placaMadreOpt.get());
            System.out.println("largo lista " + placaMadreList.size());
            System.out.println("La placa con ID " + id + " fue eliminada");
        } else {
            System.out.println("No se encuentra la placa madre, intente con otro ID");
        }
    }


    }

