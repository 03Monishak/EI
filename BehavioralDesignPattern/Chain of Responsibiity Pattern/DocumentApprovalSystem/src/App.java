import model.Document;
import service.ApprovalService;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ApprovalService approvalService = new ApprovalService();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            LOGGER.info("Enter Document Title: ");
            String title = scanner.nextLine();

            LOGGER.info("Enter Document Amount: ");
            double amount = Double.parseDouble(scanner.nextLine());

            LOGGER.info("Enter Document Department (Finance, Legal, Procurement): ");
            String department = scanner.nextLine();

            Document document = new Document(title, amount, department);

            approvalService.submitDocument(document);

            LOGGER.info("Do you want to submit another document? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                running = false;
            }
        }

        scanner.close();
        LOGGER.info("Exiting the system.");
    }
}