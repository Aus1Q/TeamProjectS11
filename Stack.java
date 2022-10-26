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
        Stack test = new Stack();
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name1 = userInput.nextLine();
        
        
        test.push(name1);
        
        System.out.println("Please enter a name: ");
        String name2 = userInput.nextLine();
        
        test.push(name2);
        System.out.println("The top of the stack is: " + test.peek());
        System.out.println("Beneath the top of the stack is: " + test.peek2());
        test.pop();
        System.out.println(test.peek());
    }
}