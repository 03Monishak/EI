package com.example.ebookreader;

// Concrete Adapter for Mobi format
public class MobiAdapter implements FormatAdapter {
    private MobiBook mobiBook;

    public MobiAdapter(MobiBook mobiBook) {
        this.mobiBook = mobiBook;
    }

    @Override
    public void read(String bookTitle) {
        mobiBook.openMobi(bookTitle);
    }
}
