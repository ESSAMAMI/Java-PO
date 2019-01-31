package src.po.project;
import java.util.*;


public class Service{
    
    private String name ;
    

    public Service(String name){
        this.name = name;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void toString(){
        
        System.out.println(
            "Name : "+name
        );
    }
}
