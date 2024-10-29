package JavaHomework3;

public class S3_5 {
    public static void main(String[] args) {
        // 创建图书馆并添加书籍
        Library library = new Library();
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Data Structures"));
        library.addBook(new Book("Algorithms"));

        // 创建学生
        Student student = new Student("Alice");

        // 借书过程
        String bookToBorrow = "Java Programming";
        if (library.borrowBook(bookToBorrow)) {
            System.out.println(student.getName() + " 借到了 " + bookToBorrow + " 书。");
        } else {
            System.out.println(student.getName() + " 没有借到 " + bookToBorrow + " 书。");
        }

        // 尝试借同一本书
        if (library.borrowBook(bookToBorrow)) {
            System.out.println(student.getName() + " 借到了 " + bookToBorrow + " 书。");
        } else {
            System.out.println(student.getName() + " 没有借到 " + bookToBorrow + " 书。");
        }
    }
}
