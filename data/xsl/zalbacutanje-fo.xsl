<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:zlb="http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje"
    xmlns:co="http://www.ftn.uns.ac.rs/xml/tim11/common">
    
    <xsl:variable name="space" select="'&#xA0;'"/>
    <xsl:variable name="enter" select="'&#xa;'"/>
    
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="zalbacutanje-page" page-height="29.7cm" 
                                       page-width="21.0cm" margin="2cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="zalbacutanje-page">
                <fo:flow flow-name="xsl-region-body" font-family="Times New Roman">
                    <fo:block font-weight="bold">
                        ZALBA KADA ORGAN VLASTI <fo:inline text-decoration="underline">NIJE POSTUPIO/nije postupio u celosti/PO ZAHTEVU</fo:inline>
                    </fo:block> 
                    <fo:block font-weight="bold" margin-bottom="10px">TRAZIOCA U ZAKONSKOM ROKU (CUTANJE UPRAVE)</fo:block>
                    <fo:block>
                        Povereniku za informacije od javnog znacaja i zastitu podataka o licnosti
                        Adresa za postu: Beograd, Bulevar kralja Aleksandra br. 15
                    </fo:block>
                    <fo:block>
                        U skladu sa clanom sa clanom 22. Zakona o slobodnom pristupu informacijama od javnog znacaja podnosim:
                    </fo:block>
                    <xsl:value-of select="$enter"/>
                    <fo:block text-align="center" font-weight="bold">ZALBU</fo:block>
                    <fo:block text-align="center">protiv</fo:block>
                    <fo:block text-align="center" text-decoration="underline">
                        <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Naziv"/>
                        <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Sediste/co:Ulica"/>,
                        <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Sediste/co:Broj"/> 
                        <xsl:value-of select="zlb:ZalbaCutanje/zlb:OrganVlasti/co:Sediste/co:Mesto"/>
                    </fo:block>
                    <fo:block text-align="center">( navesti naziv organa )</fo:block>
                    <fo:block text-align="center">zbog toga sto organ vlasti </fo:block>
                    <fo:block text-align="center">
                        <xsl:if test="boolean(zlb:ZalbaCutanje/zlb:RazlogSlanja/zlb:NijePostupio)">
                            <fo:inline font-weight="bold"><fo:inline text-decoration="underline">nije postupio</fo:inline>/nije postupio u celosti/u zakonskom roku</fo:inline>
                        </xsl:if>
                        <xsl:if test="boolean(zlb:ZalbaCutanje/zlb:RazlogSlanja/zlb:NijePostupioUCelosti)">
                            <fo:inline font-weight="bold">nije postupio/<fo:inline text-decoration="underline">nije postupio u celosti</fo:inline>/u zakonskom roku</fo:inline>
                        </xsl:if>
                        <xsl:if test="boolean(zlb:ZalbaCutanje/zlb:RazlogSlanja/zlb:UZakonsomRoku)">
                            <fo:inline font-weight="bold">nije postupio/nije postupio u celosti/<fo:inline text-decoration="underline">u zakonskom roku</fo:inline></fo:inline>
                        </xsl:if>
                    </fo:block>
                    <fo:block text-align="center">( podvuci zbog cega se izjavljuje zalba)</fo:block>
                    <fo:block margin-top="10px">
                        <xsl:variable name="datum" select="zlb:ZalbaCutanje/zlb:PodaciOZahtevu/zlb:DatumZahteva"/>
                        
                        po mom zahtevu za slobodni pristup informacijama od javnog zanacaja koji sam podneo tom
                        organu dana 
                        <fo:inline text-decoration="underline"><xsl:value-of select="zlb:ZalbaCutanje/zlb:PodaciOZahtevu/co:DatumZahteva"/></fo:inline> 
                        goodine, a kojim sam trazio/la da u skladu sa
                        da mi se u skladu sa Zakonom o slobodnom pristupu informacijama od javnog znacaja omoguci uvid- kopija
                        dokumenta koji sadrzi trazene informacije o/u vezi sa:
                    </fo:block>
                    <fo:block text-decoration="underline">
                        <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodaciOZahtevu/co:TrazenaInformacija"/>
                    </fo:block>
                    <fo:block text-align="center">( navesti podatke o zahtevu i informaciji/ama)</fo:block>
                    <fo:block margin-top="10px" text-indent="1rem">Na osnovu iznetog, predlazem da Poverenik uvazi moju zalbu i omoguci mi pristup trazenoj/im informaciji/ama.</fo:block>
                    <fo:block text-indent="1rem">Kao dokaz, uz zalbu dostavljam kopiju zahteva sa dokazom o predaji organu vlasti.</fo:block>
                    <fo:block text-indent="1rem">
                        <fo:inline font-weight="bold">Napomena:</fo:inline> Kod zalbe zbog nepostupanja po zahtevu u celosti, treba priloziti i dobijeni odgovor organa vlasti.
                    </fo:block>
                    <fo:block text-align="right">
                        <fo:block text-decoration="underline">
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Ime"/>
                            <xsl:value-of select="$space"/>
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Prezime"/>
                        </fo:block>
                        <fo:block>Podnosilac zalbe/Ime i prezime</fo:block>
                        <fo:block text-decoration="underline">
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Adresa/co:Ulica"/><xsl:value-of select="$space"/>
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Adresa/co:Broj"/>,<xsl:value-of select="$space"/>
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/co:Adresa/co:Mesto"/>
                        </fo:block>
                        <fo:block>adresa</fo:block>
                        <fo:block text-decoration="underline">
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:PodnosilacZalbe/zlb:DrugiKontaktPodaci"/>
                        </fo:block>
                        <fo:block>drugi podaci za kontakt</fo:block>
                    </fo:block>
                    <fo:block text-align="left">
                        U <fo:inline text-decoration="underline"><xsl:value-of select="zlb:ZalbaCutanje/zlb:OstaliPodaci/co:Mesto"/></fo:inline>, dana 
                            <xsl:value-of select="zlb:ZalbaCutanje/zlb:OstaliPodaci/co:Datum"/>
                        <fo:inline text-decoration="underline">
                        </fo:inline> godine
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    
</xsl:stylesheet>