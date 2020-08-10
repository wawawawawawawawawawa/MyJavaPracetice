package catdogqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CatDogQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public CatDogQueue(){
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
        this.count=0;
    }

    public void add(Pet pet){
        if(pet.getType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet,this.count++));
        }else if(pet.getType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet,this.count++));
        }else{
            throw new RuntimeException("err,not dog or cat");
        }
    }

    public Pet pollAll(){
        if(!this.dogQ.isEmpty() && !this.catQ.isEmpty()){
            if(this.dogQ.peek().getCount() < this.catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            }else {
                return  this.catQ.poll().getPet();
            }
        }else if(!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }else if(!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("the queue is empty");
        }
    }

    public boolean theDogQueueIsEmpty(){
        return this.dogQ.isEmpty();
    }

    public  boolean theCatQueueIsEmpty(){
        return this.catQ.isEmpty();
    }

    public boolean isEmpty(){
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public Dog pollDog(){
        if(!theDogQueueIsEmpty()){
            return (Dog) this.dogQ.poll().getPet();
        }else {
            throw new RuntimeException("the queue is Empty");
        }
    }
    public Cat pollCat(){
        if(!theCatQueueIsEmpty()){
            return (Cat) this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("the queue is Empty");
        }
    }
}
