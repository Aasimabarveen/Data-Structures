
import java.util.Arrays;


public class IntegerArrayOperations{
    int[] numbers={1,2,3,4,5};
    public void addNewValueToArray(){        
        System.out.println("Original Array: "+Arrays.toString(numbers));
        //Create a copy of the original array to destination array by increasing the destination array
        int[] newNumbers=Arrays.copyOf(numbers, numbers.length+2);
        //Adding new values to array
        for(int i=0;i<newNumbers.length-numbers.length;i++)
            newNumbers[numbers.length+i]=i;
        System.out.println("New Array: "+Arrays.toString(newNumbers));
    }
    public void searchElement(){
        int Element=41;
        for(int value:numbers)
        {
            if(value==Element){
                System.out.println("Found value");
                return;
            }
        }
        System.out.println("Not Found");
    }
    
    public static void main(String[] args){
        IntegerArrayOperations obj=new IntegerArrayOperations();
        //obj.addNewValueToArray();
        obj.searchElement();
    }
}