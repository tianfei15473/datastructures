package Chap03;

public class ArrayInsertApp {
    public static void main(String[] args) {
        ArrayInsert arrayInsert = new ArrayInsert(10);

        arrayInsert.insert(10);
        arrayInsert.insert(20);
        arrayInsert.insert(30);
        arrayInsert.insert(100);
        arrayInsert.insert(22);
        arrayInsert.insert(33);
        arrayInsert.insert(12);
        arrayInsert.insert(6);
        arrayInsert.insert(120);
        arrayInsert.insert(108);

        arrayInsert.display();

        arrayInsert.insertSort();

        arrayInsert.display();
    }
    
}
