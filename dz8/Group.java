package dz8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {

    private Student starosta;

    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();
    private Map<String, List<Student>> doneTasks = new HashMap<>();


    public Group(Student starosta) {
        this.starosta = starosta;
    }

    public void setStarosta(Student starosta) {
        this.starosta = starosta;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void removeStudent(Student oldStudent) {
        students.remove(oldStudent);
    }

    public void addTask(String task) {
        tasks.add(task);
        doneTasks.put(task, new ArrayList<>());
    }

    public void setDoneTaskForStudent(String task, Student student) {
        doneTasks.get(task).add(student);

    }
}
