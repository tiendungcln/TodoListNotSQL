public class Todo {

    private int todo_id;
    private String title;
    private String description;
    private boolean competed;

    public Todo(){}

    public Todo(int todo_id, String title, String description, boolean competed){
        this.todo_id = todo_id;
        this.title = title;
        this.description = description;
        this.competed = competed;
    }

    public int getTodo_id() {
        return todo_id;
    }

    public void setTodo_id(int todo_id) {
        this.todo_id = todo_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompeted() {
        return competed;
    }

    public void setCompeted(boolean competed) {
        this.competed = competed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todo_id=" + todo_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", competed=" + competed +
                '}';
    }

}
