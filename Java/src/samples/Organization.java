package samples;

import java.util.List;
class Organization{
    
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}

class Trainee{
    
    //One to one relationshio - BiDirectional Has-A
    //Trainee also has a trainer object
    private Trainer trainer;
    
    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }
    
    public Trainer getTrainer(){
        return this.trainer;
    }
    
}


class Trainer {
    //One to one relationshio with the Organization
    private Organization organization;
    
    //One to Many relationshio with TRainees
    private List<Trainee> trainees;
    
    public void setTrainees(List<Trainee> trainees){
        this.trainees = trainees;
    }
    
    public List<Trainee> getTrainees(){
        return this.trainees;
    }
    
    //When you are having one to many relationship in the class
    //Then add anohter method to add into collection
    public void addTrainee(Trainee trainee){
        this.trainees.add(trainee);
    }
    
    
    public void setOrganization(Organization organization){
        this.organization = organization;
    }
    
    public Organization getOrganization(){
        return this.organization;
    }  
}
