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

import android.os.Bundle;
import android.renderscript.Type;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.carzacc.classificaserieanativa.Squadra;

import static io.github.carzacc.classificaserieanativa.R.id.alternativa;
import static io.github.carzacc.classificaserieanativa.R.id.imageView2;
import static io.github.carzacc.classificaserieanativa.R.id.textView2;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    int inter = 1;
    int juve = 2;
    int napoli = 3;
    int milan = 4;
    int lazio = 5;
    int benevento = 0;
    int sampdoria = 6;
    int roma = 7;
    int hellas = 8;
    int torino = 9;
    int atalanta = 10;
    int spal = 11;
    int crotone = 12;
    int chievo = 13;
    int fiorentina = 14;
    int udinese = 15;
    int genoa = 16;
    int sassuolo = 17;
    int cagliari = 18;
    int bologna = 19;

    Squadra Inter = new Squadra();
    Squadra Juve = new Squadra();
    Squadra Napoli = new Squadra();
    Squadra Milan = new Squadra();
    Squadra Lazio = new Squadra();
    Squadra Benevento = new Squadra();
    Squadra Roma = new Squadra();
    Squadra Sampdoria = new Squadra();
    Squadra Hellas = new Squadra();
    Squadra Torino = new Squadra();
    Squadra Atalanta = new Squadra();
    Squadra Spal = new Squadra();
    Squadra Crotone = new Squadra();
    Squadra Chievo = new Squadra();
    Squadra Fiorentina = new Squadra();
    Squadra Udinese = new Squadra();
    Squadra Genoa = new Squadra();
    Squadra Sassuolo = new Squadra();
    Squadra Cagliari = new Squadra();
    Squadra Bologna = new Squadra();

    String classif = "Alt";

    void partita(String squadra1, String squadra2, int goal1, int goal2)
    {
        if (squadra1 == "Inter") {
            Inter.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Napoli") {
            Napoli.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "juventus" || squadra1 == "juve") {
            Juve.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Lazio") {
            Lazio.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Milan") {
            Milan.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Torino") {
            Torino.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Sampdoria") {
            Sampdoria.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Roma") {
            Roma.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Fiorentina") {
            Fiorentina.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Cagliari") {
            Cagliari.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Atalanta") {
            Atalanta.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "ChievoVerona" || squadra1 == "Chievo" || squadra1 == "Chievoverona") {
            Chievo.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Bologna") {
            Bologna.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Spal") {
            Spal.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Udinese") {
            Udinese.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Genoa") {
            Genoa.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Sassuolo") {
            Sassuolo.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Crotone") {
            Crotone.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Hellas Verona" || squadra1 == "Hellas" || squadra1 == "Verona") {
            Hellas.aggiungipartita(goal1, goal2);
        }
        if (squadra1 == "Benevento") {
            Benevento.aggiungipartita(goal1, goal2);
        }
        if (squadra2 == "Inter") {
            Inter.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Napoli") {
            Napoli.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "juventus" || squadra2 == "juve") {
            Juve.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Lazio") {
            Lazio.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Milan") {
            Milan.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Torino") {
            Torino.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Sampdoria") {
            Sampdoria.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Roma") {
            Roma.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Fiorentina") {
            Fiorentina.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Cagliari") {
            Cagliari.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Atalanta") {
            Atalanta.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "ChievoVerona" || squadra2 == "Chievo" || squadra2 == "Chievoverona") {
            Chievo.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Bologna") {
            Bologna.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Spal") {
            Spal.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Udinese") {
            Udinese.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Genoa") {
            Genoa.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Sassuolo") {
            Sassuolo.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Crotone") {
            Crotone.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Hellas Verona" || squadra2 == "Hellas" || squadra2 == "Verona") {
            Hellas.aggiungipartita(goal2, goal1);
        }
        if (squadra2 == "Benevento") {
            Benevento.aggiungipartita(goal2, goal1);
        }
    }

    void partite(int numeropartite) {
        Inter.azzeraPunti();
        Juve.azzeraPunti();
        Milan.azzeraPunti();
        Napoli.azzeraPunti();
        Sampdoria.azzeraPunti();
        Bologna.azzeraPunti();
        Benevento.azzeraPunti();
        Hellas.azzeraPunti();
        Chievo.azzeraPunti();
        Lazio.azzeraPunti();
        Roma.azzeraPunti();
        Sassuolo.azzeraPunti();
        Crotone.azzeraPunti();
        Genoa.azzeraPunti();
        Fiorentina.azzeraPunti();
        Udinese.azzeraPunti();
        Cagliari.azzeraPunti();
        Torino.azzeraPunti();
        Spal.azzeraPunti();
        Atalanta.azzeraPunti();
        Boolean soloquarta=false;
        Boolean finoquinta=false;
        Boolean finosesta=false;
        if(numeropartite<5)
            soloquarta=true;
        if(numeropartite<6)
            finoquinta=true;
        if(numeropartite<7)
            finosesta=true;
        partita("juventus","Cagliari",3,0);
        partita("Verona","Napoli",1,3);
        partita("Atalanta","Roma",0,1);
        partita("Bologna","Torino",1,1);
        partita("Crotone","Milan",0,3);
        partita("Inter","Fiorentina",3,0);
        partita("Lazio","Spal",0,0);
        partita("Sampdoria","Benevento",2,1);
        partita("Sassuolo","Genoa",0,0);
        partita("Udinese","Chievo",1,2);
        partita("Benevento","Bologna",0,1);
        partita("Genoa","juventus",2,4);
        partita("Roma","Inter",1,3);
        partita("Torino","Sassuolo",3,0);
        partita("Milan","Cagliari",2,1);
        partita("Napoli","Atalanta",3,1);
        partita("Crotone","Verona",0,0);
        partita("Spal","Udinese",3,2);
        partita("Chievo","Lazio",1,2);
        partita("Fiorentina", "Sampdoria",1,2);
        partita("juventus","Chievo",3,0);
        partita("Inter","Spal",2,0);
        partita("Verona","Fiorentina",0,5);
        partita("Udinese","Genoa",1,0);
        partita("Atalanta","Sassuolo",2,1);
        partita("Cagliari","Crotone",1,0);
        partita("Lazio","Milan",4,1);
        partita("Benevento","Torino",0,1);
        partita("Bologna","Napoli",0,3);
        partita("Crotone","Inter",0,2);
        partita("Fiorentina","Bologna",2,1);
        partita("Roma","Verona",3,0);
        partita("Sassuolo","juventus",1,3);
        partita("Milan","Udinese",2,1);
        partita("Napoli","Benevento",6,0);
        partita("Spal","Cagliari",0,2);
        partita("Torino","Sampdoria",2,2);
        partita("Chievo","Atalanta",1,1);
        partita("Genoa","Lazio",2,3);
        if(!soloquarta)
        {
            partita("Bologna","Inter",1,1);
            partita("Benevento","Roma",0,4);
            partita("Atalanta","Crotone",5,1);
            partita("Cagliari","Sassuolo",0,1);
            partita("Genoa","Chievo",1,1);
            partita("juventus", "Fiorentina",1,0);
            partita("Lazio","Napoli",1,4);
            partita("Milan","Spal",2,0);
            partita("Udinese","Torino",2,3);
            partita("Verona", "Sampdoria",0,0);
            if(!finoquinta)
            {
                partita("Roma","Udinese",3,1);
                partita("Spal","Napoli",2,3);
                partita("juventus","Torino",4,0);
                partita("Sampdoria","Milan",2,0);
                partita("Cagliari","Chievo",0,2);
                partita("Crotone", "Benevento",2,0);
                partita("Verona","Lazio",0,3);
                partita("Inter","Genoa",1,0);
                partita("Sassuolo", "Bologna",0,1);
                partita("Fiorentina","Atalanta",1,1);
                if(!finosesta)
                {
                    partita("Udinese","Sampdoria",4,0);
                    partita("Genoa","Bologna",0,1);
                    partita("Napoli","Cagliari",3,0);
                    partita("Benevento","Inter",1,2);
                    partita("Lazio","Sassuolo",6,1);
                    partita("Torino","Verona",2,2);
                    partita("Chievo","Fiorentina",2,1);
                    partita("Spal","Crotone",1,1);
                    partita("Milan","Roma",0,2);
                    partita("Atalanta","juventus",2,2);
                }
            }
        }
    }
    void tastopremuto() {
        partite(7);
        ListView listview = (ListView) findViewById(R.id.listview);
        String[] nomisquadre = new String[20];
        nomisquadre[inter] = "Inter";
        nomisquadre[juve] = "Juve";
        nomisquadre[milan] = "Milan";
        nomisquadre[sampdoria] = "Sampdoria";
        nomisquadre[torino] = "Torino";
        nomisquadre[roma] = "Roma";
        nomisquadre[benevento] = "Benevento";
        nomisquadre[hellas] = "Hellas";
        nomisquadre[atalanta] = "Atalanta";
        nomisquadre[spal] = "Spal";
        nomisquadre[crotone] = "Crotone";
        nomisquadre[chievo] = "Chievo";
        nomisquadre[fiorentina] = "Fiorentina";
        nomisquadre[napoli] = "Napoli";
        nomisquadre[bologna] = "Bologna";
        nomisquadre[cagliari] = "Cagliari";
        nomisquadre[genoa] = "Genoa";
        nomisquadre[sassuolo] = "Sassuolo";
        nomisquadre[lazio] = "Lazio";
        nomisquadre[udinese] = "Udinese";
        double[] arr = new double[20];
        if (classif == "Alt") {
            arr[inter] = Inter.getPunti();
            arr[juve] = Juve.getPunti();
            arr[milan] = Milan.getPunti();
            arr[sampdoria] = Sampdoria.getPunti();
            arr[torino] = Torino.getPunti();
            arr[roma] = Roma.getPunti();
            arr[benevento] = Benevento.getPunti();
            arr[hellas] = Hellas.getPunti();
            arr[atalanta] = Atalanta.getPunti();
            arr[spal] = Spal.getPunti();
            arr[crotone] = Crotone.getPunti();
            arr[chievo] = Chievo.getPunti();
            arr[fiorentina] = Fiorentina.getPunti();
            arr[napoli] = Napoli.getPunti();
            arr[bologna] = Bologna.getPunti();
            arr[cagliari] = Cagliari.getPunti();
            arr[genoa] = Genoa.getPunti();
            arr[sassuolo] = Sassuolo.getPunti();
            arr[lazio] = Lazio.getPunti();
            arr[udinese] = Udinese.getPunti();
        }
        if (classif == "Trad") {
            arr[inter] = Inter.getPuntiTrad();
            arr[juve] = Juve.getPuntiTrad();
            arr[milan] = Milan.getPuntiTrad();
            arr[sampdoria] = Sampdoria.getPuntiTrad();
            arr[torino] = Torino.getPuntiTrad();
            arr[roma] = Roma.getPuntiTrad();
            arr[benevento] = Benevento.getPuntiTrad();
            arr[hellas] = Hellas.getPuntiTrad();
            arr[atalanta] = Atalanta.getPuntiTrad();
            arr[spal] = Spal.getPuntiTrad();
            arr[crotone] = Crotone.getPuntiTrad();
            arr[chievo] = Chievo.getPuntiTrad();
            arr[fiorentina] = Fiorentina.getPuntiTrad();
            arr[napoli] = Napoli.getPuntiTrad();
            arr[bologna] = Bologna.getPuntiTrad();
            arr[cagliari] = Cagliari.getPuntiTrad();
            arr[genoa] = Genoa.getPuntiTrad();
            arr[sassuolo] = Sassuolo.getPuntiTrad();
            arr[lazio] = Lazio.getPuntiTrad();
            arr[udinese] = Udinese.getPuntiTrad();
        }
        if (classif == "Somma") {
            arr[inter] = Inter.getPunti() + Inter.getPuntiTrad();
            arr[juve] = Juve.getPunti() + Juve.getPuntiTrad();
            arr[milan] = Milan.getPunti() + Milan.getPuntiTrad();
            arr[sampdoria] = Sampdoria.getPunti() + Sampdoria.getPuntiTrad();
            arr[torino] = Torino.getPunti() + Torino.getPuntiTrad();
            arr[roma] = Roma.getPunti() + Roma.getPuntiTrad();
            arr[benevento] = Benevento.getPunti() + Benevento.getPuntiTrad();
            arr[hellas] = Hellas.getPunti() + Hellas.getPuntiTrad();
            arr[atalanta] = Atalanta.getPunti() + Atalanta.getPuntiTrad();
            arr[spal] = Spal.getPunti() + Spal.getPuntiTrad();
            arr[crotone] = Crotone.getPunti() + Crotone.getPuntiTrad();
            arr[chievo] = Chievo.getPunti() + Chievo.getPuntiTrad();
            arr[fiorentina] = Fiorentina.getPunti() + Fiorentina.getPuntiTrad();
            arr[napoli] = Napoli.getPunti() + Napoli.getPuntiTrad();
            arr[bologna] = Bologna.getPunti() + Bologna.getPuntiTrad();
            arr[cagliari] = Cagliari.getPunti() + Cagliari.getPuntiTrad();
            arr[genoa] = Genoa.getPunti() + Genoa.getPuntiTrad();
            arr[sassuolo] = Sassuolo.getPunti() + Sassuolo.getPuntiTrad();
            arr[lazio] = Lazio.getPunti() + Lazio.getPuntiTrad();
            arr[udinese] = Udinese.getPunti() + Udinese.getPuntiTrad();
        }
        double[] sortedarr = new double[20];
        System.arraycopy( arr, 0, sortedarr, 0, arr.length );
        Arrays.sort(sortedarr);
        for(int i = 0; i < sortedarr.length / 2; i++)
        {
            double temporanea = sortedarr[i];
            sortedarr[i] = sortedarr[sortedarr.length - i - 1];
            sortedarr[sortedarr.length - i - 1] = temporanea;
        }
        String[] listasquadre = new String[20];
        String squadrabuona = new String();
///*
        for(int postoclassifica=0;postoclassifica<sortedarr.length;postoclassifica++)   {
            for(int numerosquadra=0;numerosquadra<arr.length;numerosquadra++)   {
                if(arr[numerosquadra]==sortedarr[postoclassifica])  {
                    if(arr[numerosquadra]!=900) {
                        listasquadre[postoclassifica] = nomisquadre[numerosquadra] + ": " + sortedarr[postoclassifica];
                        arr[numerosquadra] = 900;
                    } else {
                        while(true) {
                            numerosquadra++;
                            if(numerosquadra==20)   {
                                numerosquadra=0;
                                continue;
                            }
                            if(sortedarr[postoclassifica]==arr[numerosquadra]) {
                                listasquadre[postoclassifica] = nomisquadre[numerosquadra] + ": " + sortedarr[postoclassifica];
                                break;
                            }

                        }
                    }
                }
            }
        }
//*////*
        // Stampiamo gli array in console per debug
        // sortedarr:
        System.out.println("Sortedarr:");
        for(int contatore=0;contatore<sortedarr.length;contatore++)    {
            System.out.println(sortedarr[contatore]);
        }
        System.out.println("Fine sortedarr");
        //nomisquadre:arr
        System.out.println("nomisquadre:arr");
        for(int i=0;i<nomisquadre.length;i++)   {
            System.out.println(nomisquadre[i]+":"+arr[i]);
        }


        // Crea un ArrayList sulla base di listasquadre ed un ArrayAdapter che permette di usare
        // questo ArrayList come lista
        List<String> arraylistsquadre = new ArrayList<String>(Arrays.asList(listasquadre));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arraylistsquadre
                );
        listview.setAdapter(arrayAdapter);

    }
//*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
      //  findViewById("")

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        // Quando viene cliccato un tasto nel menu fai sparire testo ed immagine esplicativi
        ImageView immagine = (ImageView) findViewById(imageView2);
        immagine.setVisibility(View.GONE);
        TextView testo = (TextView)findViewById(textView2);
        testo.setVisibility(View.GONE);

        if (id == R.id.alternativa) {
            classif="Alt";
            tastopremuto();

            // Handle the camera action
        } else if (id == R.id.tradizionale) {
            classif="Trad";
            tastopremuto();

        } else if (id == R.id.somma) {
            classif="Somma";
            tastopremuto();


        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
