import java.util.Stack;

public class Solution {
    public String predictPartyVictory(String senate) {
        int Rcount=0;
        int Dcount=0;
        int Rremoved=0;
        int Dremoved=0;
        char [] mychar=senate.toCharArray();
        for (char a: mychar)
        {
            if (a=='R')
                Rcount++;
            else
                Dcount++;
        }
        for (int i=0;i<=senate.length();i++)
        {
            i%=senate.length();
            if (Rcount==0)
                return "Dire";
            if (Dcount==0)
                return "Radiant";
            if (mychar[i]=='x')
                continue;
            if (mychar[i]=='R')
            {
                if (Rremoved==0)
                {
                    Dremoved++;
                    Dcount--;
                }
                else
                {
                    Rremoved--;
                    mychar[i]='x';
                }
            }
            else
            {
                if (Dremoved==0)
                {
                    Rremoved++;
                    Rcount--;
                }
                else
                {
                    Dremoved--;
                    mychar[i]='x';
                }
            }
        }
        if (Rcount==0)
            return "Dire";
        else
            return "Radiant";
    }
}
