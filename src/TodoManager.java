import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoManager {

    private List<Todo> todos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void getAllTodos(){

        for (Todo todo : todos){
            if (todos.isEmpty()){
                System.out.println("Danh sách việc làm trống!");
            }else {
                System.out.println(todo);
            }
        }

    }

    public void getTodoById(){

        System.out.print("Nhập ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < todos.size(); i++){
            if (id == todos.get(i).getTodo_id()){
                System.out.println(todos.get(i));
                return;
            }
        }

        System.out.println("Không tìm thấy Todo!");

    }

    public void createTodo(){

        System.out.print("Nhập ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập title: ");
        String title = sc.nextLine();

        System.out.print("Nhập description: ");
        String description = sc.nextLine();

        System.out.print("Nhập completed: ");
        boolean completed = sc.nextBoolean();

        Todo todoCreate = new Todo(id, title, description, completed);

        todos.add(todoCreate);

        System.out.println("Tạo Todo thành công!");

    }

    public void updateTodo(){

        System.out.print("Nhập ID cần cập nhật: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < todos.size(); i++){

            if (id == todos.get(i).getTodo_id()){

                System.out.print("Nhập title: ");
                String title = sc.nextLine();

                System.out.print("Nhập description: ");
                String description = sc.nextLine();

                System.out.print("Nhập completed: ");
                boolean completed = sc.nextBoolean();

                todos.get(i).setTitle(title);
                todos.get(i).setDescription(description);
                todos.get(i).setCompeted(completed);

                System.out.println("Cập nhật thành công!");

                return;

            }

        }

        System.out.println("Không tìm thấy Todo!");

    }

    public void deleteTodo(){

        System.out.print("Nhập ID cần xoá: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < todos.size(); i++){
            if (id == todos.get(i).getTodo_id()){
                todos.remove(i);
                System.out.println("Xóa thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy Todo!");

    }

}
