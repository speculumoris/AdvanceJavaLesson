package Generics.Method;

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethodDemo ob1= new GenericMethodDemo();
        Integer[] intArray={1,23,54,56,45};
        Double[]  doubleArray={1.2,2.4,5.6,9.3};

        ob1.print(intArray);
        ob1.print(doubleArray);
    }

    public void print(Integer[] arr){

    }
    public void print (Double[] arr1){

    }

    public <T> void print(T[] array){
        for (T t:array) {
            System.out.println(t);
        }
    }
}
