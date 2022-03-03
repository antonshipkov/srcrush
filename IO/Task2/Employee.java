package IO.Task2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Employee {
    public String fullName;
    public int salary;

    public Employee (String fullName ,int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Employee ( ) {

    }

    @Override
    public String toString ( ) {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void writer (List<Employee> list) throws IOException {
        try (PrintWriter pw = new PrintWriter ( new FileWriter ( "C:\\Users\\Anton\\IdeaProjects\\" +
                "RushHomeWork\\src\\IO\\Task2\\report.txt" ) )) {
            pw.write ( String.valueOf ( list ) );
        }
    }
}

