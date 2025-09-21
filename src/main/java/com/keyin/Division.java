package com.keyin;

import java.util.Calendar;

public class Division {
    private long id;
    private String name;
    private String startBirthYear;
    private String endBirthYear;

    public boolean isPlayerEligible(Player player) {
      String playerBirthYear = String.valueOf(player.getBirthday().get(Calendar.YEAR));

      return playerBirthYear.equals(startBirthYear) || playerBirthYear.equals(endBirthYear);
    };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartBirthYear() {
        return startBirthYear;
    }

    public void setStartBirthYear(String startBirthYear) {
        this.startBirthYear = startBirthYear;
    }

    public String getEndBirthYear() {
        return endBirthYear;
    }

    public void setEndBirthYear(String endBirthYear) {
        this.endBirthYear = endBirthYear;
    }
}
