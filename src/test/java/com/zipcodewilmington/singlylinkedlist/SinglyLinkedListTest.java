package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void constructorTest(){
        //Given
        //When
        SinglyLinkedList list = new SinglyLinkedList();
        //Then
        Assert.assertNotNull(list);

    }
    @Test
    public void addNodeTest(){
        //Given
        Node node = new Node();
        //When
        SinglyLinkedList list =new SinglyLinkedList();
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead()));
    }

    @Test
    public void removeTest(){
        //Given
        int expected = 1;
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new Node());
        //When
        list.remove(0);
        //Then
        Assert.assertEquals(expected, list.size());
    }
    @Test
    public void sizeTest(){
        //Given
        int expected = 2;
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new Node());
        //When
        int actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findTest(){
        //Given
        int expected = 2;
        int toFind = 20;
        Node node = new Node();
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(new Node());
        //When
        int actual = list.find(toFind);
        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void containsTest(){
        //Given
        boolean expected = true;
        int toFind = 40;
        Node node = new Node();
        SinglyLinkedList  list = new SinglyLinkedList();
        list.add(new Node());
        //When
        boolean actual = list.contains(toFind);
        //Then
        Assert.assertEquals(expected, actual);

    }
   // @Test
//    public void getTest(){
//        //Given
//        Node node = new Node();
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.add(new Node());
//        //When
//        //Then
//
//    }
//    @Test
//    public void copyTest(){
//        //Given
//        //When
//        //Then
//
//    }
//    @Test
//    public void sortTest(){
//        //Given
//        //When
//        //Then
//    }
}
