package src.po.project;
import java.util.*;


public class Employe{

    private Sring name;
    private String surname;
    private ArrayList<Service> listService = new ArrayList<Service>();

    public Employe(String name, String surname, Service service){

        this.name = name;
        this.surname = surname;
        this.listService.add(service);

    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getSurname(){

        return surname;
    }

    public void setSurname(String surname){

        this.surname = surname;
    }

    public ArrayList<Service> getServices(){

        return listService;
    }
    
    public void setService(Service service){

        this.listService.add(service);
    }


    public void toString(){

        System.out.println(
            "Name : "+name+'\n'+
            "Surname : "+surname+'\n'+
            "Service : "+listService.get().toString(); 
        );
    }
}