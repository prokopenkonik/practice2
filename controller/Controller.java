package controller;

import model.Bookshelf;
import view.Viewer;
import java.util.Scanner;

public class Controller {
    private Viewer view;

    public Controller() {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.generateBooks();
        view = new Viewer(bookshelf);
    }

    public void run() {
        int commandNum;
        Scanner in = new Scanner(System.in);
        String data = "";
        while (true) {
            view.printMenu();

            if (in.hasNext()) {
                commandNum = in.nextInt();
                in.nextLine();
            } else {
                continue;
            }

            if (commandNum == 0) {
                break;
            }

            if (commandNum >= 1 && commandNum <= 3) {
                view.printMessage();
                if (in.hasNext()) {
                    data = in.nextLine();
                }
                view.printResult(data, commandNum);
                continue;
            }

            if (commandNum == 4) {
                view.printSortedBooks();
            }

            view.printError();
        }
    }
}
