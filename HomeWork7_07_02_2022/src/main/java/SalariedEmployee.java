public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int fixedMonthlyPayment;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeID, String name, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Social Security Number: %s, Fixed Monthly Payment: %d",
                employeeID, name, socialSecurityNumber, fixedMonthlyPayment);
    }

    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}
