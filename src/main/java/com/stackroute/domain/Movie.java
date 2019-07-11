package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display() {
        System.out.println("The name is " + actor.getName() + " The gender is " + actor.getGender() + " The age is " + actor.getAge());

    }
}
