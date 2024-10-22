package JavaHomework3;

public class Book {
    private String bookNo;
    private String bookTitle;
    private String author;
    private int yearPublished;
    public Book(){
    }

    public Book(String bookNo, String bookTitle, String author, int yearPublished) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public void showBookNo()
    {
        System.out.println("书号为：" + this.bookNo);
    }
    public void showBookTitle()
    {
        System.out.println("书名为：" + this.bookTitle);
    }
    public void showAuthor()
    {
        System.out.println("作者为：" + this.author);
    }
    public void showYearPublished()
    {
        System.out.println("出版年份为：" + this.yearPublished);
    }
    public void modifyYearPublished(int newYear)
    {
        this.yearPublished = newYear;
    }


}
