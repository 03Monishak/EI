package com.example.ebookreader;

// Concrete Adapter for EPUB format
public class EPUBAdapter implements FormatAdapter {
    private EPUBBook epubBook;

    public EPUBAdapter(EPUBBook epubBook) {
        this.epubBook = epubBook;
    }

    @Override
    public void read(String bookTitle) {
        epubBook.openEPUB(bookTitle);
    }
}