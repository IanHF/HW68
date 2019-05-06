import java.util.ArrayList; 
// import the ArrayList class, not list_ias, as discussed on piazza

public class InsertSort{
    /*Function to sort array using insertion sort*/
    public boolean insertionSort(ArrayList<int> list){ 
        int n = list.size();
        for (int i = 1; i < n; ++i) { 
            int key = list.get(i); 
            int left = i - 1; 
  

            while (left >= 0 && list.get(left) > key) {
                j = list.get(left) 
                list.set(left + 1, j); 
                left = left - 1; 
            } 
            list.set((left + 1), key);
        } 
    }
    //did these two methods out of order. best way to do this is use
    //insert1 inside insertionSort
/*
    public boolean insert1(ArrayList<int> list, int alreadyInserted){
        int valueToInsert = list.get(alreadyInserted);
        int smallest = min(list, 0, alreadyInserted);
        if (valueToInsert < smallest){
            list.set(0,valueToInsert);
        }    

    }
    public int min(ArrayList<int> input, int lowbound, int highbound){
        int small = list.get(lowbound);
        for (int i = 0, int i < alreadyInserted; i++){
            if (list.get(i) < small){
                small = list.get(i);
            }
        }
        return small;
    }
    */
//the above comment block is irrelevant by my implementation of an 
//insertion sort beforehand. Not an attempt to show off, just didn't 
//pay close enough attention to the instructions.
}
