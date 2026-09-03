package com.voting;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Voter> voters = new ArrayList<>();

        // AUTOMATIC INPUTS (The code reads these values by itself)
        voters.add(new Voter("Aravind Sharma", 25, "Indian", true));    // Case 1: Eligible
        voters.add(new Voter("Sarah Connor", 16, "American", false));  // Case 2: Underage & Foreign Citizen
        voters.add(new Voter("Rahul Verma", 34, "Indian", false));     // Case 3: Invalid Voter ID Card

        // Print evaluation report dynamically
        System.out.println("===== AUTOMATED VOTING ELIGIBILITY REPORT =====");
        for (Voter v : voters) {
            System.out.println("Voter Name: " + v.getName());
            System.out.println("Result:     " + v.checkEligibility());
            System.out.println("----------------------------------------------");
        }
    }
}
