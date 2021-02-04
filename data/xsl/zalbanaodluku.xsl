<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:zod="http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku"
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
                    table {
                    width: 95%;
                    }
                    .naslov_opis {
                    text-align: center;
                    margin-bottom: 10px;
                    }
                    .zalba {
                    text-align: center;
                    margin-bottom: 20px;
                    margin-top: 20px;
                    }
                    .centriran_tekst {
                    text-align: center;
                    }
                    .tekst {
                    text-indent: 1rem;
                    }
                    .levo {
                    text-align: left;
                    }
                    .desno {
                    text-align: right
                    }
                </style>
            </head>
            <body>
                <div class="a4">
                    <div class="sadrzaj">
                        <div class="naslov"><b>ZALBA PROTIV ODLUKE ORGANA VLASTI KOJOJM JE</b></div>
                        <div class="naslov_opis"><b><u>ODBIJEN ILI ODBACEN ZAHTEV</u> ZA PRISTUP INFORMACIJI</b></div>
                        <div><b>Povereniku za informacije od javnog znacaja i zastitu podataka o licnosti</b></div>
                        <div>
                            Adresa za postu: Beograd, Bulevar kralja Aleksandra br.15 
                        </div>
                        <div class="zalba"><b>Z A L B A</b></div>
                        <div class="centriran_tekst">
                            <div>
                                (<u><xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Ime"/></u>
                                <u><xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Prezime"/></u>
                            </div>
                        </div>
                        <div class="centriran_tekst">
                            <u>
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Ulica"/>
                                <xsl:value-of select="$space"/>
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Broj"/>,
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Mesto"/>
                            </u>)
                        </div>
                        <div class="centriran_tekst">Ime, prezime, odnosno naziv, adresa i sediste zalioca</div>
                        <div class="centriran_tekst">protiv resenja-zakljucka</div>
                        <div class="centriran_tekst">
                            (<u>
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOResenju/zod:OrganVlasti/co:Naziv"/>
                            </u>)
                        </div>
                        <div class="centriran_tekst">(naziv organa koji je doneo odluku)</div>
                        <div>Broj 
                            <u>
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOResenju/zod:BrojResenja"/>
                            </u> od 
                            <u>
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOResenju/zod:DatumResenja"/>
                            </u> godine.
                        </div>
                        <div class="tekst">
                            <xsl:variable name="zahtev" select="zod:ZalbaNaOdluku/zod:PodaciOZahtevu/zod:DatumZahteva"/>
                            <xsl:variable name="z" select="xs:string(concat(
                                substring($zahtev,9,2),'.',
                                substring($zahtev,6,2),'.',
                                substring($zahtev,1,4),'.'))"/>
                            Navedenom odlukom organa vlasti (resenjem, zakljuckom, obavestenjem u pisanoj formi
                            sa elementima odluke), suprotno zakonu, odbijen-odbacen je moj zahtev koji sam podneo/la-
                            uputio/la dana <u><xsl:value-of select="$z"/></u> godine i tako mi uskraceno-onemoguceno ostvarivanje ustavnog i 
                            zakonskog prava na slobodan pristup informacijama od javnog znacaja. Odluku pobijam u 
                            celosti, odnosno u delu kojim 
                            <u><xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOZahtevu/zod:TrazenaInformacija"/></u>
                            jer nije zasnovana na jer nije zasnovana na Zakonu o slobodnom pristupu informacijama od javnog znacaja.
                        </div>
                        <div class="tekst">
                            Na osnovu iznetih razloga, predlazem da Poverenik uvazi moju zalbu, ponisti
                            odluka prvostepenog organa i omoguci mi pristup trazenoj/im informaciji/ma.
                        </div>
                        <div class="tekst">
                            Zalbu podnosim blagovremeno, u zakonskom roku utvrdjenom u clanu 22. st. 1. Zakona o
                            slobodnom pristupu informacijama od javnog znacaja. 
                        </div>
                        <div>
                            <table>
                                <tr>
                                    <td>
                                        <div class="levo">
                                            <xsl:variable name="datum" select="zod:ZalbaNaOdluku/zod:OstaliPodaci/co:Datum"/>
                                            <xsl:variable name="d" select="xs:string(concat(
                                                substring($datum,9,2),'.',
                                                substring($datum,6,2),'.',
                                                substring($datum,1,4),'.'))"/>
                                            <div>U <u><xsl:value-of select="zod:ZalbaNaOdluku/zod:OstaliPodaci/co:Mesto"/></u>,</div>
                                            <div>dana <u><xsl:value-of select="$d"/></u> godine</div>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="desno">
                                            <div>
                                                <u>
                                                    <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Ime"/>
                                                    <xsl:value-of select="$space"/>
                                                    <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Prezime"/>
                                                </u>
                                            </div>
                                            <div>Podnosilac zalbe/Ime i prezime</div>
                                            <div><u>
                                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Ulica"/>
                                                <xsl:value-of select="$space"/>
                                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Broj"/>, 
                                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Mesto"/>
                                            </u></div>
                                            <div>adresa</div>
                                            <div>
                                                <u><xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:DrugiKontaktPodaci"/></u>
                                            </div>
                                            <div>drugi podaci za kontakt</div>
                                        </div>
                                    </td>
                                </tr>
                            </table>
                            <div class="tekst"><b>Napomena: </b></div>
                            <ul>
                                <li>
                                    <div>
                                        U zalbi se mora navesti odluka koja se pobija (resenje, zakljucak, obavestenje), naziv
                                        organa koji je odluku doneo, kao i broj i datum odluke. Dovoljno je da zalilac navede u 
                                        zalbi u kom pogledu je nezadovoljan odlukom, s tim da zalbu ne mora posebno obrazloziti.
                                        Ako zalbu izjavljuje na ovom obrascu, dodatno obrazlozenje moze posebno priloziti.
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        Uz zalbu obavesno priloziti kopiju podnetog zahteva i dokaz o njegovoj predaji-uplacivanju organu 
                                        kao i kopiju odluke organa koja se osporava zalbom.
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>