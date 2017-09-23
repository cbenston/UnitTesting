/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chase Benston
 */
public class MyILinksTest {
    
    public MyILinksTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of next method, of class MyILinks.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        ILinkedList<Integer> instance2 = new MyILinks(2);
        instance1.setNext(instance2);        
        ILinkedList expResult = instance2;
        ILinkedList result = instance1.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("next did not produce instance2.");
    }

    /**
     * Test of last method, of class MyILinks.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        ILinkedList<Integer> instance2 = new MyILinks(2);
        ILinkedList<Integer> instance3 = new MyILinks(3);
        ILinkedList<Integer> instance4 = new MyILinks(4);
        instance1.setNext(instance2);
        instance2.setNext(instance3);
        instance3.setNext(instance4);
        ILinkedList expResult = instance4;
        ILinkedList result = instance1.last();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("last did not produce instance4.");
    }

    /**
     * Test of after method, of class MyILinks.
     */
    @Test
    public void testAfter() {
        System.out.println("after");
        int n = 2;
        ILinkedList<Integer> instance1 = new MyILinks(1);
        ILinkedList<Integer> instance2 = new MyILinks(2);
        ILinkedList<Integer> instance3 = new MyILinks(3);
        ILinkedList<Integer> instance4 = new MyILinks(4);
        instance1.setNext(instance2);
        instance2.setNext(instance3);
        instance3.setNext(instance4);
        ILinkedList expResult = instance3;
        ILinkedList result = instance1.after(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("after did not produce instance3.");
    }

    /**
     * Test of detach method, of class MyILinks.
     */
    @Test
    public void testDetach() {
        System.out.println("detach");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        ILinkedList<Integer> instance2 = new MyILinks(2);
        ILinkedList<Integer> instance3 = new MyILinks(3);
        ILinkedList<Integer> instance4 = new MyILinks(4);
        instance1.setNext(instance2);
        instance2.setNext(instance3);
        instance3.setNext(instance4);
        instance1.detach();
        ILinkedList expResult = null;
        ILinkedList result = instance1.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("detach did not... detach.");
    }

    /**
     * Test of get method, of class MyILinks.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        Object expResult = 1;
        Object result = instance1.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("get did not produce 1.");
    }

    /**
     * Test of set method, of class MyILinks.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        instance1.set(5);
        Object expResult = 5;
        Object result = instance1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("set did not produce 5.");
    }

    /**
     * Test of setNext method, of class MyILinks.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        ILinkedList<Integer> instance2 = new MyILinks(2);
        instance1.setNext(instance2);
        Object expResult = instance2;
        Object result = instance1.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("setNext did not produce instance2.");
    }

    /**
     * Test of append method, of class MyILinks.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        ILinkedList<Integer> instance2 = new MyILinks(2);
        ILinkedList<Integer> instance3 = new MyILinks(3);
        ILinkedList<Integer> instance4 = new MyILinks(4);
        instance1.setNext(instance2);
        instance3.setNext(instance4);
        instance1.append(instance3);
        Object expResult = instance4;
        Object result = instance1.last();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Append did not produce instance4.");
    }

    /**
     * Test of insert method, of class MyILinks.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        ILinkedList<Integer> instance1 = new MyILinks(1);
        ILinkedList<Integer> instance2 = new MyILinks(2);
        ILinkedList<Integer> instance3 = new MyILinks(3);
        ILinkedList<Integer> instance4 = new MyILinks(4);        
        instance2.setNext(instance3);
        instance3.setNext(instance4);
        instance1.insert(instance2);
        Object expResult = instance2;
        Object result = instance1.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Insert did not produce instance2.");
    }
    
}
