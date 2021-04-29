package UE3_BookStack;

public class BookStack
{
    // *** Membervariablen ***
    private Node top;
    //private Node prev;

    // *** Getter- und Setter-Methoden ***

    public Node getTop()
    {
        return top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {

        Node newNode=new Node(bookTitle);
        newNode.setNext(top);
        top=newNode;

    }

    public String pop() throws StackEmptyException
    {
        Node tempNode=top;
        if (top ==null) throw new StackEmptyException();
        else {
            top=top.getNext();
        }
        return tempNode.getBookTitle();
    }

    public int getCount()
    {
        int count=0;
        Node currentNode=top;
//        if(currentNode==null) return  0;
//        else {
//
//            while (currentNode.getNext()!=null){
//                count++;
//                currentNode=currentNode.getNext();
//            }
//        }
        while(currentNode!=null) {
            count++;
            currentNode=currentNode.getNext();
        }
        return count;
    }
}
