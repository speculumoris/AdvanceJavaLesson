package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType<T> {

    /*
    E --> Element demektir. Collection gibi yapılarda kullanılır.
    K --> Key
    V --> Value
    N --> Number
    T --> Type
    S,U,V , vb --> 2., 3. ve 4. tipler icin
     */

    private T type ; // field,variable

    //Getter - Setter
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    //Main method
    public static void main(String[] args) {
        // Generic yapı kullanılarak aynı Class'tan iki farklı data turunde object olusturunuz

        GenericType<String> obj1=new GenericType<>();
        //Trick : Diamond icine non-primitive type kullanabiliriz.
        obj1.setType("Generic Types");
       // GenericType<String> obj2=new GenericType<>();
        //obj2.setType(65) // String girmem gerekirken int data turune girince CTE verdi

        //NOT: Cast Probleminden nasıl kurtulurum?
        GenericType<Integer> obj3=new GenericType<>();
        obj3.setType(65);

        int a = obj3.getType(); // !!! CAST probleminden kurtulduk..

        //NOT: ClassCastException problemşşnden nasıl kurtulurum ?
        List<String> list=new ArrayList<>();
        list.add("Alper");
        list.add("Halide");
       // list.add(22); //!!! ClassCastException'dan kurtulduk

        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Generic");
       // map.put("Generic",1);



    }

}
