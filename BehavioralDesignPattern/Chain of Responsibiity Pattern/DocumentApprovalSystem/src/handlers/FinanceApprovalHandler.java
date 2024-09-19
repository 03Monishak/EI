package handlers;

import model.Document;
import java.util.logging.Logger;

public class FinanceApprovalHandler implements ApprovalHandler {

    private static final Logger LOGGER = Logger.getLogger(FinanceApprovalHandler.class.getName());
    private ApprovalHandler nextHandler;

    @Override
    public void setNextHandler(ApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Document document) {
        if (document.getDepartment().equalsIgnoreCase("Finance")) {
            LOGGER.info("Finance Department: Document Approved - " + document.toString());
        } else {
            LOGGER.info("Finance Department: Forwarding to next handler...");
            if (nextHandler != null) {
                nextHandler.handleRequest(document);
            } else {
                LOGGER.warning("No handler found for document.");
            }
        }
    }
}