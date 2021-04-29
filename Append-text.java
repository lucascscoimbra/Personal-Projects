import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintStackTrace {

    public static void main(String[] args) {

StackTraceBeta
        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        String text = "Second Test";
 main
        try {
            int division = 0 / 0;
        } catch (ArithmeticException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
        }
    }
}
