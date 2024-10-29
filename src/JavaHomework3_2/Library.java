package JavaHomework3_2;

    // 书类
    class Book {
        private String title; // 书名
        private boolean isAvailable; // 是否可借

        public Book(String title) {
            this.title = title;
            this.isAvailable = true; // 默认可借
        }

        public String getTitle() {
            return title;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void borrow() {
            if (isAvailable) {
                isAvailable = false; // 借出后不可借
            }
        }

        public void returnBook() {
            isAvailable = true; // 归还后可借
        }
    }

    // 学生类
    class Student {
        private String name; // 学生姓名
        private BorrowCard borrowCard; // 借书卡

        public Student(String name) {
            this.name = name;
            this.borrowCard = new BorrowCard();
        }

        public String getName() {
            return name;
        }

        public BorrowCard getBorrowCard() {
            return borrowCard;
        }
    }

    // 借书卡类
    class BorrowCard {
        // 可以扩展借书卡的属性，例如借书数量等
    }

    // 图书馆类
    public class Library {
        private Book[] books; // 书籍数组
        private int count; // 当前书籍数量
        private static final int MAX_BOOKS = 100; // 最大书籍数量

        public Library() {
            books = new Book[MAX_BOOKS]; // 初始化书籍数组
            count = 0; // 初始书籍数量为0
        }

        public void addBook(Book book) {
            if (count < MAX_BOOKS) {
                books[count++] = book; // 将书籍添加到数组
            } else {
                System.out.println("图书馆已满，无法添加更多书籍。");
            }
        }

        public boolean borrowBook(String title) {
            for (int i = 0; i < count; i++) {
                if (books[i].getTitle().equalsIgnoreCase(title) && books[i].isAvailable()) {
                    books[i].borrow();
                    return true; // 借书成功
                }
            }
            return false; // 借书失败

        }
    }