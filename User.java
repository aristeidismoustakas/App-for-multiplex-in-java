package project;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *Η κλάση αυτή περιέχει τα στοιχεία ειδόσου του χρήστη, το όνομα σου χρήστη(username) και έναν κωδικό(password) ώστε να μπορεί μ αυτά τα δύο πεδία να κάνει 
 * μετατρόπες στις κρατήσεις του ή στα στοχεία επικοινωνίας του (Ουσιστικά κάθε αντικείμενο αυτής της κλάσεις θα είναι το κλειδί σε έναν χάρτη ωστε να επιστρέφονται
 * τα υπόλοιπα στοιχεία του χρήστη δηλ. τηλέφωνο και κρατήσεις).
 * @author Moustakas/Mpenos
 */
public class User implements Serializable
    {
    private String username;
    private String password;

    
/**
 *  Πρόκείται για τον constructor της κλάσης και αυτό που κανει είναι να αναθέτει το όνομα χρήστη(username) και τον κωδικό(password) που επιθυμεί ο χρήστης
 * στα αντίστοιχα πεδία όνομα χρήστη(username) και κωδικό(password) στο αντικείμενο που δημιουργείται. 
 * @param username το όνομα που επιθυμεί ο χρήστης να πάρει το αντικείμενο που δημιουργείται.
 * @param password ο κωδικός που επιθυμεί ο χρήστης να πάρει το αντικείμενο που δημιουργείται. 
 */
    public User(String username,String password)
    {
        this.username=username;
        this.password=password;
    }
    
    /**
     * αναθέτει το όνομα χρήστη(username) που επιθυμεί ο χρήστης στο πεδίο όνομα χρήστη(username του αντικειμένου που την καλεί.
     * @param username το όνομα που δίνει ο χρήστης.
     */
    public void setUsername(String username)
    {
        this.username=username;
    }

    /**
     * αναθέτει τον κωδικό(password) που επιθυμεί ο χρήστης στο πεδίο κωδικό(password) του αντικειμένου που την καλεί.
     * @param password ο κωδικός που δίνει ο χρήστης.
     */
    public void setPassword(String password) 
    {
        this.password=password;
    }
    
     /**
     * @return το όνομα χρήστη(username).
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return τον κωδικό(password).
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Υποσκέλιση της μεθόδου equals
     * @param obj
     * @return αν το αντικείμενο που κάλεσαι την συνάρτηση είναι ίδιο μ αυτό που δόθηκε ως παράμετρος(οbj).
     */
    @Override
    public boolean equals(Object obj)
    {
         if(this==obj)
            return true;
        if(!(obj instanceof User))
            return false;
        User u=(User)obj;
        if(password.equals(u.password)&&(username.equals(u.username)))
        {
            return true;
        }else
            return false;
    } 

    /**
     * Υποσκέλιση της μεθόδου hashCode
     * @return 
     */
   @Override
    public int hashCode(){
       int hash;
       hash=password.hashCode();
       hash+=password.hashCode()+45;
       return hash;
    }
    
 
    
}
