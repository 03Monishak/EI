package com.example.ebookreader;

// Concrete Adapter for PDF format
public class PDFAdapter implements FormatAdapter {
    private PDFBook pdfBook;

    public PDFAdapter(PDFBook pdfBook) {
        this.pdfBook = pdfBook;
    }

    @Override
    public void read(String bookTitle) {
        pdfBook.openPDF(bookTitle);
    }
}