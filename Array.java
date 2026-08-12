import javax.naming.directory.SearchControls;

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
            System.out.println("Cant Insert");
            return false;
        }
        for(int i=size; i > index; i--){
            arr[i] = arr[i-1];
        } 
        arr[index] = element;
        size++;

        return true;
    }

    int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid Index");
            return -9999;
        }
        return arr[index];
    }

    void set(int index, int element){
        if(index < 0 || index >= size){
            System.out.println("Invalid Index");
        }
        arr[index] = element;
    }

    void display(){
        for(int i=0; i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    int search(int element){
        for(int i=0; i<size; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    boolean delete(int index){
        if(index < 0 || index >= size){
            System.out.println("Cannot Delete the value");
            return false;
        }
        for(int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return false;
    }

    public static void main (String[] args){

        Array arr1 = new Array(5);

        arr1.insert(0, 5);
        arr1.insert(1, 15);
        arr1.insert(2, 10);
        arr1.insert(3, 20);
        arr1.insert(4, 30);

        arr1.display();

        System.out.println("Get Value = " + arr1.get(0));

        arr1.set(1,98);

        arr1.delete(1);

        arr1.display();

        System.out.println("Search Value = " + arr1.search(20));

    }

}
