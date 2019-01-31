import src.po.project.Employe;

public class Main {

    public static void main(String[] args) {

        /**
         * Création d'un objet Service 'RH'
         * Création d'un objet Employe
         * Affectation d'un employe au service RH
         */
        Service service = new Service('Direction RH');
        Employe employe = new Employe('TAVERNIER', 'Antoine', service);
        
        /**
         * Création d'un objet Projet
         * Afféctation d'un objet service + employe à un projet...
         */
        Projet projet = new Projet(service, employe, 'ACATE');
        
    }
}