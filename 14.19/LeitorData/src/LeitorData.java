import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class LeitorData {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Insira uma data no formato MM/DD/YYYY:");
        String Data = a.next();
        a.close();
        SimpleDateFormat Formato1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat Formato2 = new SimpleDateFormat("MMMM dd, yyyy");
        try {
            Date D = Formato1.parse(Data);
            System.out.println("Data no formato MMMM dd, yyyy: " + Formato2.format(D));
        } catch (Exception e) {
            System.out.println("Data inválida. Por favor insira uma data válida no formato MM/DD/YYYY.");
        }
    }
}
