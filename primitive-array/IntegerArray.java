
import java.util.Arrays;

class IntegerArray{
    public static void main(String arg[]){
        //normal initialization of values to array
        int numbers[]={1,2,3,4};
        System.out.println("The elements in the Array (For-loop):");
        System.out.println();
        //for-loop to iterate through the array
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+"\t");
        }
        System.out.println();
        //Declare array with default size which initialize the array with values as zero initially
        int numbers1[]=new int[5];
        //For-each to iterate through the array
        System.out.println("The elements in the Array (For-each): Before assining values");
        System.out.println();
        for(int value:numbers1)
        System.out.print(value+"\t");
        System.out.println();
        for (int i=0;i<5;i++){
            numbers1[i]=i;
        }
        System.out.println("The elements in the Array (Array built-in method): After intialization");
        System.out.println();
        //Using the Array method to print array elements
        System.out.print(Arrays.toString(numbers1));
        System.out.println();

        Arrays.fill(numbers1, 1);
        System.out.println("The elements in the Array (Array built-in method): After fill it with Array.fill()");
        System.out.println(Arrays.toString(numbers1));

        System.out.println();
        
        //Cloning the original array will completely change the numbers1 array and contents and size to original array
        numbers1=numbers.clone();
        System.out.println("The elements in the Array (Array built-in method): After cloned the values from numbers[]");
        System.out.println(Arrays.toString(numbers1));

        System.out.println();

        numbers1=Arrays.copyOf(numbers, numbers1.length);
        System.out.println("The elements in the Array (Array built-in method): After cloned the values from numbers[]"); 
        System.out.print(Arrays.toString(numbers1));
    }
}


