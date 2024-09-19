package service;

import handlers.ApprovalHandler;
import handlers.FinanceApprovalHandler;
import handlers.LegalApprovalHandler;
import handlers.ProcurementApprovalHandler;

public class ApprovalService {

    private ApprovalHandler approvalChain;

    public ApprovalService() {
        // Create the chain of responsibility
        ApprovalHandler financeHandler = new FinanceApprovalHandler();
        ApprovalHandler legalHandler = new LegalApprovalHandler();
        ApprovalHandler procurementHandler = new ProcurementApprovalHandler();

        // Set up the chain
        financeHandler.setNextHandler(legalHandler);
        legalHandler.setNextHandler(procurementHandler);

        this.approvalChain = financeHandler;
    }

    public void submitDocument(model.Document document) {
        this.approvalChain.handleRequest(document);
    }
}