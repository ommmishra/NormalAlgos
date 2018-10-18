class Link{

    private int data;
    public Link next;
    public Link prev;

    public Link(int data){
        this.data = data;
    }

    public void display(){
        System.out.println("The data is: "+data);
    }

}

class DoublyLinkedList {

    private Link first;
    private Link last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        if(first == null)
            return true;
        else
            return false;

    }

    public void insertFirst(int data){
        Link NewLink = new Link(data);

        if(isEmpty()){

            last = NewLink;
            NewLink.next = first;
            NewLink.prev = null;
            first = NewLink;
        }
        else {
            first.prev = NewLink;
            NewLink.next = first;
            first = NewLink;
        }
    }
    public void insertLast(int data){

        Link NewLink = new Link(data);

        if(isEmpty()){
            first = NewLink;
            NewLink.prev = last;
            NewLink.next = null;
            last = NewLink;
        }

        else{
            Link current = first;
            while(current.next != null){
                current = current.next;
            }
            NewLink.prev = current;
            current.next = NewLink;
            last = NewLink;
        }

    }

    public void displayBackward(){
        Link current = last;
        while (current != null){
            current.display();
            current = current.prev;

        }

    }

    public void display() {

        Link current = first;
        while (current != null)
        {
            current.display();
            current = current.next;

        }

    }}

    class doublyLinkedListApp{

        public static void main(String[] args) {
            DoublyLinkedList List = new DoublyLinkedList();


            List.insertLast(367); List.insertLast(33); List.insertLast(37);


            List.displayBackward();

        }

    }