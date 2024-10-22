package JavaHomework3;

public class S3_1 {
    public static void main(String[] args)
    {
        Book b1 = new Book("ISBN123456789","Java Programming","John Doe",2024);
        Book b2 = new Book("ISBN987654321","Data Structures","Jane Smith",2023);
        b1.showBookNo();
        b1.showBookTitle();
        b1.showAuthor();
        b1.showYearPublished();
        b1.modifyYearPublished(2021);
        b1.showYearPublished();
        b2.showBookNo();
        b2.showBookTitle();
        b2.showAuthor();
        b2.showYearPublished();
    }
}
