package src.ar.com.ada.oop;

import src.ar.com.ada.oop.interfaces.LivingBeing;

public class Person implements LivingBeing {
    public   String name;
    public String phoneNumber;
    public String email;

    public void  sayHello(String nameToSayHello){
        System.out.println("Hello "+ nameToSayHello);


    }

    @Override
    public void eat (String name){
        System.out.println("Hola soy una persona y estoy comiendo " + name);
    }
    @Override
    public void sleep(){
        System.out.println("Hola soy una persona que estoy durmiendo" + name);

    }
    @Override
    public void communicate(){
        System.out.println("Hola soy una persona y me estoy comunicando " + name);
    }
}
