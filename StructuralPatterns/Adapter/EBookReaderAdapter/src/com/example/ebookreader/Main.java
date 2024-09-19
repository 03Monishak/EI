package com.example.ebookreader;

public class Main {

    public static void main(String[] args) {
        // Using the e-book reader with different formats using adapters
        EBookReader pdfReader = new PDFAdapter(new PDFBook());
        EBookReader epubReader = new EPUBAdapter(new EPUBBook());
        EBookReader mobiReader = new MobiAdapter(new MobiBook());

        // Read different book formats
        pdfReader.read("Java Programming in PDF");
        epubReader.read("Learn Python with EPUB");
        mobiReader.read("Data Structures with Mobi");
    }
}