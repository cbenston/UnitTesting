/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut1;

/**
 *
 * @author Cahse Benston
 */
public class MyILinks<T> implements ILinkedList<T> {
    public ILinkedList<T> list;
    public ILinkedList<T> temp;
    public T data;
    
    public MyILinks(T value){
        data = value;
    }
    
    public ILinkedList<T> next(){
        return list;
    }

    /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    public ILinkedList<T> last(){
        temp = list;
        while(temp.next() != null){
            temp = temp.next();
        }
        return temp;
    }

    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    public ILinkedList<T> after(int n){
        temp = list;
        for(int i = 1; i < n; i++){
            temp = temp.next();
        }
        return temp;
    }

    /**
     * Removes the next element (sets null)
     * @return the previously next element
     */
    public ILinkedList<T> detach(){
        list.setNext(null);
        return list;
    }

    /**
     * Gets the current value
     * @return the current value
     */
    public T get(){
        return data;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    public void set(T value){
        data = value;
    }

    /**
     * Sets the next element in the list
     * @param next the next element
     */
    public void setNext(ILinkedList<T> next){
        list = next;
    }

    /**
     * Sets the next element after this current element
     * @param next the next element
     */
    public void append(ILinkedList<T> next){
        list = list.next();
        list = next;
    }
    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
     */
    public void insert(ILinkedList<T> newFirst){
        newFirst.setNext(list);
    }
        
}
