package model;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books;

    public Book[] getBooks(String data, int commandNum) {
        Book[] selectedBooks = new Book[books.length];
        int index = 0;
        for (Book book : books) {
            switch (commandNum) {
                case 1:
                    if (book.getAuthor().equals(data)) {
                        selectedBooks[index++] = book;
                    }
                    break;
                case 2:
                    if (book.getPublisher().equals(data)) {
                        selectedBooks[index++] = book;
                    }
                    break;
                case 3:
                    if (book.getPublishingYear() > Integer.parseInt(data)) {
                        selectedBooks[index++] = book;
                    }
            }
        }
        return selectedBooks;
    }

    public Book[] getSortedBooks() {
        Arrays.sort(books, new BookPublisherComparator());
        return books;
    }

    public void generateBooks() {
        books = new Book[10];
        books[0] = new Book("Мастер и Маргарита", "Булгаков М. А.",
                "Азбука", 2015, 416, 38);
        books[1] = new Book("Евгений Онегин", "Пушкин А. С.",
                "Мещерякова ИД", 2014, 272, 36);
        books[2] = new Book("Преступление и наказание", "Достоевский Ф. М.",
                "Речь", 2017, 512, 72);
        books[3] = new Book("Маленький принц", "А. С-Экзюпери",
                "Лабиринт", 2016, 28, 30);
        books[4] = new Book("1984", "Дж. Оруэлл",
                "АСТ", 2016, 320, 21);
        books[5] = new Book("Мертвые души", "Гоголь Н. В.",
                "АСТ", 2015, 352, 27);
        books[6] = new Book("Идиот", "Достоевский Ф. М.",
                "Эксмо", 2016, 640, 33);
        books[7] = new Book("Портрет Дориана Грея", "О. Уальд",
                "АСТ", 2017, 320, 40);
        books[8] = new Book("Собачье сердце", "М. А. Булгаков",
                "Речь", 2015, 320, 25);
        books[9] = new Book("Братья Карамазовы", "Достоевский Ф. М.",
                "Эксмо", 2017, 928, 111);
    }
}
