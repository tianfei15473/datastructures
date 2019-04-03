package Chap03;

public class ArraySelectApp {

    public static void main(String[] args) {
        ArraySelect arraySelect = new ArraySelect(10);

        arraySelect.insert(10);
        arraySelect.insert(20);
        arraySelect.insert(30);
        arraySelect.insert(100);
        arraySelect.insert(22);
        arraySelect.insert(33);
        arraySelect.insert(12);
        arraySelect.insert(6);
        arraySelect.insert(120);
        arraySelect.insert(108);

        arraySelect.display();

        arraySelect.selectSort();

        arraySelect.display();
        
    }
    
}
