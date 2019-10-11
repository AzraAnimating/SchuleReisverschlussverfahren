import java.util.*;
public class Autobahn
{
    Queue<Auto> autosRechts = new Queue<Auto>();
    Queue<Auto> autosLinks = new Queue<Auto>();
    Queue<Auto> autosMitte = new Queue<Auto>();
    Queue<Auto> wunschAutos = new Queue<Auto>();
    Queue<Auto> wunschAutosClone = new Queue<Auto>();
    GUI_project display = new GUI_project(this);
    int aAnzahlAutos;
    
    public void autoErstellenLinks(String pKennzeichen)
    {
        autosLinks.enqueue(new Auto(pKennzeichen));
        display.addAutoLinks(pKennzeichen);
    }
    public void autoErstellenRechts(String pKennzeichen)
    {
        autosRechts.enqueue(new Auto(pKennzeichen));
        display.addAutoRechts(pKennzeichen);
    }
  
    /*public void autosErstellen(int anzahlAutos)
    {
         for(int i = 0; i < anzahlAutos+1; i++)
         {
                autosRechts.enqueue(new Auto("HA-" + i));
                
                autosLinks.enqueue(new Auto("EN-" + i));
         }  
         aAnzahlAutos = anzahlAutos;
         this.wunsch();
    }*/
    /*
    public void autosErstellenLinks(int anzahlAutos)
    {
         for(int i = 0; i < anzahlAutos+1; i++)
            {
                autosLinks.enqueue(new Auto("EN-" + i));
            }  
    }
    */
    public void reisverschluss()
    {
        while(!autosRechts.isEmpty())
        {
            autosMitte.enqueue(autosRechts.front());
            autosRechts.dequeue();
            if(!autosLinks.isEmpty())
            {
                autosMitte.enqueue(autosLinks.front());
                autosLinks.dequeue();
            }
        }
        while(!autosLinks.isEmpty())
        {
            autosMitte.enqueue(autosLinks.front());
            autosLinks.dequeue();
        }
    }
    public void wunsch()
    {
        for(int i = 0; i < aAnzahlAutos + 1; i++)
        {
            boolean lIsRight = false;
            boolean lIsLeft = true;
            if(lIsLeft)
            {
                wunschAutos.enqueue(new Auto("HA-" + i));
                lIsRight = true;
                lIsLeft = false;
            }
            if(lIsRight)
            {
                wunschAutos.enqueue(new Auto("EN-" + i));
                lIsLeft = true;
                lIsRight = false;
            }
        }
    }
}
