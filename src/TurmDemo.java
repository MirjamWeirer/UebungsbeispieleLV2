public class TurmDemo {
    public static void main(String[] args) {
        int number = 2;
        int counter = 2;
        int result;
        while (counter <= 9){
            result = number * counter;
            System.out.println(number + " * " + counter + " = " + result);
            number = result;
            counter++;
        }
        counter = 2;
        while (counter <=9){
            result = number / counter;
            System.out.println(number + " / " + counter + " = " + result);
            number = result;
            counter++;
        }
    }
}
