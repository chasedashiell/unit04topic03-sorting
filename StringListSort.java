import java.util.ArrayList;

public class StringListSort {

    public static void selectionSort(ArrayList<String> list){
        String minValue = list.get(0);
        int minIndex = 0;

        for (int i = 1; i < list.size(); i++){
            if (minValue.compareTo(list.get(i)) < 0){
                String tmp = minValue;
                minValue = list.get(i);
                list.set(i, tmp);
                list.set(minIndex, list.get(i));
                minIndex++;
            }
        }
    }
    
    public static void main(String[] args) {
        
    }
}