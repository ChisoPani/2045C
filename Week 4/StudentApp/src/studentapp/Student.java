/*
Title:             studentapp
Desc:              This program calculates student's quiz scores and caluclates average.
Files:             StudentApp.java
Semester:          Fall 2021
Author name:       Meelan Pokhrel
Author email:      pokhremn@mail.uc.edu
 */
package studentapp;

public class Student {
    String name;
    int totalQuizScore;
    int quizCount;
            
    Student(String aName) {
        totalQuizScore=0; 
        quizCount=0; 
        name=aName;
    }
    
    public void getName(String getName){
       getName = name; 
    }
    
    public void addQuiz(int score){
        totalQuizScore = totalQuizScore + score;
        quizCount++;   
    }
    
    public void getTotalScore(int getTotalScore){
        getTotalScore = totalQuizScore;
    }
    
    public int getAverageScore(){
        int getAverageScore = totalQuizScore/quizCount;
        return getAverageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalQuizScore() {
        return totalQuizScore;
    }

    public void setTotalQuizScore(int totalQuizScore) {
        this.totalQuizScore = totalQuizScore;
    }

    public int getQuizCount() {
        return quizCount;
    }

    public void setQuizCount(int quizCount) {
        this.quizCount = quizCount;
    }
    
    }
    
   