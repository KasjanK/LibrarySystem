package com.company;

import java.util.ArrayList;

public class BorrowingService {
    private PaymentService paymentService;
    private Library library;
    private Book book;

    public static int bookPricePerDay = 15;

    public BorrowingService(PaymentService paymentService, Library library, Book book) {
        this.paymentService = paymentService;
        this.library = library;
        this.book = book;
    }

    public Library getBooks() {
        return library;
    }

    // calculates price based on how many days a book is borrowed for
    public int CalculatePrice(BorrowingRequest borrowingRequest) {
        return borrowingRequest.getDaysBorrowing() * bookPricePerDay;
    }

    // sets the book to unavailable if it's paid
    public void borrowBook(Book book, BorrowingRequest borrowingRequest) {
        if (book.isAvailable() && borrowingRequest.isPaid()) {
            book.setAvailable(false);
        }
    }

    // adds comment
    public void addComment(Book book, String comment) {
        ArrayList<String> comments = new ArrayList<>();

        comments.add(comment);
        book.setComments(comments);
    }

    // adds rating
    public void addRating(Book book, double rating) {
        ArrayList<Double> ratings = new ArrayList<>();

        ratings.add(rating);
        book.setRatings(ratings);
    }

    
}
