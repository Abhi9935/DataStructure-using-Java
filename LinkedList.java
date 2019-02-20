class Node{
    public Node next;
    public Object data;
}
class LinkedList{
    private Node head;
    
    public void add(Object data){
        if (this.head == null){
            this.head = new Node();
            this.head.data = data;
            this.head.next = null;
        }
        else{			
            Node currentHead = this.head;
            Node newNode = new Node();
            newNode.data = data;
            while (currentHead.next != null){
              currentHead = currentHead.next;
            }
            currentHead.next = newNode;
        }
    }
    public void printAllNodes(){
        Node currentHead = this.head;
        while (currentHead != null){
            System.out.println(currentHead.data);
            currentHead = currentHead.next;
        }
    }
   public int getSize(){ 
        Node current  = this.head; 
        int count = 0; 
        while (current  != null){ 
            count++; 
            current  = current .next; 
        } 
        return count; 
    }
    // Recursive get Count
    public int getSizeRec(Node node){ 
        if (node == null) 
            return 0;
        return 1 + getSizeRec(node.next); 
    }
    /* Wrapper over getSizeRec() */
    public int getCount(){ 
        return getSizeRec(head); 
    } 
    public void addFirst(Object data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = this.head;
        this.head = newNode;
    }
    public void addLast(Object data){
        if (this.head == null){
            this.head = new Node();
            this.head.data = data;
            this.head.next = null;
        }
        else{
            Node newNode = new Node();
            newNode.data = data;
            Node currentHead = head;
            while (currentHead.next != null){
                currentHead = currentHead.next;
            }
            currentHead.next = newNode;
        }
    }
    // removeEl by given element
    public void removeEl(Object data){
        Node currentHead = this.head;
        Node prevHead = null;
		    // CASE 1: if data is holds by the Head Node  
        if (currentHead != null && currentHead.data == data) { 
            this.head = currentHead.next; 
            return;
        } 
        // Case 2: if data is holds by the Node other than Head
        while (currentHead != null && currentHead.data != data) {
            prevHead = currentHead; 
            currentHead = currentHead.next; 
        }
        if (currentHead != null) { 
            prevHead.next = currentHead.next; 
        }
        // Case 3: The data is not present
        if (currentHead == null) { 
            System.out.println(data + " not found"); 
        }
     }	
}
