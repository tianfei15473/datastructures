package Chap03;

public class ArrayBubApp {

    public static void main(String[] args) {
        ArrayBub arrayBub = new ArrayBub(10);

        arrayBub.insert(10);
        arrayBub.insert(20);
        arrayBub.insert(30);
        arrayBub.insert(100);
        arrayBub.insert(22);
        arrayBub.insert(33);
        arrayBub.insert(12);
        arrayBub.insert(6);
        arrayBub.insert(120);
        arrayBub.insert(108);

        arrayBub.display();

        arrayBub.bubbleSort();

        arrayBub.display();
    }

}
