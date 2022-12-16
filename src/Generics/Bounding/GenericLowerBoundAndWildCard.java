package Generics.Bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildCard {
    public static void main(String[] args) {
       //********** addElements methodu

        List<Object> ol=new ArrayList<>();
        addElements(ol);

        List<Number> nl=new ArrayList<>();
        addElements(nl);

        // List<Double> dl=new ArrayList<>();
        // addElements(dl); //CTe , Generic oncesi yapılarda RunTe olurdu.


        // ****************** printElements*************
        printElements(new ArrayList<String>());

        //******print obj ***********
        List<String> strList=new ArrayList<>();
        //printObj(strList); --> CTE

        List<Object> objectList =new ArrayList<>();
        printObj(objectList);



    }
    //super Integer ---> bana Integer'ın parent'larını getir.
    public static void addElements(List<? super Integer> list){
        // ? : WildCard (tipi bilinmeyen)(unidentified data type)
        for (int i = 1; i <=10 ; i++) {
            list.add(i);
        }
    }
    //WildCard sınırlamaları..
    public static  void printElements(List<?>listOfUnknown){
      //  listOfUnknown.add("Java"); --> ? ' dan dolayı DataTürü netleşmeden add methodu gibi işlemleri yaptırmaz

        // listOfUnknown.add(null); --> illa eklenecekse null eklenebilir.
        for (Object object:listOfUnknown){

        }
    }
    // ? --> Object
    public static  void printObj(List<Object> listOfObject){
        listOfObject.add("Java");
        for (Object object : listOfObject) {
            System.out.println(object);
        }
    }
}
