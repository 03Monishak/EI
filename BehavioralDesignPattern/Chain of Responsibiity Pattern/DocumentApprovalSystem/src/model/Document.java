package model;

public class Document {
    private String title;
    private double amount;
    private String department;

    public Document(String title, double amount, String department) {
        this.title = title;
        this.amount = amount;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Document [Title=" + title + ", Amount=" + amount + ", Department=" + department + "]";
    }
}