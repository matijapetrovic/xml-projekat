<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:zlb="http://www.ftn.uns.ac.rs/xml/tim11/zahtev"
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
                    .naslov {
                    text-align: center;
                    }
                    .naslov_opis {
                    text-align: center;
                    margin-bottom: 20px;
                    }
                    .centriran_text {
                    text-align: center;
                    }
                    .tekst {
                    margin-top: 10px;
                    text-indent: 1rem;
                    }
                    .obican_tekst {
                    margin-top: 10px;
                    }
                    .desno {
                    text-align: right;
                    }
                    .levo {
                    text-align: left;
                    }
                </style>
            </head>
            <body>
                <div class="a4">
                    <div class="sadrzaj">
                        <div class="naslov"><b>ZALBA KADA ORGAN VLASTI <u>NIJE POSTUPIO/nije postupio u celosti/PO ZAHTEVU</u></b></div>
                        <div class="naslov_opis"><b>TRAZIOCA U ZAKONSKOM ROKU (CUTANJE UPRAVE)</b></div>
                        <div><b><xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Naziv"/></b></div>
                        <div>
                            Adresa za postu: <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Sediste/co:Mesto"/>,
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Sediste/co:Ulica"/>
                            br. <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Sediste/co:Broj"/>
                        </div>
                        <div>
                            U skladu sa clanom <xsl:value-of select="zlb:ZalbaCutanje/zlb:ZaglavljeZalbe/zlb:Clan"/>.
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:ZaglavljeZalbe/zlb:Zakon"/> podnosim:
                        </div>
                        <div class="centriran_text"><b>ZALBU</b></div>
                        <div class="centriran_text">protiv</div>
                        <div class="centriran_text">
                            <u>
                                <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Naziv"/>
                            </u>
                        </div>
                        <div class="centriran_text">( navesti naziv organa )</div>
                        <div class="centriran_text">zbog toga sto organ vlasti</div>
                        <div  class="centriran_text">
                            <xsl:variable name="razlog" select="zlb:Zalbacutanje/zlb:RazlogSlanja"/>
                            <xsl:choose>
                                <xsl:when test="$razlog = 'nije postupio'">
                                    <b><u>nije postupio</u>/nije postupio u celosti/u zakonskom roku</b>
                                </xsl:when>
                                <xsl:when test="$razlog = 'nije postupio u celosti'">
                                    <b>nije postupio/<u>nije postupio u celosti</u>/u zakonskom roku</b>
                                </xsl:when>
                                <xsl:otherwise>
                                    <b>nije postupio/nije postupio u celosti/<u>u zakonskom roku</u></b>
                                </xsl:otherwise>
                            </xsl:choose>
                        </div>
                        <div class="centriran_text">( podvuci zbog cega se izjavljuje zalba)</div>
                        <div class="obican_tekst">
                            <xsl:variable name="datum" select="zlb:ZalbaCutanje/zlb:PodaciOZahtevu/zlb:DatumZahteva"/>
                            <xsl:variable name="d" select="xs:string(concat(
                                substring($datum,9,2),'.',
                                substring($datum,6,2),'.',
                                substring($datum,1,4),'.'))"/>
                            po mom zahtevu za slobodni pristup informacijama od javnog zanacaja koji sam podneo tom
                            organu dana <u><xsl:value-of select="$d"/></u> goodine, a kojim sam trazio/la da u skladu sa
                            da mi se u skladu sa Zakonom o slobodnom pristupu informacijama od javnog znacaja omoguci uvid- kopija
                            dokumenta koji sadrzi trazene informacije o/u vezi sa:
                        </div>
                        <div>
                            <u><xsl:value-of select="zlb:ZalbaCutanje/zlb:PodaciOZahtevu/zlb:TrazenaInformacija"/></u>
                        </div>
                        <div class="centriran_text">( navesti podatke o zahtevu i informaciji/ama)</div>
                        <div class="tekst">Na osnovu iznetog, predlazem da Poverenik uvazi moju zalbu i omoguci mi pristup trazenoj/im informaciji/ama.</div>
                        <div class="tekst">Kao dokaz, uz zalbu dostavljam kopiju zahteva sa dokazom o predaji organu vlasti.</div>
                        <div class="tekst"><b>Napomena:</b> Kod zalbe zbog nepostupanja po zahtevu u celosti, treba priloziti i dobijeni odgovor organa vlasti.</div>
                        <div class="desno">
                            <div>
                                <u>
                                    <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Ime"/>
                                    <xsl:value-of select="$space"/>
                                    <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Prezime"/>
                                </u>
                            </div>
                            <div>Podnosilac zalbe/Ime i prezime</div>
                            <div>
                                <u><xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Adresa/co:Ulica"/><xsl:value-of select="$space"/>
                                    <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Adresa/co:Broj"/>,<xsl:value-of select="$space"/>
                                    <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Adresa/co:Mesto"/></u>
                            </div>
                            <div>adresa</div>
                            <div>
                                <u><xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/zlb:DrugiKontaktPodaci"/></u>
                            </div>
                            <div>drugi podaci za kontakt</div>
                        </div>
                        <div class="levo">
                            <xsl:variable name="datum1" select="zlb:ZalbaCutanje/zlb:OstaliPodaci/zlb:Datum"/>
                            <xsl:variable name="d1" select="xs:string(concat(
                                substring($datum1,9,2),'.',
                                substring($datum1,6,2),'.',
                                substring($datum1,1,4),'.'))"/>
                            U <u><xsl:value-of select="zlb:ZalbaCutanje/zlb:OstaliPodaci/zlb:Mesto"/></u>,
                            dana <u><xsl:value-of select="$d1"/></u> godine
                        </div>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>