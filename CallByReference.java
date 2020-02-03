public class CallByReference
{
    public static void main(String[] args) {
        int primitiveValue=100;
        int[] intArray = new int[10];
        callByValue(primitiveValue);
        System.out.println("The value of primitive value after execution"+primitiveValue);

        callByReference(intArray);
        System.out.print("The value of array element after execution");

    }
    public static void callByValue(int value){
        ++value;
    }
    public static void callByReference(int[] array){
        System.out.println("The value initially "+array[0]);
        array[0]=15;
        System.out.println("The value initially "+array[0]);

    }
}