package com.example.TuneMixer.Project.entity.Enum;

public enum Genere {
    ACIDJAZZ("Un esperimento pop con influenze jazz (Incognito/ Dirotta su Cuba)."),
    BLUES("Una musica popolare figlia degli spiritual e spesso malinconica (il colore blue infatti in America è simbolo della malinconia) nata sotto la matrice dei canti di lavoro degli schiavi neri americani, corrente da cui poi è derivato anche il Blues-rock (B.B. King)"),
    BLACKMETAL("E' l'evoluzione classico / melodica (spesso con inserti di tastiere) ma contemporaneamente più brutale del Death Metal"),
    CHEMICALBEAT("Musica inventata negli ultimi due anni in cui l'elemento base diventa il campionatore con cui i gruppi attingono ai più diversi e strani generi musicali unendoli tra di loro in una sorta di ordinata confusione (vedi Prodigy, Chimical Brothers & Daft Punk)"),
    COUNTRY("Rappresenta culturalmente il liscio USA, è un genere più movimentato rispetto a quello italiano ed è suonato con chitarre, banjo e violini. Deriva dalle musiche folk importate dai coloni inglesi in America"),
    CROSSOVER("Attualmente è una corrente in cui vengono mischiati elementi rap e metal (e a volte anche altri generi)"),
    DARK("Musica rock / pop in cui i testi e le musiche sono incentrati sulla malinconia o sulla tristezza (Cure ecc.)"),
    DEATHMETAL("E' un metal spinto in versione horror, il kaos e la violenza organizzati, l'unione di suoni melodici con suoni molto grezzi"),
    EPICMETAL("Tendenza del metal classico caratterizzata da testi epicheggianti e rimandi storici di battaglie ed eroi (Manowar)"),
    FOLK("Il genere folkloristico è basato sulle musiche storiche / temi tradizionali di un determinato paese."),
    FUNKY("Il funky è una musica simile all'hip-hop molto allegra e ritmata proveniente dagli USA, nata negli anni '70 nei ghetti americani"),
    GLAMROCK("Hard rock con cantanti o gruppi vestiti e truccati per far scena e spettacolo (Kiss e Twised Sister)"),
    GOSPEL("La musica corale nera nata nelle parrocchie della zona del Mississippie poi diffusasi nel resto degli Usa."),
    GRUNGE("Nato nella famiglia del metal, più che un genere è un'attitudine che si rispecchia nel modo di rapppresentarsi / vestire del gruppo e dai testi intimisti delle canzoni (Nirvana / Soundgarden)."),
    HARDCORE("Il punk mischiato a elementi metal"),
    HARDCOREDISCO("Una musica veloce basata su un campionato ad alta velocità"),
    HARDHOUSE("Mix tra la cultura underground e progressive proiettata verso il futuro."),
    HARDROCK("Il rock duro, un passo sotto il metal classico (Aerosmith, ecc.)"),
    HIPHOP("Una musica freestyle su basi lente che spaziano tra molti generi, è poi uno stile di vita basato sulla non-violenza ed è nato anch'esso dall'evoluzione della musica nera. (Rappresentanti dell'Hip-hop italiano: Neffa, Frankie-Hi-Nrg & altri)"),
    INDUSTRIAL("Corrente metal in cui si fa largo uso dei campionatori elettronici per creare ritmi violenti ed ossessivi (Ministry ecc.)"),
    INDUSTRIALDISCO("Non cambia eccessivamente rispetto alla corrente metal, se non per il fatto che non si fa uso di chitarre elettriche (Lenny D)"),
    JAZZ("Il jazz è una musica molto complessa di difficile interpretazione nata nei primi del secolo, basata sulla bravura e sulla capacità d'improvvisazione dei suoi compositori e musicisti. Il jazz pone le sue radici nel blues. (Louis Armstrong)."),
    JUNGLE("E' il tentativo di trasportare il kaos urbano in musica, stretta erede dell'hip-hop, tecnicamente basata su un mix tra ritmiche veloci e melodie lente."),
    LISCIO("Presente Raul Casadei?"),
    METAL("Nato negli anni '70 è una musica rock dura, cattiva e appunto dai toni metallici che usa chitarre con suoni distorti. Dal metal sono nati poi una miriade di sottogeneri."),
    METALPROGRESSIVE("Una miscela sperimentale difficile da suonare e cantare che usa accordi molto complessi e innovativi. E' nata in Inghilterra alla fine degli anni '70 e ha come gruppo rappresentativo attuale la metal band americana Dream Theater"),
    CLASSICA("E' nata dalla lunga evoluzione della semplice musica strumentale medioevale europea ed è anche una delle musiche più espressive per la gamma di emozioni che riesce a trasmettere (Bach e Mozart ecc.)"),
    DANCE("E' la frangia più melodica della musica da discoteca, quella che più si avvicina al pop, solitamente di scarso valore per contenuti ma molto piacevole da ascoltare (Alexia & DJ. Dado)."),
    NEWWAVE("Rappresenta il dark elettronico"),
    NOISE("Un'ennesima evoluzione della psichedelia, utilizza anche suoni estranei alla musica ( fischi, ronzii ecc.)."),
    POP("La parola deriva da popular, appunto musica del popolo"),
    ITALIANPOP("La musica commerciale più ascoltata dal popolo italiano per tradizione (come rappresentanti ha De Gregori, Baglioni e migliaia di altri autori"),
    PROGRESSIVEDISCO("Genere nato negli ultimi anni con l'evoluzione del rapporto musica - computer, melodie facili con assoluta mancanza di testi"),
    PSICHEDELIA("Corrente delle particolari sperimentazioni rock anni '60 basate sui temi dell'inconscio, una musica stordente fatta per esaltare le sensazioni della psiche (Doors e altri)"),
    PUNKROCK("Il punk è una musica vivace, provocatoria e con pochi accordi (Sex Pistols docet)."),
    REVIVALDISCO("I vecchi successi da discoteca anni '70 / '80"),
    ROCKNROLL("Il capostipite di tutti i generi dal rock al metal e di moltissimi altri. Nato come musica giovanile da ballare nella prima metà degli anni '50 negli USA, è composto da una commistione di generi country, blues e pop americano. E' stato il punto d'incontro tra musica bianca e nera che prima della sua nascita erano state completamente separate. (Elvis Presley fu uno dei più grandi artisti di tale genere)."),
    SKA("Una musica molto allegra basata in parte sul reggae, su ritmi latino-americani e sul punk (Divine Madness)."),
    THRASH("Verso l'inizio degli anni '80 si cominciò a spingere il metal verso maggiori velocità e picchi di violenza sonora più forti, arrivando alla cosiddetta musica \"spazzatura\" usa e getta (trash in inglese, a cui venne aggiunta in seguito una \"H\" per togliere il significato dispregiativo del genere); il thrash è nato con gruppi quali Megadeath, i Metallica e gli Exodus."),
    UNDERGRONDDISCO("Rappresenta il \"jazz elettronico\" degli anni '90, creata con largo uso del computer e del campionatori, raggruppa sotto di sé una serie di sottogeneri (garage, house ecc.)");

    private String descrizione;

    public String getDescrizione() {
        return descrizione;
    }

    Genere(String descrizione) {
        this.descrizione = descrizione;
    }
}
