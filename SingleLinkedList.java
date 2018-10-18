class Link{

    private int data;
    public Link next;

    public Link(int data){
        this.data = data;
    }

    public void display(){
        System.out.println("Data entered is: "+data);
    }
}

class SingleLinkedList {

    private Link first;
    private Link last;
    public SingleLinkedList(){
        this.first = null;
        this.last = null;
    }

    public Boolean isEmpty(){
        if(first == null)
            return true;
        else
            return false;
    }

    public void insertFirst(int data){
        Link NewLink = new Link(data);

        if(isEmpty())
            last = NewLink;
        NewLink.next = first;
        first = NewLink;
    }

    public void insertLast(int data){
        Link NewLink = new Link(data);

        if(isEmpty())
            first = NewLink;
        else {
            Link current = first;
            while (current.next!=null){
                current = current.next;
            }
            current.next = NewLink;
            last = NewLink;
        }
    }
    public void diplay(){
        Link current = first;
        while(current != null){
            current.display();
            System.out.println();
            current = current.next;
        }
    }
}
class SingleLinkedListApp{
    public static void main(String[] args) {
        SingleLinkedList LinkedList = new SingleLinkedList();

        LinkedList.insertFirst(55);
        LinkedList.insertFirst(88);
        LinkedList.insertLast(789);
        LinkedList.insertLast(44);

        LinkedList.diplay();
    }
}

