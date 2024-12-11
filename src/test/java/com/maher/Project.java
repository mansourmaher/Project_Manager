package com.maher;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Project {

    public String id;
    public String libelle;
    public Date dateDebut;
    public Date dateFin;
    public float coast;
    public int totlaTasks;
    public String type;
    public String spupervisior;
    private Set<String> existingProjectName = new HashSet<>();

    public Project() {
        // Ajouter des tables définies pour simuler un environnement réel
        existingProjectName.add("firstProject");
        existingProjectName.add("SecondProject");

    }

    public void add(String libeele, java.sql.Date date, java.sql.Date date2, int i, int j) {
        if (existingProjectName(libeele)) {
            System.out.println("you can create a project with this name please refactor it");
        } else
            System.out.println("the test of the project name has passed ");

    }

    private boolean existingProjectName(String libeele) {
        return existingProjectName.contains(libeele);
    }

}
