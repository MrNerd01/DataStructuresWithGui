/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author swarathesh60
 */
public class List<T> {
    private Node<T> firstNode,lastNode;
    private String name;
    
    public List(){
        name = "list";
        firstNode=lastNode=null;
    }
    public List(String name){
        this.name=name;
        firstNode=lastNode=null;
    }
    public boolean isEmpty(){
        return firstNode==null;
    }
    //insertion at front
    public void insertAtFront(T insertItem){
    if(isEmpty()){
        firstNode=lastNode= new Node<T>(insertItem);
    }else{
        firstNode = new Node<T>(insertItem,firstNode);
        
    }
   }
    //insert at back 
    public void insertAtback(T insertItem){
         if(isEmpty()){
        firstNode=lastNode= new Node<T>(insertItem);
    }else{
        lastNode.nextNode = new Node<T>(insertItem);
        lastNode = lastNode.nextNode;
    }
   }
    //print result
    public  String Print(){
    String str = null;
    if(isEmpty()){
        str = "Empty list"+ name;
        return str;
    }else{
        str = name+" ";
     }
    Node<T> current = firstNode;
        while (current!=null) {
         str = str + current.getData()+" \n";
         current= current.getNextNode();
         }
    str = str +"\n";
    return str;
    }
    //remove all 
    public void removeAll(){
    firstNode=lastNode=null;
    }
    //remove from front 
    public T removeFromFront() throws EmptyListException 
    {
        if(isEmpty()){
            throw new EmptyListException(name);
    }
        T removedItem = firstNode.getData();
        if (firstNode == lastNode) {
            firstNode=lastNode=null;
        }else
            firstNode=firstNode.getNextNode();
        
        return removedItem;
    }
    
   //remove from back 
    public T removeFromBack() throws EmptyListException{
    if (isEmpty())
         throw new EmptyListException(name);
    T removedItem = lastNode.getData();
    if (firstNode == lastNode) {
            firstNode=lastNode=null;
        }else{
        Node<T> currentNode = firstNode;
        while (currentNode.getNextNode()!=lastNode){
        currentNode = currentNode.getNextNode();
        }
        lastNode = currentNode;
        currentNode.setNextNode(null);
        
       }
      return removedItem;
   }
        
    
    
    
 }
    
            
    
    

