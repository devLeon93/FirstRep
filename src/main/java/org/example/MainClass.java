package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Developer dev = new Developer("Leonid","Barsucovschi",14000L);
       // dev.getInformation();

        List<Developer> developerList = new ArrayList<>();
        developerList.add(new Developer("Leonid","Barsucovschi",14000L));
        developerList.add(new Developer("Iurii","Busilo",12000L));
        developerList.add(new Developer("Serghei","Cotiujinschii",24000L));
        List<Developer> newList = getDevelopersLastname(developerList);
        System.out.println(" Result from getDevelopersLastname() -  " + newList);
    }

    public static List<Developer> getDevelopersLastname(List<Developer> devList){
        for (Developer list : devList){
            System.out.println(list.getLastname());
        }
        return devList;
    }

    public static List<Developer> getDevelopersFirstName(List<Developer> devList){
        for (Developer list : devList){
            System.out.println(list.getFirstname());
        }
        return devList;
    }
}