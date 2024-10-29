package JavaHomework3_3;

import java.util.Scanner;

public class S3_6 {
    public static void main(String[] args) {
        // 创建ATM机和账户
        ATM atm = new ATM();
        atm.addAccount(new Account("1001", "Alice", 5000.0, "password123"));
        atm.addAccount(new Account("1002", "Bob", 3000.0, "mypassword"));

        Scanner scanner = new Scanner(System.in);

        // 用户登录
        System.out.print("请输入账号: ");
        String accountNumber = scanner.nextLine();
        System.out.print("请输入密码: ");
        String password = scanner.nextLine();

        Account loggedInAccount = atm.login(accountNumber, password);

        if (loggedInAccount != null) {
            // 进行存款或取款
            while (true) {
                System.out.println("\n选择操作：1. 存款  2. 取款  3. 退出");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: // 存款
                        System.out.print("请输入存款金额: ");
                        double depositAmount = scanner.nextDouble();
                        loggedInAccount.deposit(depositAmount);
                        break;
                    case 2: // 取款
                        System.out.print("请输入取款金额: ");
                        double withdrawAmount = scanner.nextDouble();
                        loggedInAccount.withdraw(withdrawAmount);
                        break;
                    case 3: // 退出
                        System.out.println("退出成功。");
                        scanner.close();
                        return;
                    default:
                        System.out.println("无效的选择，请重试。");
                }
            }
        }
    }
}
