import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960),
                new Book("Pride and Prejudice", "Jane Austen", 1813),
                new Book("1984", "George Orwell", 1949),
                new Book("Animal Farm", "George Orwell", 1945),
                new Book("Don Kişot", "Miguel de Cervantes", 1605),
                new Book("Sefiller", "Victor Hugo", 1862),
                new Book("Kırmızı ve Siyah", "Stendal", 1830)
        };

        Arrays.sort(books);

        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }
    }
}