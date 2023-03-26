
public class Link {

    public Object data;                          // Сами данные, которые храним
    public Link next;                            // Ссылка на следующий элемент

    public Link(Object data) {
        this.data = data;
    }

    public void display(){
        System.out.println("{ " + data + " }");
    }

}
