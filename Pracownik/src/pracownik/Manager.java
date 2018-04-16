/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracownik;
public class Manager extends Pracownik{
    int dodatek;

    public Manager(String e, String n, int p,int d) {
        super(e, n, p);
        this.dodatek=d;
    }
    
    public static int oblicz_premie_swiateczna(Pracownik[] pracownik,int n)
    {
       if( pracownik[n] instanceof Manager )
           return 200;
       else 
           return 100; 
    }

    @Override
    public void oblicz_wynagrodzenie() {
       
    }
}
