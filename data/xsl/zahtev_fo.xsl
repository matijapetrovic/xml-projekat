<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:za="http://www.ftn.uns.ac.rs/xml/tim11/zahtev">
    
    <xsl:variable name="space" select="'&#xA0;'"/>
    
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="zahtev-page" page-height="29.7cm" page-width="21.0cm" margin="2cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            
            <fo:page-sequence master-reference="zahtev-page">
                <fo:flow flow-name="xsl-region-body" font-family="Times New Roman">
                    <fo:block text-decoration="underline" text-align="center">
                        <xsl:value-of select="za:Zahtev/za:Organ/za:Naziv"/>
                    </fo:block>
                    <fo:block text-align="center" margin-bottom="50px">
                        naziv i sedište organa kojem se zahtev upućuje
                    </fo:block>
                    <fo:block font-weight="bold" text-align="center">
                        Z A H T E V
                    </fo:block>
                    <fo:block font-weight="bold" text-align="center" margin-bottom="30px">
                        za pristup informacijama od javnog znacaja
                    </fo:block>
                    <fo:block text-indent="1em">
                        Na osnovu clana 15. st. 1. Zakona o slobdnom pristupu informacija od javnog znacaja
                        ("Sluzbeni glasnik RS" br. 120/04, 54/07, 104/09 i 36/10), od gore navedenog 
                        organa zahtevam:
                    </fo:block>
                    <fo:block margin="auto auto auto 20px">
                        <fo:list-block>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:Obavestenje)">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>Obavestenje da li poseduje trazenu informaciju</fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:Uvid)">
                                <fo:list-item>
                                    <fo:list-item-label  end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>Uvid u dokument koji sadrzi trazenu informaciju</fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:Kopija)">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>Kopiju dokumenta koji sadrzi trazenu informaciju</fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije)">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>Dostavljanje kopije dokumenta koji sadrzi trazenu informaciju</fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                        </fo:list-block>
                    </fo:block>
                    <fo:block margin="auto auto auto 40px">
                        <fo:list-block>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:Posta)">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>postom</fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:ElektronskaPosta)">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>elektronskom postom</fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/NacinDostave/za:Faks)">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>faksom</fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                            <xsl:if test="boolean(za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:Drugo)">
                                <fo:list-item>
                                    <fo:list-item-label end-indent="label-end()">
                                        <fo:block>
                                            <fo:inline font-family="Symbol">*</fo:inline>
                                        </fo:block>
                                    </fo:list-item-label>
                                    <fo:list-item-body start-indent="body-start()">
                                        <fo:block>
                                            na drugi nacin: <fo:inline text-decoration="underline">
                                                <xsl:value-of select="za:Zahtev/za:Zahtevi/za:DostavljanjeKopije/za:NacinDostave/za:Drugo/za:Opis"/>       
                                            </fo:inline>
                                        </fo:block>
                                    </fo:list-item-body>
                                </fo:list-item>
                            </xsl:if>
                        </fo:list-block>
                    </fo:block>
                    <fo:block text-indent="1em">
                        Ovaj zahtev se odnosi na sledece informacije: <fo:inline text-decoration="underline">
                            <xsl:value-of select="za:Zahtev/za:Zahtevi/za:Informacije"/>
                        </fo:inline>
                    </fo:block>
                    <fo:block font-size="10pt" margin-bottom="20px">
                        (navesti sto precizniji opis informacije koja se trazi, kao i druge podatke koji olaksavaju pronalazenje trazene informacije)
                    </fo:block>
                    <fo:block>
                        <fo:table>
                            <fo:table-body>
                                <fo:table-row>
                                    <fo:table-cell text-align="left" margin-top="30px">
                                        <fo:block>
                                            U <fo:inline>
                                                <xsl:value-of select="za:Zahtev/za:OstaliPodaci/za:Mesto"/>
                                            </fo:inline>
                                        </fo:block>
                                        <fo:block>
                                            <xsl:variable name="dt" select="za:Zahtev/za:OstaliPodaci/za:Datum"/>
                                            <xsl:variable name="date" select="xs:date(concat(
                                                substring($dt,1,4),'-',
                                                substring($dt,6,2),'-',
                                                substring($dt,9,2)))"/>
                                            dana <xsl:value-of select="format-date($date,'[D].[M].[Y].')"/> godine
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" margin-top="10px">
                                        <fo:block text-decoration="underline">
                                            <xsl:value-of select="za:Zahtev/za:TrazilacInformacija/za:Ime"/><xsl:value-of select="$space"/>
                                            <xsl:value-of select="za:Zahtev/za:TrazilacInformacija/za:Prezime"/>
                                        </fo:block>
                                       
                                        <fo:block margin-bottom="10px">
                                            Trazilac informacije/Ime i prezime
                                        </fo:block>
                                        <fo:block text-decoration="underline">
                                            <xsl:value-of select="za:Zahtev/za:TrazilacInformacija/za:Adresa"/>
                                        </fo:block>
                                        <fo:block margin-bottom="10px">
                                            adresa
                                        </fo:block>
                                        <fo:block text-decoration="underline">
                                            <xsl:value-of select="za:Zahtev/za:TrazilacInformacija/za:Kontakt"/>
                                        </fo:block>
                                        <fo:block>
                                            drugi podaci za kontakt
                                        </fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </fo:table-body>
                        </fo:table>
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    
</xsl:stylesheet>