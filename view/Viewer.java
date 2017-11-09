package view;

import model.Book;
import model.Bookshelf;

public class Viewer {
    private Bookshelf bookshelf;

    public Viewer(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    public void printMenu() {
        Menu.show();
    }

    public void printError() {
        System.out.println("Введите правильный номер команды!");
    }

    public void printMessage() {
        System.out.print("Введите необходимый параметр: ");
    }

    public void printResult(String data, int commandNum) {
        Book[] books = bookshelf.getBooks(data, commandNum);
        if (books[0] == null) {
            System.out.println("Пожходящих книг не найдено");
            return;
        }
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void printSortedBooks() {
        Book[] books = bookshelf.sort();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
