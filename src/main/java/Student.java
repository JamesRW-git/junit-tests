import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> gradesList = new ArrayList<>();

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.gradesList.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.gradesList;
    }

    public double getGradeAverage() {
        int total = this.gradesList.stream().reduce(0, (sum, currentGradeElement) ->{
            return sum + currentGradeElement;
        });
        return (double) total/this.gradesList.size();
    }
}
