package org.example.logic;

import org.example.database.MySQL;

import java.util.ArrayList;

public class User {
    private final int id;
    private final String name;
    private final String password;
    private final String email;
    private final ArrayList<Ticket> tickets;

    {
        tickets = new  ArrayList<>();
    }

    public User(String name, String password, String email) {
        this.id = -1;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String email, int id) {
        this.id = id;
        this.name = name;
        this.password = "";
        this.email = email;
        //loadTicketsFromDatabase();
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*public void purchaseTickets(int quantity){
        for (int i = 0; i < quantity; i++){
            Ticket.createTicket(this);
        }
        tickets.clear();
        loadTicketsFromDatabase();
    }

    private void loadTicketsFromDatabase(){
        this.tickets.addAll(MySQL.getTickets(this, true));
    }

    public int getTotalTickets(){
        return this.tickets.size();
    }

    public boolean cashTicket(){
        if (tickets.isEmpty()) return false;
        Ticket ticket = tickets.removeFirst();
        ticket.cash();
        return true;
    }*/
}