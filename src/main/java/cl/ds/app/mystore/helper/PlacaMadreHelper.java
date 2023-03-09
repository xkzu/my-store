package cl.ds.app.mystore.helper;

import cl.ds.app.mystore.model.entity.PlacaMadre;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PlacaMadreHelper {

    //Variable placaMadre tipo PlacaMadre
    private static PlacaMadre placaMadre;

    //Lista (Para traer el objeto como matriz)
    private static List<PlacaMadre> placaMadreList = new ArrayList<>();

    //Método main
    public static void main(String[] args){

     }

     //Constructor vacío
    private static PlacaMadre crearPlacaMadre(){
        placaMadre = new PlacaMadre();
        placaMadre.setChipset("AMD TRX40");
        placaMadre.setSocket("sTRX4");
        placaMadre.setFabricante("Asus");
        placaMadre.setFormato("EATX");
        placaMadre.setMemorias("DDR4");
        return placaMadre;
    }

    //Añadir
    private static List<PlacaMadre> addPlacaMadre(PlacaMadre placaMadre){
        placaMadreList.add(placaMadre);
        return placaMadreList;
    }

    //Eliminar
    //TODO investigar y aplicar método eliminar por objeto

    //Validaciones

    //existe por ID
}