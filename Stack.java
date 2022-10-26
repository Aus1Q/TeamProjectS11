package TP;

import java.util.Scanner;


public class Stack{
    
    Node top;
    
    public Stack()
    {
        this.top = null;
    }
    
    public void push(String item)
    {
       Node insert = new Node(item, null);
       
       if (this.top == null)
       {
           this.top = insert;
       }
       else
       {
           insert.setNext(this.top);
           this.top = insert;
       }
       
       System.out.println(item + " has been added to the Stack");
       System.out.println("");
    }
    
    public String peek()
    {
        return this.top.getData();
    }
    
    public String peek2()
    {
        return this.top.next.getData();
    }
    
    public String pop()
    {   
        String returnVal = this.top.getData();
        this.top = this.top.getNext();
        return returnVal;
    }
    

    
    public static void main(String[]ags){
        Stack stack = new Stack();
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name1 = userInput.nextLine();
        System.out.print("");
        
        stack.push(name1);
        
        System.out.println("Please enter a name: ");
        String name2 = userInput.nextLine();
        System.out.println("");
        stack.push(name2);
        
        System.out.println("Peek used on stack returns: " + stack.peek());
        System.out.println("");
        System.out.println("Peek2 method used on stack returns: " + stack.peek2());
        System.out.println("");
        stack.pop();
        System.out.println("*Pop method used on stack*");
        System.out.println("");
        System.out.println("Peek used on stack returns: " + stack.peek());
        System.out.println("");
        
    }
}