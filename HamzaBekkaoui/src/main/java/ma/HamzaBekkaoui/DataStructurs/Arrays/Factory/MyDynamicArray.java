package ma.HamzaBekkaoui.DataStructurs.Arrays.Factory;

import java.util.Iterator;

public class MyDynamicArray<Type> implements DynamicArray<Type> , Iterable<Type>{

    private static int DEFAULT_DYNAMIC_ARRAY_SIZE = 10;
    private Type[] dynamicArray;
    private int dynamicArraySize;
    private int elementSize = 0;

    public MyDynamicArray(){
        this.dynamicArraySize = DEFAULT_DYNAMIC_ARRAY_SIZE;
        dynamicArray = (Type[]) new Object[DEFAULT_DYNAMIC_ARRAY_SIZE];
    }

    public MyDynamicArray(int size){
        this.dynamicArraySize = size;
        dynamicArray = (Type[]) new Object[dynamicArraySize];
    }

    @Override
    public void reSize(int newArraySize) {
        Type[] newArray =(Type[]) new Object[newArraySize];
        for (int i = 0; i < elementSize; i++) {
            newArray[i] = dynamicArray[i];
        }
        dynamicArray = newArray;
    }

    @Override
    public Type add(Type item) {
        isArrayFull();
        dynamicArray[elementSize++] = item;
        return item;
    }

    private void isArrayFull(){
        if(dynamicArraySize <= elementSize)
           reSize(dynamicArraySize * 2);
    }

    @Override
    public Type remove(int index) {
        validateIndex(index);
        elementSize--;
        for (int i = index; i < elementSize; i++) {
            dynamicArray[i] =  dynamicArray[i + 1];
        }
        return dynamicArray[index];
    }

    @Override
    public Type remove(Type item) {
        int index = indexOf(item);
        remove(index);
        return item;
    }


    @Override
    public Type update(int index, Type item) {
        validateIndex(index);
        dynamicArray[index] = item;
        return item;
    }

    @Override
    public int indexOf(Type item) {
        if(item instanceof Number){
            for (int i = 0; i < elementSize; i++) {
                if(item == dynamicArray[i])
                    return i;
            }
        }
        else {
            for (int i = 0; i < elementSize; i++) {
                if(item.equals(dynamicArray[i]))
                    return i;
            }
        }
        return -1;
    }

    @Override
    public Type get(int index) {
        validateIndex(index);
        return dynamicArray[index];
    }

    @Override
    public int size() {
        return this.elementSize;
    }

    @Override
    public boolean contains(Type item) {
        return indexOf(item) >= 0;
    }


    @Override
    public Type[] copy() {
        Type[] copyArray = (Type[]) new Object[dynamicArraySize];
        for (int i = 0; i < dynamicArraySize; i++) {
            copyArray[i] = dynamicArray[i];
        }
        return copyArray;
    }


    @Override
    public Iterator<Type> iterator() {
        return new DynamicArrayIterator();
    }


    private  class DynamicArrayIterator implements Iterator<Type>{

        int count = 0;

        @Override
        public boolean hasNext() {
            return count < elementSize;
        }

        @Override
        public Type next() {
            return dynamicArray[count++];
        }

    }


    private void validateIndex(int index) {
        if (index < 0 || index >= elementSize) {
            throw new RuntimeException("Index out of bounds: You are trying to access an element that doesn't exist.");
        }
    }
}
