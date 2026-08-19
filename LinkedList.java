class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    
    Node head = null;
    void insertBegining(int data){
        Node newNode =new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data){
        if(head == null){
            insertBegining(data);
        }
        Node newNode = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void indexMiddle(int index, int data){
        if(index < 0){
            System.out.println("invalid Index");
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }


    void delete(int data){
        Node temp = head;
        if(head.data == data){
            head = head.next;
            return;
        }
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Invalid Index");
            return;
        }
        temp.next = temp.next.next;
        
    }

    void deleteIndex(int index){
        if(index < 0){
            System.out.println("invalid Index");
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void search(int data){
        Node temp = head;
        while (temp != null) {
            if(temp != null){
                System.out.println(true);
                return;
            }
            temp = temp.next; 
        }
        System.out.println(false);
    } 

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.println("null");
    }    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertBegining(1);
        list.insertBegining(2);
        list.insertBegining(3);

        list.insertEnd(4);

        list.indexMiddle(2, 5);

        list.delete(5);

        list.deleteIndex(1);

        list.search(3);

        list.display();
    }
}
