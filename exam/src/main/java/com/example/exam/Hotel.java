package com.example.exam;

import java.util.ArrayList;
public class Hotel {
    private int nrOfRooms;
    private  ArrayList<Chambre> Chambre;
    public Hotel(final int nrOfRooms, ArrayList<Chambre> chambres) {
        this.nrOfRooms = nrOfRooms;
    }

    public int getNrOfRooms() {
        return nrOfRooms;
    }

    public void setNrOfRooms(final int nrOfRooms) {
        this.nrOfRooms = nrOfRooms;
    }

    public void createRoom() {
        final Chambre room = new Chambre();
        Chambre.add(room);
    }
}