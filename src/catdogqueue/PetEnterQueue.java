package catdogqueue;


public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet,long count){
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet(){
        return this.pet;
    }

    public long getCount(){
        return this.count;
    }

    public String getPetType(){
        return this.pet.getType();
    }
}
