package TP;



public class Node 
{
    private String data;
    public Node next;
    
    public Node(String data, Node next)
    {
        this.data = data;
        this.next = next;
    }
    
    public String getData()
    {
        return this.data;
    }
    
    public Node getNext()
    {
        return this.next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}