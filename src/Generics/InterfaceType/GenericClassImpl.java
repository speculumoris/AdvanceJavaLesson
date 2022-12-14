package Generics.InterfaceType;

//Eger bir "generic Interface" implement ederseniz , Class da generic olmali
public class GenericClassImpl<T> implements GenericInterface{

    @Override
    public void setValue(Object o) {

    }

    @Override
    public Object getValue() {
        return null;
    }
}
