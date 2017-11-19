package view;

import model.Book;

public class Viewer {

    public void printMenu() {
        Menu.show();
    }

    public void printError() {
        System.out.println("Введите правильный номер команды!");
    }

    public void printMessage() {
        System.out.print("Введите необходимый параметр: ");
    }

    public void printResult(Book[] books) {
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
}
