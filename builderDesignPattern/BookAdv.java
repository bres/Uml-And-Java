package smallApps.builderDesignPattern;

import smallApps.shopping.ShoppingItem;

public class BookAdv implements ShoppingItem {

    //fields
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;

    //static factory
    //μπορώ και καθορίζω ενα άλλο όνομα για την δημιουργία του constructor
    public static BookAdv getInstance() {
        return new BookAdv();
    }

    //default constructor
    //δεσμέυομαι με τα ονόματα των καυτασκευαστών
    //δεν μπορώ να επσιτρέψω subtypes πχ cd
    public BookAdv() {
    }

//overloaded constructor
// έχω 8 συνδυάσμους κατασκευαστών που θα μπορουαν να καλέσω κρίνοντας απο τα ορίσματα
//    public BookAdv(String bookTitle, String bookAuthor, String pubYear) {
//        this.bookTitle = bookTitle;
//        this.bookAuthor = bookAuthor;
//        this.pubYear = pubYear;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", pubYear='" + pubYear + '\'' +
                '}';
    }
}
