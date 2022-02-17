import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("ID_001", "Johnny", "SE_001", 1500);
        SalariedEmployee employee2 = new SalariedEmployee("ID_002", "Jenny", "SE_002", 2000);
        SalariedEmployee employee3 = new SalariedEmployee("ID_003", "Danny", "SE_003", 1000);
        ContractEmployee employee4 = new ContractEmployee("ID_004", "Romeo", "CE_001", 20, 160);
        ContractEmployee employee5 = new ContractEmployee("ID_005", "Dimas", "CE_002", 10, 160);
        ContractEmployee employee6 = new ContractEmployee("ID_006", "Vinnie", "CE_003", 15, 160);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6};

        Arrays.sort(employees, Collections.reverseOrder());

        for (Employee employee : employees) {
            System.out.println(employee.info());
        }

        System.out.println();
        System.out.println(employee1.toString());
        System.out.println(employee4.toString());
    }
}
