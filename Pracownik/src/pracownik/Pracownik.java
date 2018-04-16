/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracownik;

import java.util.Random;

public abstract class Pracownik {
    String etat;
    public static int liczbaPracownikow=0;
    String nazwisko;
    int pensja;
    
    Pracownik(String e, String n, int p)
    {
    this.etat=e;
    this.pensja=p;
    this.nazwisko=n;
    liczbaPracownikow++;
    }

    public abstract void oblicz_wynagrodzenie();
    
    
    public static void zwolnij(Pracownik[] pracownik)
    {
    liczbaPracownikow--;
    Random random=new Random();
    random.nextInt(Pracownik.liczbaPracownikow);
    System.out.println("Pracownik "+pracownik[random.nextInt(Pracownik.liczbaPracownikow)].nazwisko+" przejmuje jego obowiazki");
    }
}
