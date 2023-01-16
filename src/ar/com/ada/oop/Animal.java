package src.ar.com.ada.oop;

import src.ar.com.ada.oop.interfaces.LivingBeing;

public class Animal implements LivingBeing {
    public String type;
    public String habitat;
    @Override
    public void eat(String foodName){
        System.out.println("Hola soy un animal y estoy comiendo "+ foodName);
    }
    @Override
    public void sleep (){
        System.out.println("Hola soy un animal y estoy durmiendo");
    }
    @Override
    public void communicate(){
        System.out.println( "HOla soy un animal y me estoy comunicando");
    }
}
