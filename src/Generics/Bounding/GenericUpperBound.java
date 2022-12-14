package Generics.Bounding;

public class GenericUpperBound<T extends  Number> { //!!! üstten sınırlıyorum
        private  T[] numberArray;

    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }
    // array in degelerini ortalamasını bulan method
    public double getAvarage(){
        double sum=0;
        for (T t: numberArray) {
            sum+=t.doubleValue(); // double tipine donduruyor
        }
        double avg=sum/numberArray.length;
        return avg;
    }

    public static void main(String[] args) {
        Integer[] intArray ={2,3,7,33};

        GenericUpperBound<Integer> obj1=new GenericUpperBound<>(intArray);

        System.out.println(obj1.getAvarage());

        Double[] doubleArray={2.5,4.6,7.8};
        GenericUpperBound<Double> obj2=new GenericUpperBound<>(doubleArray);
        System.out.println(obj2.getAvarage());

        //Bu class'ta -number class oldugu icin- String calismaz


    }
}
