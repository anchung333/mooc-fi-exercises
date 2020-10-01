
import java.util.ArrayList;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exerciseList;
    
    public ExerciseManagement() {
        this.exerciseList = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : this.exerciseList) {
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise) {
        this.exerciseList.add(new Exercise(exercise));
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise exe: this.exerciseList) {
            if (exe.getName().equals(exercise)) {
                return exe.isCompleted();
            }
        }
        return false;
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise exe : this.exerciseList) {
            if (exe.getName().equals(exercise)) {
                exe.setCompleted(true);
            }
        }
    }
}
