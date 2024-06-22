import java.util.Scanner;

public abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; }
    public Shape getNext() { return next; }
    public abstract void draw();
}
class Line extends Shape{
    public Line(){}
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public Rect(){}
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public Circle(){}
    public void draw(){
        System.out.println("Circle");
    }
}
class GraphicEditor{
    private Shape head, tail;
    public GraphicEditor(){
        head = null;
        tail = null;
    }
    public void insert(){
        Shape insertItem = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int shapeCategory = scanner.nextInt();
        switch(shapeCategory){
            case 1:
                insertItem = new Line();
                break;
            case 2:
                insertItem = new Rect();
                break;
            case 3:
                insertItem = new Circle();
                break;
            default:
                System.out.println("잘못된 입력입니다.(1-3 사이의 정수를 입력해주세요)");
                return;
        }
        if(head == null){
            head = insertItem;
            tail = insertItem;
        }
        else{
            tail.setNext(insertItem);
            tail = insertItem;
        }

    }
    public void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 도형의 위치>>");
        int pos = scanner.nextInt();
        if (pos <= 0 || head == null) {
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        Shape current = head;
        Shape prev = null;
        for(int i = 0; i < pos-1; i++){
            if (current == null) {
                System.out.println("삭제할 수 없습니다.");
                return;
            }
            prev = current;
            current= current.getNext();
        }

        if(current == null){
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        else if(prev == null){
            head = head.getNext();
            if(head == null){
                tail = null;
            }
        }
        else{
            prev.setNext(current.getNext());
            if(current == tail){
                tail = prev;
            }
        }
    }
    public void print(){
        Shape current = head;
        while(current != null){
            current.draw();
            current = current.getNext();
        }
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int editCategory = scanner.nextInt();
            if(editCategory == 4){
                System.out.print("beauty를 종료합니다.");
                break;
            }
            if(editCategory == 1){
                insert();
            }
            if(editCategory == 2){
                delete();
            }
            if(editCategory == 3){
                print();
            }
        }
    }
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.run();
    }
}