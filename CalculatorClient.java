public class CalculatorClient{
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.print("Sum is ="+calculator.add(45,90));
        System.out.print("Difference is ="+calculator.subtract(450,90));
        System.out.print("Multiply is ="+calculator.multiply(4,90));
        System.out.print("Divivde is ="+calculator.divide(45,90));
    }
}