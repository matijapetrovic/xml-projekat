<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    exclude-result-prefixes="xs"
    version="2.0"
    xmlns:re="http://www.ftn.uns.ac.rs/xml/tim11/resenje"
    xmlns:co="http://www.ftn.uns.ac.rs/xml/tim11/common">
    
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="resenje-page" page-height="29.7cm"
                    page-width="21.0cm" margin="3cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="resenje-page">
                <fo:flow flow-name="xsl-region-body" font-family="Times New Roman">
                    <fo:block>
                        Resenje - 
                        <xsl:if test="re:Resenje/re:Svrha = 'ZalbaOsnovanaNalazeSe'">
                            <fo:inline>kada je zalba osnovana nalaze se:</fo:inline>
                        </xsl:if>
                        <xsl:if test="re:Resenje/re:Svrha = 'ZalbaNeosnovanaOdbijaSe'">
                            <fo:inline>– odbija se kao neosnovana</fo:inline>
                        </xsl:if>
                        <xsl:if test="re:Resenje/re:Svrha = 'OdbijaSeZahtev'">
                            <fo:inline>odbija se zahtev:</fo:inline>
                        </xsl:if>
                        <xsl:if test="re:Resenje/re:Svrha = 'PonistavaSe'">
                            <fo:inline>ponistava se:</fo:inline>
                        </xsl:if>
                    </fo:block>
                    <fo:block>Br
                        <xsl:value-of select="re:Resenje/re:BrojResenja"/>
                    </fo:block>
                    <fo:block margin-left="50px">
                        <xsl:value-of select="re:Resenje/re:DatumResenja"/>
                    </fo:block>
                    <fo:block margin-top="10px">
                        Poverenik za informacije od javnog značaja i zaštitu podataka o ličnosti, u postupku po albi
                        koju je izjavio AA, zbog nepostupanja
                        <fo:inline><xsl:value-of select="re:Resenje/re:OrganVlasti"/></fo:inline>
                        po njegovom zahtevu od <fo:inline><xsl:value-of select="re:Resenje/re:DatumZalbe"/></fo:inline>
                        godine za pristup informacijama od javnog značaja, na osnovu člana 35. stav 1. tačka 5. Zakona o slobodnom pristupu
                        informacijama od javnog značaja („Sl. glasnik RS“, br. 120/04, 54/07, 104/09 i 36/10), a u vezi sa
                        članom 4. tačka 22. Zakona o zaštiti podataka o ličnosti („Sl. glasnik RS“, broj 87/18), kao i člana
                        23. i člana 24. stav 4. Zakona o slobodnom pristupu informacijama od javnog značaja i člana 173.
                        stav 2. Zakona o opštem upravnom postupku („Sl. glasnik RS“, br. 18/2016 i 95/2018-autentično
                        tumačenje), donosi
                    </fo:block>
                        I nalazi se <fo:inline><xsl:value-of select="re:Resenje/re:Sadrzaj/re:Ustanova/re:Naziv"/></fo:inline>
                        u <fo:inline><xsl:value-of select="re:Resenje/re:Sadrzaj/re:Ustanova/re:Adresa"/></fo:inline>
                    <fo:block>
                        sa privremenim sedištem u Leposaviću, da
                        bez odlaganja, a najkasnije u roku od pet dana od dana prijema ovog rešenja, obavesti AA, da li
                        poseduje tražene informacije odnosno dokument u kome su iste sadržane, i to: Ugovor o radu koji
                        je kao poslednji potpisan između tog Fakulteta i BB, te da mu, ukoliko takav dokument poseduje
                        dostavi kopiju istog elektronskom poštom na adresu … ili poštom, s tim što će pre dostavljanja
                        zaštititi i učiniti nedostupnim podatke o ličnosti kojima bi se povredilo pravo na privatnost
                        lica na koje se informacije odnose, kao što su: adresa stanovanja, lični matični broj građana, ime
                        oca, radni staž, prosečna ocena studiranja i sl. ukoliko su takvi podaci sadržani u traženom
                        dokumentu.
                        <fo:inline><xsl:value-of select="re:Resenje/re:Sadrzaj/re:Ishod"/></fo:inline>
                    </fo:block>
                   
                    <fo:block text-indent="20px" margin-top="10px">
                        PodnosilacZalbe0 , kao trazilac informacija izjavio je dana 
                        <fo:inline><xsl:value-of select="re:Resenje/re:Obrazlozenje/re:PredmetSlanja/re:DatumIzjave"/></fo:inline>
                        godine zalbu POvereniku zbog nepostupanja
                        <fo:inline><xsl:value-of select="re:Resenje/re:Obrazlozenje/re:PredmetSlanja/re:OrganVlasti"/></fo:inline>
                        po njegovom zahtevu od
                        <fo:inline><xsl:value-of select="re:Resenje/re:Obrazlozenje/re:PredmetSlanja/re:DatumPotrazivanjaInformacija"/></fo:inline>
                        godine za pristup informacijama od javnog znacaja i u prilogu
                        dostavion kopiju istog.
                    </fo:block>
                    <fo:block text-indent="20px">
                        Postupajuci po zalbi, Poverenik je dana
                        <fo:inline><xsl:value-of select="re:Resenje/re:Obrazlozenje/re:Postupak/re:DatumPostupka"/></fo:inline>
                        godine uputio je istu na izjasnjenje
                        <fo:inline><xsl:value-of select="re:Resenje/re:Obrazlozenje/re:Postupak/re:Ustanova/re:Naziv"/></fo:inline>u
                        <fo:inline><xsl:value-of select="re:Resenje/re:Obrazlozenje/re:Postupak/re:Ustanova/re:Adresa"/></fo:inline>
                        kao organu vlasti u
                        smislu člana 3. Zakona o slobodnom pristupu informacijama od javnog značaja i zatražio da se
                        izjasni o navodima žalbe, posebno o razlozima nepostupanja u zakonskom roku po podnetom zahtevu
                        u skladu sa odredbama člana 16. st.1-9. ili st. 10. Zakona, ostavljajući rok od osam dana, povodom
                        čega nije dobio odgovor.
                    </fo:block>
                    <fo:block text-indent="20px">
                        Po razmatranju žalbe i ostalih spisa ovog predmeta, doneta je odluka kao u dispozitivu
                        rešenja iz sledećih razloga:
                        Uvidom u spise predmeta utvrđeno je da je AA, dana 16.04.2020. godine, podneo Učiteljskom
                        fakultetu u Prizrenu sa privremenim sedištem u Leposaviću, zahtev za pristup informacijama
                        od javnog značaja, elektronskom poštom, kojim je tražio informacije od javnog značaja, bliže
                        navedene u stavu I dispozitiva ovog rešenja.
                        Takođe je uvidom u spise predmeta utvrđeno da po podnetom zahtevu žalioca organ vlasti
                        nije postupio, što je bio dužan da učini bez odlaganja, a najkasnije u roku od 15 dana od dana
                        prijema zahteva te da ga, u smislu člana 16. stav 1. Zakona o slobodnom pristupu informacijama od
                        javnog značaja, obavesti da li poseduje tražene informacije i da mu, ukoliko iste poseduje, dostavi
                        kopije dokumenata u kojima su one sadržane ili da, u suprotnom, donese rešenje o odbijanju zahteva,
                        u smislu stava 10. istog člana.
                        Članom 2. stav 1. Zakona o slobodnom pristupu informacijama od javnog značaja propisano
                        je da je informacija od javnog značaja, u smislu ovog zakona, informacija kojom raspolaže organ
                        javne vlasti, nastala u radu ili u vezi sa radom organa javne vlasti, sadržana u određenom
                        dokumentu, a odnosi se na sve ono o čemu javnost ima opravdan interes da zna.
                        Imajući u vidu da je žalilac podnetim zahtevom tražio odgovore na određena pitanja u vezi
                        sa ranije dobijenim obaveštenjem tog Preduzeća od 29.10.2018. godine, Poverenik nalazi da se u
                        konkretnom slučaju, ne radi o informacijama od javnog značaja, u smislu citirane odredbe člana
                        2. stav 1. Zakona, te da je zahtev neosnovan. Ovo iz razloga što bi postupanje organa vlasti po
                        podnetom zahtevu zahtevalo davanje odgovora na pitanja, objašnjenja, obrazloženja, komentare, što
                        bi podrazumevalo sačinjavanje novog dokumenta, dok u smislu citirane odredbe Zakona, organ
                        vlasti nema obavezu da to čini, jer informacija od javnog značaja može biti samo ona informacija
                        koja je već sadržana, odnosno opredmećena u dokumentu, u momentu kada je zatražena, odnosno koja
                        već postoji, a što ovde nije slučaj.
                        Kako je organ vlasti propustio da odluči po podnetom zahtevu, odnosno da donese rešenje i
                        odbije podneti zahtev, a nije opravdao razloge nedonošenja rešenja, Poverenik je, u postupku po
                        žalbi, na osnovu člana 23. i člana 24. st. 1. Zakona o slobodnom pristupu informacijama od javnog
                        značaja i člana 173. st. 2. Zakona o opštem upravnom postupku odlučio kao u dispozitivu ovog
                        rešenja, odnosno odbio zahtev žalioca, kao neosnovan.
                        
                        Protiv ovog resenja nije dopuštena žalba već se, u skladu sa Zakonom o upravnim
                        sporovima, može pokrenuti upravni spor tužbom Upravnom sudu u Beogradu, u roku od 30 dana od
                        dana prijema rešenja
                        Taksa na sluzbu iznosi
                        <fo:inline><xsl:value-of select="re:Resenje/re:Obrazlozenje/re:Odluka/re:Iznos"/></fo:inline>dinara.
                    </fo:block>
                    
                    <fo:block margin-top="10px">Poverenik:</fo:block>
                    <fo:block>
                        <xsl:value-of select="re:Resenje/re:Poverenik/re:Ime"/>
                        <xsl:value-of select="re:Resenje/re:Poverenik/re:Prezime"/>
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    
</xsl:stylesheet>