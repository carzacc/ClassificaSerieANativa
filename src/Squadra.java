/*
* Copyright 2017 carzacc
*  
* Licensed under the EUPL, Version 1.1 or – as soon they
will be approved by the European Commission - subsequent
versions of the EUPL (the "Licence");
* You may not use this work except in compliance with the
Licence.
* You may obtain a copy of the Licence at:
*  
*
https://joinup.ec.europa.eu/software/page/eupl
*  
* Unless required by applicable law or agreed to in
writing, software distributed under the Licence is
distributed on an "AS IS" basis,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
express or implied.
* See the Licence for the specific language governing
permissions and limitations under the Licence.
*/ 



package io.github.carzacc.classificaserieanativa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;


public class Squadra {

    private int CS;
    private int GS;
    private int GF;
    private double quotaGS;
    private double quotaCS;
    private double quotaGF;
    private int puntiTrad;
    private double punti;
    public Squadra() {
        CS=0;
        GS=0;
        GF=0;
        quotaCS=2.5;
        quotaGS=1.5;
        quotaGF=1.3;
        punti=0;
        puntiTrad=0;
    }

    public void aggiungipartita(int GFa, int GSa)
    {
        if(GFa>GSa) {
            puntiTrad=puntiTrad+3;
        }
        if(GFa==GSa) {
            puntiTrad=puntiTrad+1;
        }

        if(GSa==0) {
            punti=punti+quotaCS;
        }
        else if (GSa == 1) punti = punti + 1.5;
        if(GFa>0)   {
            punti=punti+1.3;
        }
        GF=GF+GFa;
        GS=GS+GSa;
    }

    public int getPuntiTrad()   {
        return puntiTrad;
    }
    public double getPunti() {
        BigDecimal puntibigdecimal = new BigDecimal(punti);
        puntibigdecimal = puntibigdecimal.setScale(1,BigDecimal.ROUND_HALF_DOWN);
        double toreturn = puntibigdecimal.doubleValue();
        return toreturn;
    }
    public void azzeraPunti()   {
        punti=0;
        puntiTrad=0;
    }

}

