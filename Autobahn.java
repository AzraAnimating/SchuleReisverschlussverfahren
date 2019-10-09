
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
