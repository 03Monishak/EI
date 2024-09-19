package handlers;

import model.Document;

public interface ApprovalHandler {
    void setNextHandler(ApprovalHandler nextHandler);
    void handleRequest(Document document);
}