<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:ob="http://www.ftn.uns.ac.rs/xml/tim11/obavestenje"
    xmlns:co="http://www.ftn.uns.ac.rs/xml/tim11/common">
    
    <xsl:variable name="space" select="'&#xA0;'"/>
    
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    body {
                        background-color: grey;
                    }
                    .a4 {
                        background: white;
                        width: 21cm;
                        height: 29.7cm;
                        display: block;
                        margin: 0 auto;
                        margin-top: 1cm;
                        margin-bottom: 1cm;
                    }
                    .sadrzaj {
                        padding-top: 50px;
                        padding-bottom: 50px;
                        padding-left: 80px;
                        padding-right: 80px;
                    }
                    .trazilac {
                        margin-bottom: 20px;
                    }
                    .obavestenje {
                        text-align: center;
                    }
                    .obavestenje_opis {
                        text-align: center;
                        margin-bottom: 20px;
                    }
                    .tekst {
                        text-indent:1em;
                        margin-bottom: 10px;
                    }
                    .obican_tekst {
                        margin-bottom: 10px;
                    }
                    .informacija_opis {
                        text-align: center;
                        font-size: 10pt;
                        margin-bottom: 10px;
                    }
                </style>
            </head>
            <body>
                <div class="a4">
                    <div class="sadrzaj">
                        <div>
                            <u><xsl:value-of select="ob:Obavestenje/ob:Organ/co:Naziv"/></u>
                        </div>
                        <div>
                            <u><xsl:value-of select="ob:Obavestenje/ob:Organ/co:Sediste/co:Ulica"/>
                                <xsl:value-of select="ob:Obavestenje/ob:Organ/co:Sediste/co:Broj"/>
                                <xsl:value-of select="ob:Obavestenje/ob:Organ/co:Sediste/co:Mesto"/></u>
                        </div>
                        <div>(naziv i sediste organa)</div>
                        <br/>
                        <div>
                            Broj predmeta: <u><xsl:value-of select="ob:Obavestenje/ob:BrojPredmeta"/></u>
                        </div>
                        <div>
                            Datum: <u><xsl:value-of select="ob:Obavestenje/ob:Datum"/></u>
                        </div>
                        <br/>
                        <div>
                            <u>
                                <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Ime"/><xsl:value-of select="$space"/>
                                <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Prezime"/><xsl:value-of select="$space"/>
                                <u><xsl:value-of select="ob:Obavestenje/ob:PodnosiocZahteva/ob:Naziv"/></u>
                            </u>
                        </div>
                        <div>
                            <u><xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Adresa/co:Mesto"/><xsl:value-of select="$space"/>
                                <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Adresa/ob:Ulica"/>,
                                <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Adresa/ob:Broj"/></u>
                        </div>
                        <div class="trazilac">Ime i prezime/naziv/i adresa podnosioca zahteva</div>
                        <div class="obavestenje"><b>O B A V E S T E Nj E</b></div>
                        <div class="obavestenje"><b>o stavljanju na uvid dokument koji sadrzi</b></div>
                        <div class="obavestenje_opis"><b>trazenu informaciju i o izradi kopije</b></div>
                        <div class="tekst">
                            <xsl:variable name="date1" select="ob:Obavestenje/ob:TrazenaInformacija/co:DatumZahteva"/>

                            Na osnovu clana 16. st. 1. Zakona o slobodnom pristupu informacijama od javnog znacaja, postupajuci po
                            vasem zahtevu za slobodan pristup informacijama od <xsl:value-of select="$date1"/> god.,
                            kojim ste trazili uvid u dokument/e sa informacijama o/u vezi sa:
                        </div>
                        <div><u><xsl:value-of select="ob:Obavestenje/ob:TrazenaInformacija/co:TrazenaInformacija"/></u></div>
                        <div class="informacija_opis">(opis trazene informacije)</div>
                        <xsl:variable name="date" select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Datum"/>
                        <xsl:variable name="time" select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Satnica"/>
                        <div class="obican_tekst">
                            obavestavamo Vas da dana <u><xsl:value-of select="$date"/></u>, u <u><xsl:value-of select="$time"/></u>
                            , odnosno u vremenu od <u><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:SatnicaOd"/></u> do <u><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:SatnicaDo"/></u>
                            casova, u prostorijama organa u <u><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Adresa/ob:Mesto"/></u> ul. <u><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Adresa/ob:Ulica"/></u>
                            br. <u><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Adresa/ob:Broj"/></u>, kancelarija br. <u><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:BrojKancelarije"/></u>
                            mozete <b>izvrsiti uvid</b> u dokument/e u kome je sadrzana trazena informacija
                        </div>
                        <div class="tekst">Tom prilikom, na Vas zahtev, moze Vam se izdati i kopija dokumenta sa trazenom informacijom.</div>
                        <div class="obican_tekst">
                            Troskovi su utvrdjeni Uredbom Vlade Republike Srbije ("Sl. glasnik RS", br 8/06), i to:
                            kopija strane A4 formata iznosi <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaA4"/> dinara, A3 formata <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaA3"/> dinara, CD <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaCD"/> dinara, diskete <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaDisketa"/> dinara,
                            DVD <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaDVD"/> dinara, audio-disketa - <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaAudioKaseta"/> dinara, video-kaseta <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:VideoKaseta"/> dinara, pretvaranje jedne strane
                            dokumenta iz fizickog u elektronski oblik - <xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaEDokument"/> dinara.
                        </div>
                        <div class="tekst">
                            Iznos ukupnih troskova izrade kopije dokumenta po vasem zahtevu iznosi 
                            <u><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUplati/ob:UkupniTroskovi"/></u> dinara i uplacuje se 
                            na ziro-racun Budzeta Republike Srbije br. <xsl:value-of select="ob:Obavestenje/ob:InformacijeOUplati/ob:ZiroRacun"/>
                            , s pozivom na broj <xsl:value-of select="ob:Obavestenje/ob:InformacijeOUplati/ob:BrojModela"/>
                            - oznaka sifre opstine/grada gde se nalazi organ vlasti (iz Pravilnika o uslovima i nacinu vodjenja racuna - "Sl. glasnik RS", 20/07... 40/10).
                        </div>
                        <div>Dostavljeno</div>
                        <div>
                            <xsl:value-of select="ob:Obavestenje/ob:Dostavljeno"/><xsl:value-of select="$space"/>
                        </div>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>