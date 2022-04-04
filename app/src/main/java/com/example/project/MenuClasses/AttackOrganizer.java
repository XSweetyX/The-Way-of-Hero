package com.example.project.MenuClasses;

public class AttackOrganizer {
    public boolean playerIsAttacking = true;
    public boolean getPlayerAttackInfo(AttackOrganizer organizer){
        return organizer.playerIsAttacking;
    }

    public void setPlayerIsAttacking(boolean _b){
        playerIsAttacking = _b;
    }

}
