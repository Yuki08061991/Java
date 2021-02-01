package Pairprogram2;

import java.util.ArrayList;
import java.util.Collections;

public class GradeList implements Statistical {

    private ArrayList<Double> grades;

    public GradeList() {
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public boolean removeAllGrades(double grade) {
        boolean removed = false;
        for (int i = 0; i <= grades.size() - 1; i++) {
            if (grades.get(i).equals(grade)) {
                grades.remove(i);
                removed = true;
            }
        }
        return removed;
    }

    public void printSortedGrades() {
        Collections.sort(grades);
        System.out.println(grades);

    }

    public String toString() {
        return grades.toString();
    }

    public double dropLowest() {
        double min = Double.MAX_VALUE;

        for (Double d: grades) {
            if (d < min) {
                min = d;
            }
        }
        grades.remove(min);
        return min;
    }

    public double calcAverage() {
        double avg = Double.MIN_VALUE;
        double total = 0;

        for (int i = 0; i <= grades.size() - 1; i++) {
            total += grades.get(i);
        }

        if (grades.size() > 0) {
            avg = total / grades.size();
        }
        return avg;
    }

    public static void main(String[] args) {

        GradeList list = new GradeList();

        // add grades into grades list
        list.addGrade(89);
        list.addGrade(70);
        list.addGrade(93);
        list.addGrade(85);
        list.addGrade(80);
        list.addGrade(69);
        list.addGrade(88);

        if (list.grades.size() > 0) {

            System.out.println("Average: " + list.calcAverage());
            System.out.println("Lowest: " + list.dropLowest());
            System.out.println("Removed [70.0]: " + list.removeAllGrades(70.0));
            System.out.println("Unsorted List: " + list);
            System.out.print("Sorted List: ");
            list.printSortedGrades();
        } else {
            System.out.println("The result can't be showed you because no data has been entered.");
        }
    }
}
