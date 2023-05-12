public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Book other) {
        // Önce, alfabetik sıralama
        int titleCompare = this.title.compareTo(other.title);
        if (titleCompare != 0) {
            return titleCompare;
        }

        // Alfabelerin aynı olması durumda yazarları sıralar
        int authorCompare = this.author.compareTo(other.author);
        if (authorCompare != 0) {
            return authorCompare;
        }

        // Yazarlar aynı ise yıllarına göre sıralar
        return other.year - this.year;
    }
}
