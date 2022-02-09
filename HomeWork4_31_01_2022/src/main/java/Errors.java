public enum Errors {
    ERROR400("Bad Request"),
    ERROR401("Unauthorized"),
    ERROR402("Payment Required"),
    ERROR403("Forbidden"),
    ERROR404("Not Found");

    private String description;

    Errors(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
