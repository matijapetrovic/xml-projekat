<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:za="http://www.ftn.uns.ac.rs/xml/tim11/zahtev"
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
                    .organ {
                    text-align: center;
                    }
                    .organ_opis {
                    text-align: center;
                    margin-bottom: 50px;
                    }
                    .zahtev {
                    text-align: center;
                    }
                    .zahtev_opis {
                    text-align: center;
                    margin-bottom: 30px;
                    }
                    .tekst {
                    text-indent:1em;
                    }
                    .informacije {
                    text-indent:1em;
                    }
                    .opis_informacije {
                    font-size: 10pt;
                    margin-bottom: 20px;
                    }
                    ul.a {
                    list-style-type: square;
                    }
                    .levo {
                    text-align: left;
                    }
                    .desno {
                    text-align: right;
                    }
                    table {
                    width: 95%;
                    }
                    .opis {
                    font-size: 10pt;
                    margin-bottom: 10px;
                    }
                    .red {
                    text-align: center;
                    }
                </style>
            </head>
            <body>
                <div class="a4">
                    <div class="sadrzaj">
                        <div class="organ">
                            <u>
                                <xsl:value-of select="za:Zahtev/za:Organ/co:Naziv"/>
                                <xsl:value-of select="za:Zahtev/za:Organ/co:Sediste"/>
                            </u>
                        </div>
                        <div class="organ_opis">naziv i sedište organa kojem se zahtev upućuje</div>
                        <div class="zahtev"><b>Z A H T E V</b></div>
                        <div class="Zahtev_opis"><b>za pristup informacijama od javnog znacaja</b></div>
                        <div class="tekst">
                            Na osnovu clana 15. st. 1. Zakona o slobdnom pristupu informacija od javnog znacaja
                            ("Sluzbeni glasnik RS" br. 120/04, 54/07, 104/09 i 36/10), od gore navedenog 
                            organa zahtevam:
                            <ul class="a">
                                <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:Obavestenje)">
                                    <li>
                                        obavestenje da li poseduje trazenu infoemaciju
                                    </li>
                                </xsl:if>
                                <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:Uvid)">
                                    <li>
                                        uvid u dokument koji sadrzi trazenu informaciju
                                    </li>
                                </xsl:if>
                                <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:Kopija)">
                                    <li>
                                        kopiju dokumenta koji sadrzi trazenu informaciju
                                    </li>
                                </xsl:if>
                                <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije)">
                                    <li>
                                        dostavljanje kopije dokumenta koji sadrzi trazenu informaciju
                                    </li>
                                </xsl:if>
                                <ul class="a">
                                    <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:Posta)">
                                        <li>
                                            postom
                                        </li>
                                    </xsl:if>
                                    <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:ElektronskaPosta)">
                                        <li>
                                            elektronskom postom
                                        </li>
                                    </xsl:if>
                                    <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:Faks)">
                                        <li>
                                            faksom
                                        </li>
                                    </xsl:if>
                                    <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:Drugo)">
                                        <li>
                                            na drugi nacin: 
                                            <u>
                                                <xsl:value-of select="za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:Drugo/za:Opis"/>
                                            </u>
                                        </li>
                                    </xsl:if>
                                </ul>
                            </ul>
                            <div>
                                <div class="informacije">Ovaj zahtev se odnosi na sledece informacije:
                                    <u>
                                        <xsl:value-of select="za:Zahtev/za:OpisInformacije"/>
                                    </u>
                                </div>
                            </div>
                            <div class="opis_informacije">(navesti sto precizniji opis informacije koja se trazi, kao i druge podatke koji olaksavaju pronalazenje trazene informacije)</div>
                        </div>
                        <div>
                            <table>
                                <tr>
                                    <td>
                                        <div class="levo">
                                            <div>U 
                                                <u>
                                                    <xsl:value-of select="za:Zahtev/za:OstaliPodaci/co:Mesto"/>
                                                </u>,
                                            </div>
                                            <xsl:variable name="dt" select="za:Zahtev/za:OstaliPodaci/co:Datum"/>
                                            <xsl:variable name="date" select="xs:date(concat(
                                                substring($dt,1,4),'-',
                                                substring($dt,6,2),'-',
                                                substring($dt,9,2)))"/>
                                            <div>dana <u><xsl:value-of select="format-date($date,'[D].[M].[Y].')"/>godine</u></div>
                                        </div>
                                    </td>
                                    <td>	
                                        <div class="desno">
                                            <div>
                                                <div>
                                                    <u>
                                                        <xsl:value-of select="za:Zahtev/za:TrazilacInformacija/co:Ime"/>
                                                        <xsl:value-of select="$space"/>
                                                    </u>
                                                </div>
                                                    <u>
                                                        <xsl:value-of select="za:Zahtev/za:TrazilacInformacija/co:Prezime"/>
                                                    </u>
                                                <div class="opis">Trazilac informacije/Ime i prezime</div>
                                            </div>
                                            <div>
                                                <div>
                                                    <u><xsl:value-of select="za:Zahtev/za:TrazilacInformacija/co:Adresa/co:Ulica"/></u>
                                                    <u><xsl:value-of select="za:Zahtev/za:TrazilacInformacija/co:Adresa/co:Broj"/></u>
                                                    <u><xsl:value-of select="za:Zahtev/za:TrazilacInformacija/co:Adresa/co:Mesto"/></u>
                                                </div>
                                                <div class="opis">adresa</div>
                                            </div>
                                            <div>
                                                <div>
                                                    <u><xsl:value-of select="za:Zahtev/za:TrazilacInformacija/za:DrugiKontaktPodaci"/></u>
                                                </div>
                                                <div class="opis">drugi podaci za kontakt</div>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>