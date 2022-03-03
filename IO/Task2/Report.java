package IO.Task2;

import java.io.PrintWriter;
import java.util.List;

public class Report {
    public void generateReport (List<Employee> list) {
        try (PrintWriter pw = new PrintWriter ( System.out )) {
            pw.println ( list );
        }

    }
}
