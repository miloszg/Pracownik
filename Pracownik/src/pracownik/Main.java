/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracownik;

import java.util.*;
import static pracownik.Pracownik.zwolnij;


public class Main {

   
    public static void main(String[] args) {
     
    Pracownik[] pracownik=new Pracownik[10];
    pracownik[1]=new Tester("pelny","Kowalski",4500);
    pracownik[0]=new Tester("niepelny","Dukatti",3000);
    pracownik[2]=new Manager("pelny","Gnacy",7000,200);    
    
    System.out.println(Pracownik.liczbaPracownikow);
    dodaj_pracownika(pracownik);
    System.out.println(Pracownik.liczbaPracownikow);
    
    zwolnij(pracownik);
    System.out.println(Pracownik.liczbaPracownikow);
    
    System.out.println("premia swiateczna dla pracownika:"+Manager.oblicz_premie_swiateczna(pracownik, 1));
    }
     public static void dodaj_pracownika(Pracownik[] pracownik)
    {
       Scanner klawiatura=new Scanner(System.in);
        
       if(pracownik.length>Pracownik.liczbaPracownikow)
       {
        
        System.out.println("Podaj etat (Tester albo Manager): ");
        String etat=klawiatura.nextLine();
        
        System.out.println("Podaj nazwisko: ");
        String nazwisko=klawiatura.nextLine();
        System.out.println("Podaj pensje: ");
        int pensja=klawiatura.nextInt();
        if(etat.equals("Manager"))
        {      
           System.out.println("Podaj dodatek: ");
           int dodatek=klawiatura.nextInt();
           pracownik[Pracownik.liczbaPracownikow]=new Manager(etat,nazwisko,pensja,dodatek);
        }
        else
        {
            pracownik[Pracownik.liczbaPracownikow]=new Tester(etat,nazwisko,pensja);
        }
       }
       else 
           System.out.println("Za duzo pracownikow, bo jest ich: "+pracownik.length);
    }
    
}
