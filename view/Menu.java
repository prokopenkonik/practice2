package view;

class Menu {
    static void show() {
        System.out.print("1. Получить список книг по автору.\n" +
                "2. Получить список книг по издательству.\n" +
                "3. Получить список книг, изданных позже указанного года.\n" +
                "4. Упорядочить книги по издательствам.\n" +
                "0. Выход\n\n" +
                "Введите номер команды: ");
    }
}
