package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private boolean isIdValid;

    // Save voter details
    public Voter(String name, int age, String citizenship, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.isIdValid = isIdValid;
    }

    // Check voting criteria rules automatically
    public String checkEligibility() {
        if (age < 18) {
            return "INELIGIBLE - Reason: Underage (Must be 18+).";
        }
        if (!"Indian".equalsIgnoreCase(citizenship)) {
            return "INELIGIBLE - Reason: Must be an Indian citizen.";
        }
        if (!isIdValid) {
            return "INELIGIBLE - Reason: Voter ID card is invalid.";
        }
        return "ELIGIBLE TO VOTE";
    }

    public String getName() { return name; }
}

