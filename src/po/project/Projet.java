package src.po.project;
import java.util.*;


public class Projet{

    private Service service;
    private Employe employe;
    private String name;

    public Projet(Service service, Employe employe, String name){

        this.service = service;
        this.employe = employe;
        this.name = name;
    }


    public Service getService(){

        return service;
    }

    public Employe getEmploye(){

        return employe;
    }

    public void setService(Service service){
        
        this.service = service;
    }

    public void setEmploye(Employe employe){

        this.employe = employe;
    }

    public void toString(){
        
        System.out.println(
            "Employe : "+employe.toString+
            "Service : "+service.toString+
            "Name : "+name
        );
    }
}