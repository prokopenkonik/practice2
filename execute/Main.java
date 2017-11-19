package execute;

import controller.Controller;
import model.Bookshelf;
import view.Viewer;

public class Main {
    public static void main(String[] args) {
        Viewer view = new Viewer();
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.generateBooks();
        Controller controller = new Controller(view, bookshelf);
        controller.run();
    }
}
