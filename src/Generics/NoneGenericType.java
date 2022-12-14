package Generics;

public class NoneGenericType {

    private Object o;

    //Getter-Setter
    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        NoneGenericType obj1=new NoneGenericType();
        NoneGenericType obj2=new NoneGenericType();

        obj1.setO("Yusuf"); //String ile set edildi
        obj2.setO(65);

        String str1=(String) obj1.getO(); // !!! CAST problemi
        System.out.println(str1);

        String str2=(String) obj2.getO(); // RTE ,, ClassCastException



    }

}
