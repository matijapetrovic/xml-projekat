<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:zod="http://www.ftn.uns.ac.rs/xml/tim11/zalbanaodluku"
    xmlns:co="http://www.ftn.uns.ac.rs/xml/tim11/common">
    
    <xsl:variable name="space" select="'&#xA0;'"/>
    
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="zalbanaodluku-page" page-height="29.7cm" page-width="21.0cm" margin="2cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            
            <fo:page-sequence master-reference="zalbanaodluku-page">
                <fo:flow flow-name="xsl-region-body" font-family="Times New Roman">
                    <fo:block font-weight="bold" text-align="center">ZALBA PROTIV ODLUKE ORGANA VLASTI KOJOJM JE</fo:block>
                    <fo:block font-weight="bold" text-align="center">
                        <fo:inline text-decoration="underline">ODBIJEN ILI ODBACEN ZAHTEV</fo:inline> ZA PRISTUP INFORMACIJI
                    </fo:block>
                    <fo:block font-weight="bold">Povereniku za informacije od javnog znacaja i zastitu podataka o licnosti</fo:block>
                    <fo:block>
                        Adresa za postu: Beograd, Bulevar kralja Aleksandra br.15
                    </fo:block>
                    <fo:block font-weight="bold" text-align="center">Z A L B A</fo:block>
                    <fo:block text-align="center">
                        (<fo:block text-decoration="underline">
                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Ime"/>
                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Prezime"/>
                            <fo:inline text-decoration="underline">
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Ulica"/>
                                <xsl:value-of select="$space"/>
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Broj"/>,
                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Mesto"/>
                            </fo:inline>
                        </fo:block>
                        <fo:block text-align="center">Ime, prezime, odnosno naziv, adresa i sediste zalioca</fo:block>
                        <fo:block text-align="center">protiv resenja-zakljucka</fo:block>
                    </fo:block>
                    <fo:block text-decoration="underline" text-align="center">
                        <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOResenju/zod:OrganVlasti/co:Naziv"/>
                    </fo:block>
                    <fo:block text-align="center">(naziv organa koji je doneo odluku)</fo:block>
                    <fo:block>Broj 
                        <fo:inline text-decoration="underline">
                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOResenju/zod:BrojResenja"/>
                        </fo:inline> od 
                        <fo:inline text-decoration="underline">
                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOResenju/zod:DatumResenja"/>
                        </fo:inline> godine.
                    </fo:block>
                    <fo:block text-indent="1rem">
                        <xsl:variable name="zahtev" select="zod:ZalbaNaOdluku/zod:PodaciOZahtevu/zod:DatumZahteva"/>
                        <xsl:variable name="z" select="xs:string(concat(
                            substring($zahtev,9,2),'.',
                            substring($zahtev,6,2),'.',
                            substring($zahtev,1,4),'.'))"/>
                        Navedenom odlukom organa vlasti (resenjem, zakljuckom, obavestenjem u pisanoj formi
                        sa elementima odluke), suprotno zakonu, odbijen-odbacen je moj zahtev koji sam podneo/la-
                        uputio/la dana <fo:inline text-decoration="underline"><xsl:value-of select="$z"/></fo:inline> godine i tako mi uskraceno-onemoguceno ostvarivanje ustavnog i 
                        zakonskog prava na slobodan pristup informacijama od javnog znacaja. Odluku pobijam u 
                        celosti, odnosno u delu kojim 
                        <fo:inline text-decoration="underline">
                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodaciOZahtevu/zod:TrazenaInformacija"/>
                        </fo:inline>
                        jer nije zasnovana na Zakonu o slobodnom pristupu informacijama od javnog znacaja.
                    </fo:block>
                    <fo:block text-indent="1rem">
                        Na osnovu iznetih razloga, predlazem da Poverenik uvazi moju zalbu, ponisti
                        odluka prvostepenog organa i omoguci mi pristup trazenoj/im informaciji/ma.
                    </fo:block>
                    <fo:block text-indent="1rem">
                        Zalbu podnosim blagovremeno, u zakonskom roku utvrdjenom u clanu 22. st. 1. Zakona o
                        slobodnom pristupu informacijama od javnog znacaja. 
                    </fo:block>
                    <fo:block>
                        <fo:table>
                            <fo:table-body>
                                <fo:table-row>
                                    <fo:table-cell text-align="left">
                                        <xsl:variable name="datum" select="zod:ZalbaNaOdluku/zod:OstaliPodaci/co:Datum"/>
                                        <xsl:variable name="d" select="xs:string(concat(
                                            substring($datum,9,2),'.',
                                            substring($datum,6,2),'.',
                                            substring($datum,1,4),'.'))"/>
                                        <fo:block>U 
                                            <fo:inline text-decoration="underline">
                                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:OstaliPodaci/co:Mesto"/>
                                            </fo:inline>
                                        </fo:block>
                                        <fo:block>dana <fo:inline text-decoration="underline"><xsl:value-of select="$d"/></fo:inline></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right">
                                        <fo:block>
                                            <fo:block text-decoration="underline">
                                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Ime"/>
                                                <xsl:value-of select="$space"/>
                                                <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Prezime"/>
                                            </fo:block>
                                        </fo:block>
                                        <fo:block>Podnosilac zalbe/Ime i prezime</fo:block>
                                        <fo:block text-decoration="underline">
                                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Ulica"/>
                                            <xsl:value-of select="$space"/>
                                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Broj"/>, 
                                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:Adresa/co:Mesto"/>
                                        </fo:block>
                                        <fo:block>adresa</fo:block>
                                        <fo:block text-decoration="underline">
                                            <xsl:value-of select="zod:ZalbaNaOdluku/zod:PodnosilacZalbe/co:DrugiKontaktPodaci"/>
                                        </fo:block>
                                        <fo:block>drugi podaci za kontakt</fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </fo:table-body>
                        </fo:table>
                        <fo:list-block>
                            <fo:list-item>
                                <fo:list-item-label end-indent="label-end()">
                                    <fo:block>
                                        <fo:inline font-family="Symbol">*</fo:inline>
                                    </fo:block>
                                </fo:list-item-label>
                                <fo:list-item-body start-indent="body-start()">
                                    <fo:block>
                                        U zalbi se mora navesti odluka koja se pobija (resenje, zakljucak, obavestenje), naziv
                                        organa koji je odluku doneo, kao i broj i datum odluke. Dovoljno je da zalilac navede u 
                                        zalbi u kom pogledu je nezadovoljan odlukom, s tim da zalbu ne mora posebno obrazloziti.
                                        Ako zalbu izjavljuje na ovom obrascu, dodatno obrazlozenje moze posebno priloziti.
                                    </fo:block>
                                </fo:list-item-body>
                            </fo:list-item>
                            <fo:list-item>
                                <fo:list-item-label end-indent="label-end()">
                                    <fo:block>
                                        <fo:inline font-family="Symbol">*</fo:inline>
                                    </fo:block>
                                </fo:list-item-label>
                                <fo:list-item-body start-indent="body-start()">
                                    <fo:block>
                                        Uz zalbu obavesno priloziti kopiju podnetog zahteva i dokaz o njegovoj predaji-uplacivanju organu 
                                        kao i kopiju odluke organa koja se osporava zalbom.
                                    </fo:block>
                                </fo:list-item-body>
                            </fo:list-item>
                        </fo:list-block>
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    
</xsl:stylesheet>