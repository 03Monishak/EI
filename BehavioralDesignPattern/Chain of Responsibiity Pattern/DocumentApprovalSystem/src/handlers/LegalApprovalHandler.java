package handlers;

import model.Document;
import java.util.logging.Logger;

public class LegalApprovalHandler implements ApprovalHandler {

    private static final Logger LOGGER = Logger.getLogger(LegalApprovalHandler.class.getName());
    private ApprovalHandler nextHandler;

    @Override
    public void setNextHandler(ApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Document document) {
        if (document.getDepartment().equalsIgnoreCase("Legal")) {
            LOGGER.info("Legal Department: Document Approved - " + document.toString());
        } else {
            LOGGER.info("Legal Department: Forwarding to next handler...");
            if (nextHandler != null) {
                nextHandler.handleRequest(document);
            } else {
                LOGGER.warning("No handler found for document.");
            }
        }
    }
}