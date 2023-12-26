package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addNodeTest(){
        //Given
        Node node = new Node();
        SinglyLinkedList list =new SinglyLinkedList();
        //When
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead()));
    }

    @Test
    public void removeTest(){
        //Given
        Node node = new Node();
        SinglyLinkedList list = new SinglyLinkedList();
        //When
        list.
    }
}
