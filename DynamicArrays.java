public class DynamicArrays {

    int[] arr;
    int size;
    int capacity;

    public DynamicArrays(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];

    }

    boolean insert (int index, int element){
        if(index < 0 || index > size){
            System.out.println("Cant Insert");
            return false;
        }

        if(size >= capacity ){
            resize();
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
        return true;
    }

    void resize(){
        //int newCapacity = 2*capacity;

        capacity = 2*capacity;
        //int [] newArr = new int[newCapacity];
        int [] newArr = new int[capacity];

        for(int i=0; i<size; i++)
        {
            newArr[i] = arr[i];
        }

        arr = newArr;
        //capacity = newCapacity;

    }

    public static void main (String[] args){

        DynamicArrays arr1 = new DynamicArrays(5);

        arr1.insert(0, 5);
        arr1.insert(1, 15);
        arr1.insert(2, 10);
        arr1.insert(3, 20);
        arr1.insert(4, 30);
        arr1.insert(5, 40);
        arr1.insert(6, 50);

        System.out.println("Size of Arrya = " + arr1.capacity);


        arr1.display();

        System.out.println("Get Value = " + arr1.get(0));

        arr1.set(1,98);

        arr1.delete(1);

        arr1.display();

        System.out.println("Search Value = " + arr1.search(20));

    }
    
}
