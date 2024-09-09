import java.text.NumberFormat;

public class Main {
    public static void main(String[] args){
        //Format Number

//        NumberFormat currency = new NumberFormat()
//       NumberFormat currency = NumberFormat.getCurrencyInstance();
//      String result = currency.format(1234567.981);

//        NumberFormat percent = NumberFormat.getCurrencyInstance();
//        String result = percent.format(0.1);

        String result = NumberFormat.getCurrencyInstance().format(0.1);
        System.out.println(result);
    }
}