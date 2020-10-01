/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.ArrayList;

public class GradeLog {
    private final ArrayList<Integer> grades;
    
    public GradeLog(){
        this.grades = new ArrayList();
    }
    
    public void addGrade(int grade) {
        if (grade >= 0 && grade < 100) {
            this.grades.add(grade);
        }
    }
    
    public double average() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (1.0 * sum/this.grades.size());
    }
    
    public double averagePassing() {
        return (1.0*(this.passingStats().get(0))/this.passingStats().get(1));
    }
    
    public double percentPassing() {
        int countPassing = this.passingStats().get(1);
        return (100.0 * countPassing/this.grades.size());
    }
    
    private ArrayList<Integer> passingStats() {
        int sum = 0; 
        int count = 0;
        for (Integer grade : grades) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }
        ArrayList<Integer> avgStats = new ArrayList<>();
        avgStats.add(sum);
        avgStats.add(count);
        return avgStats;
    }
    
    public ArrayList<String> gradeDist() {
        int[] points = {0, 0, 0, 0, 0, 0};
        ArrayList<String> dist = new ArrayList<>();
        for (Integer grade : grades) {
            points[this.assignGrade(grade)]++;
        }
        
        for (int i = 0; i < points.length; i++) {
            dist.add(printStars(points, i));
        }
        return dist;
    }
    
    public void printGradeDist(ArrayList<String> distr) {
        for (int i = distr.size() - 1; i >= 0; i--) {
            System.out.println(i + ": " + distr.get(i));
        }
    }
    
    public int assignGrade(Integer points) {
        if (points >= 90) {
            return 5;
        } else if (points >= 80) {
            return 4;
        } else if (points >= 70) {
            return 3;
        } else if (points >= 60) {
            return 2;
        } else if (points >= 50) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public String printStars(int[] points, int grade) {
        String stars = "";
        int count = 1;
        while (count <= points[grade]) {
            stars += "*";
            count++;
        }
        return stars;
    }

}
