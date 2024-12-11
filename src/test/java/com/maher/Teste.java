package com.maher;

import java.sql.Date;

import org.junit.Test;

public class Teste {

    @Test
    public void CreateNewProject()
    {
        Project project=new Project();
                project.add("libbele",new Date(12/15/2024),new Date(2/1/2025),2500,12);
        
    }
    @Test
    public void addProjectWithanExistingName(){
        Project project=new Project();
        project.add("thirdProject",new Date(12/15/2024),new Date(2/1/2025),2500,12);


    }
}
