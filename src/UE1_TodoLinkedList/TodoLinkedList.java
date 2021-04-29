package UE1_TodoLinkedList;

public class TodoLinkedList {
    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {     //append(anhängen): am Ende hinzufühgen
        // TODO: Implementierung vervollständigen

        //Knote erstellen
        Node newNode =new Node();
        newNode.setTodoText(todoText);
        //Sonderfall 1 Liste noch leer
        if(first==null){
            first=newNode;
            newNode.setNext(null);//non necesario viene fatto automaticamente
            last=first;
        }
        //Fall 2: die Liste ist nicht leer
        else
        {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteLastTodoText() {   //last Node löschen
        //Fall1 : die Liste ist leer
        if(first== null){
            return;   //nichts zu tun
        }
        //Fall 2: eine Element
        else if(first==last){
            first=null;
            last =null;
        }
        //Fall 3: die Liste ist nicht leer
        else
        {        //Vorgänge finden
            Node  currentNode =first;   //hilfsvariable
            while (currentNode.getNext()!=last) {
                currentNode = currentNode.getNext();  //weitersprigen
            }
            currentNode.setNext(null);
            last=currentNode;    //Last neue setzten
        }
    }

    public String getTodoTextAtIndex(int index) {
        //
        Node currentNode =first;
        int counter=0;
        while(counter < index) {
            if(currentNode.getNext() == null)
                return null;
            else {
            currentNode = currentNode.getNext();
            counter++;
            }
        }
        return currentNode.getTodoText();
    }
}
