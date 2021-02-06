<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                exclude-result-prefixes="xs"
                version="2.0"
                xmlns:ob="http://www.ftn.uns.ac.rs/xml/tim11/obavestenje"
                xmlns:co="http://www.ftn.uns.ac.rs/xml/tim11/common">

    <xsl:variable name="space" select="'&#xA0;'"/>

    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="obavestenje-page" page-height="29.7cm"
                                       page-width="21.0cm" margin="3cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="obavestenje-page">
                <fo:flow flow-name="xsl-region-body" font-family="Times New Roman">
                    <fo:block text-decoration="underline">
                        <xsl:value-of select="ob:Obavestenje/ob:Organ/co:Naziv"/>
                    </fo:block>
                    <fo:block text-decoration="underline">
                        <xsl:value-of select="ob:Obavestenje/ob:Organ/co:Sediste/co:Ulica"/>
                        <xsl:value-of select="ob:Obavestenje/ob:Organ/co:Sediste/co:Broj"/>
                        <xsl:value-of select="ob:Obavestenje/ob:Organ/co:Sediste/co:Mesto"/>
                    </fo:block>
                    <fo:block>
                        (naziv i sediste organa)
                    </fo:block>
                    <fo:block>
                        <fo:leader></fo:leader>
                    </fo:block>
                    <fo:block>
                        Broj predmeta: <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:BrojPredmeta"/></fo:inline>
                    </fo:block>
                    <fo:block>
                        Datum: <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:Datum"/></fo:inline>
                    </fo:block>
                    <fo:block>
                        <fo:leader></fo:leader>
                    </fo:block>
                    <fo:block margin-top="10px" text-decoration="underline">
                        <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Ime"/><xsl:value-of select="$space"/>
                        <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Prezime"/><xsl:value-of select="$space"/>
                        
                    </fo:block>
                    <fo:block text-decoration="underline">
                        <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Adresa/co:Mesto"/><xsl:value-of select="$space"/>
                        <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Adresa/ob:Ulica"/>,
                        <xsl:value-of select="ob:Obavestenje/ob:PodnosilacZahteva/co:Adresa/ob:Broj"/>
                    </fo:block>
                    <fo:block>
                        Ime i prezime/naziv/i adresa podnosioca zahteva
                    </fo:block>
                    <fo:block font-weight="bold" margin-top="20px" text-align="center">O B A V E S T E Nj E</fo:block>
                    <fo:block font-weight="bold" text-align="center">o stavljanju na uvid dokument koji sadrzi</fo:block>
                    <fo:block font-weight="bold" text-align="center">trazenu informaciju i o izradi kopije</fo:block>
                    <xsl:variable name="date1" select="ob:Obavestenje/ob:TrazenaInformacija/co:DatumZahteva"/>
                    <fo:block text-indent="20px" margin-top="10px">
                        Na osnovu clana 16. st. 1. Zakona o slobodnom pristupu informacijama od javnog znacaja, postupajuci po
                        vasem zahtevu za slobodan pristup informacijama od <fo:inline text-decoration="underline"><xsl:value-of select="$date1"/></fo:inline> god.,
                        kojim ste trazili uvid u dokument/e sa informacijama o/u vezi sa:
                    </fo:block>
                    <fo:block text-decoration="underline">
                        <xsl:value-of select="ob:Obavestenje/ob:TrazenaInformacija/co:TrazenaInformacija"/>
                    </fo:block>
                    <fo:block text-align="center" margin-bottom="10px">(opis trazene informacije)</fo:block>
                    <xsl:variable name="date" select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Datum"/>
                    <xsl:variable name="time" select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Satnica"/>
                    <fo:block>
                        obavestavamo Vas da dana <fo:inline text-decoration="underline"><xsl:value-of select="$date"/></fo:inline>, u <fo:inline text-decoration="underline"><xsl:value-of select="$time"/></fo:inline>
                        , odnosno u vremenu od <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:SatnicaOd"/></fo:inline> do <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:SatnicaDo"/></fo:inline>
                        casova, u prostorijama organa u <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Adresa/ob:Mesto"/></fo:inline> ul. <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Adresa/ob:Ulica"/></fo:inline>
                        br. <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:Adresa/ob:Broj"/></fo:inline>, kancelarija br. <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUvidu/ob:BrojKancelarije"/></fo:inline>
                        mozete <fo:inline font-weight="bold">izvrsiti uvid</fo:inline> u dokument/e u kome je sadrzana trazena informacija.
                    </fo:block>
                    
                    <fo:block><fo:leader></fo:leader></fo:block>
                    <fo:block text-indent="20px">Tom prilikom, na Vas zahtev, moze Vam se izdati i kopija dokumenta sa trazenom informacijom.</fo:block>
                
                    <fo:block><fo:leader></fo:leader></fo:block>
                    <fo:block text-indent="20px">
                        Troskovi su utvrdjeni Uredbom Vlade Republike Srbije ("Sl. glasnik RS", br 8/06), i to:
                            kopija strane A4 formata iznosi <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaA4"/></fo:inline> dinara, A3 formata <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaA3"/></fo:inline> dinara, CD <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaCD"/></fo:inline> dinara, diskete <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaDisketa"/></fo:inline> dinara,
                            DVD <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaDVD"/></fo:inline> dinara, audio-disketa - <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaAudioKaseta"/></fo:inline> dinara, video-kaseta <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:VideoKaseta"/></fo:inline> dinara, pretvaranje jedne strane
                            dokumenta iz fizickog u elektronski oblik - <fo:inline><xsl:value-of select="ob:Obavestenje/ob:Troskovi/ob:CenaEDokument"/></fo:inline> dinara.
                    </fo:block>
                    <fo:block><fo:leader></fo:leader></fo:block>
                    <fo:block text-indent="20px">
                        Iznos ukupnih troskova izrade kopije dokumenta po vasem zahtevu iznosi
                        <fo:inline text-decoration="underline"><xsl:value-of select="ob:Obavestenje/ob:InformacijeOUplati/ob:UkupniTroskovi"/></fo:inline> dinara i uplacuje se
                        na ziro-racun Budzeta Republike Srbije br. <xsl:value-of select="ob:Obavestenje/ob:InformacijeOUplati/ob:ZiroRacun"/>
                        , s pozivom na broj <xsl:value-of select="ob:Obavestenje/ob:InformacijeOUplati/ob:BrojModela"/>
                        - oznaka sifre opstine/grada gde se nalazi organ vlasti (iz Pravilnika o uslovima i nacinu vodjenja racuna - "Sl. glasnik RS", 20/07... 40/10).
                    </fo:block>
                    <fo:block margin-top="10px">Dostavljeno:</fo:block>
                    <fo:block><xsl:value-of select="ob:Obavestenje/ob:Dostavljeno"/><xsl:value-of select="$space"/></fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
</xsl:stylesheet>