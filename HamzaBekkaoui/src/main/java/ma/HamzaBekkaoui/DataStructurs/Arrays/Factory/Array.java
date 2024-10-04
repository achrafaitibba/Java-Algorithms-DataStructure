package ma.HamzaBekkaoui.DataStructurs.Arrays.Factory;

public interface Array<Type> {

    Type add(Type item);
    Type remove(int index);
    Type remove(Type item);
    Type update(int index , Type item);
    int indexOf(Type item);
    Type get(int index);
    int size();

    boolean contains(Type item);
    Type[] copy();

}
