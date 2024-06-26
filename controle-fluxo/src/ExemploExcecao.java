
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) throws ParseException {
        Number valor;
        // EXCEÇÃO UNCHECKED
        // valor = Double.valueOf("a1.75");

        // EXCEÇÃO CHECKED
        valor = NumberFormat.getInstance().parse("a1.75");

        System.out.println(valor);
    }
}
