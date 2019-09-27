import java.util.*;
public class Auto
{
    String aKennzeichen;
    public Auto(String lNewKennzeichen)
    {
        aKennzeichen = lNewKennzeichen;
    }
    public void setKennzeichen(String lNewKennzeichen)
    {
        aKennzeichen = lNewKennzeichen;
    }
    public String getKennzeichen()
    {
        return aKennzeichen;
    }
    public boolean equals(Auto pAuto)
    {
        return this.aKennzeichen.equals(pAuto.getKennzeichen());
    }
}
