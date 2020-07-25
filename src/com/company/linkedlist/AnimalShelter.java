package com.company.linkedlist;

import java.util.LinkedList;

/*

Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
that type). They cannot select which specific animal they would like. Create the data structures to
maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
and dequeueCat. You may use the built-in Linkedlist data structure

 */

public class AnimalShelter {

    LinkedList<Dog> dogs= new LinkedList<>();
    LinkedList<Cat> cats= new LinkedList<>();
    int order=0;

    public void enQueue(Animal animal){
        animal.setOrder(order);
        order++;

        if(animal instanceof Dog){
            dogs.add((Dog)animal);
        }else{
            cats.add((Cat)animal);
        }
    }

    public Animal deQueue(String type){

        if(type==null || type.isEmpty()){
           return deQueueAny();
        }
        else if(type.equals("cat")){
            return deQueueCat();
        }
        else if(type.equals("dog")){
            return deQueueDog();
        }
        else{
            return deQueueAny();
        }
    }


    public Animal deQueueAny(){
        if(dogs.getFirst()==null && cats.getFirst() == null){
            return null;
        }
        else if(dogs.getFirst()==null && cats.getFirst() != null){
            return deQueueCat();
        }
        else if(cats.getFirst()==null && dogs.getFirst() != null){
            return deQueueDog();
        }
        else{
            Animal a=dogs.peek();
            Animal b=cats.peek();
            if(a.order >= b.order){
                return deQueueCat();
            }else{
                return deQueueDog();
            }
        }
    }

    public Animal deQueueCat(){
        return cats.poll();
    }

    public Animal deQueueDog(){
        return dogs.poll();
    }

    public static void main(String str[]) {
        Animal a1 = new Dog("Dog1");
        Animal a2 = new Cat("Cat1");
        Animal a3 = new Cat("Cat2");
        Animal a4 = new Dog("Dog2");
        Animal a5 = new Dog("Dog3");
        Animal a6 = new Dog("Dog4");
        Animal a7 = new Cat("Cat3");

        AnimalShelter animalShelter=new AnimalShelter();
        animalShelter.enQueue(a1);
        animalShelter.enQueue(a2);
        animalShelter.enQueue(a3);
        animalShelter.enQueue(a4);
        animalShelter.enQueue(a5);
        animalShelter.enQueue(a6);
        animalShelter.enQueue(a7);

        System.out.println(animalShelter.deQueueCat().getName());
        System.out.println(animalShelter.deQueueCat().getName());
        System.out.println(animalShelter.deQueueCat().getName());

        System.out.println(animalShelter.deQueueDog().getName());
        System.out.println(animalShelter.deQueueDog().getName());


    }
}

class Animal{

    String name;
    int order;

    Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }
}
class Cat extends Animal{

    Cat(String name){
        super(name);
    }
}