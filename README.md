# JetsProject

## Overview

* FighteJet CargoJet and JetImpl
    * Classes representing three types of jet that will be instantiated
    * Inherit from abstract Jet class
    * contains fields that describe jet, fly(method), and specialized interfaced methods
 * JetsApp
    * Instantiates instance of itself in main in order to call launchApp()
    * Sets up menu with switch statements to call methods from Airfield
 
 * Airfield
    * stores all instances of jets in the jets array list.  JetsApp calls methods from Airfield to fulfill various functions
   
 * CombatReady and CargoCarrier
    * Interfaces that add specialized methods 
    
  
## Technologies Used

* Java
* Object-Oriented Programming
   * Inheritance
   * Polymorphism
   * Arraylists
   * Abstract Classes
   * Interfaces

## Lessons Learned
 * Deepened understanding on interfaces and arrayLists
 * Use of Airfield to store all instances of jets made it an ideal location to hold the majority of the methods instead of trying to access the array from other classes methods