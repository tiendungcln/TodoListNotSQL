import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        TodoManager todoManager = new TodoManager();

        while (true){

            System.out.println("=== Menu Todo List ===");
            System.out.println("1. Xem danh sách việc làm");
            System.out.println("2. Xem 1 việc làm bằng ID");
            System.out.println("3. Tạo việc làm");
            System.out.println("4. Cập nhật việc làm");
            System.out.println("5. Xoá việc làm");

            System.out.print("Nhập choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                case 1:
                    todoManager.getAllTodos();
                    break;

                case 2:
                    todoManager.getTodoById();
                    break;

                case 3:
                    todoManager.createTodo();
                    break;

                case 4:
                    todoManager.updateTodo();
                    break;

                case 5:
                    todoManager.deleteTodo();
                    break;

                default:
                    System.out.println("Invalid choice!");

            }

        }

    }

}
