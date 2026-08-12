public class Array {

    int[] arr;
    int size;
    int capacity;

    public Array(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];

    }

    boolean insert (int index, int element){
        if(index < 0 || size >= capacity || index > size){
            System.out.println("Invaild");
            return false;
        }
        for(int i=size; i > index; i--){
            arr[i] = arr[i-1];
        } 
        arr[index] = element;
        size++;

        return true;
    }

    void display(){
        for(int i=0; i<size;i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void main (String[] args){

        Array arr1 = new Array(4);

        arr1.insert(0, 5);
        arr1.insert(1, 4);

        arr1.display();

    }

}
