package com.edu.simple_patterns.facade;

public class WorkFlow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solveProblems() {
        bugTracker.startSprint();
        job.doJob();
        developer.beforeDeadline(bugTracker);
    }

    public void finishSolveProblems() {
        bugTracker.finishSprint();
        developer.beforeDeadline(bugTracker);
    }
}
