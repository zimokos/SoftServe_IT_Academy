public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIDMember;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public ContractEmployee() {
    }

    public ContractEmployee(String employeeID, String name, String federalTaxIDMember, int hourlyRate, int numberOfHoursWorked) {
        super(employeeID, name);
        this.federalTaxIDMember = federalTaxIDMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getFederalTaxIDMember() {
        return federalTaxIDMember;
    }

    public void setFederalTaxIDMember(String federalTaxIDMember) {
        this.federalTaxIDMember = federalTaxIDMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Federal Tax ID Member: %s, Hourly Rate: %d, Number Of Hours Worked: %d",
                employeeID, name, federalTaxIDMember, hourlyRate, numberOfHoursWorked);
    }

    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
