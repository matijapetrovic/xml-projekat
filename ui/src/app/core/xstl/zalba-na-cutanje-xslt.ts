export const zalbaCutanjeXSLT = `<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
    xmlns:zlb="http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    body {
                        background-color: grey;
                    }
                    .mainContent {
                        padding-left: 50pt;
                        margin: 0 auto;
                        margin-top: 20pt;
                        margin-bottom: 20pt;
                        background-color: white;
                        padding-right: 50pt;
                        padding-top: 60pt;
                        padding-bottom: 60pt;
                        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
                        width: 82%;
                        position: sticky;
                        top: 25pt;
                    }
 
                    .class1 {
                        width: 100%;
                        border: none;
                    }
                    
                    .class2 {
                        width: 200px;
                        display: inline-block;
                        margin-top: 20pt
                    }

                    .class3 {
                        text-indent: 10pt;
                        margin-top: -40pt;
                        margin-bottom: 30pt;
                        text-align: justify;
                     }
                    
                     .class4 {
                        width: 200px;
                        margin-left: 2px;
                        display: inline-block;
                     }
                    
                     .class5 {
                        width: 50%;
                        margin-left: 2px;
                        display: inline-block;
                     }
                    
                    .bottom {
                        margin-bottom: 0pt;
                    }
                    
                    .bottom30 {
                        margin-top: 0pt;
                        margin-bottom: 30pt;
                    }
                    
                    .noBorderTextBox {
                        font-family: 'Times New Roman';
                        width: 60%;
                        margin-top: 10pt;
                        border: none
                    }
                    
                    .center {
                        margin-top: 0pt;
                        margin-bottom: 0pt;
                    }
                    
                    .timesNewRoman {
                        font-family: 'Times New Roman';
                    }
                    
                    .timesNewRomanInlineBlock {
                        font-family: 'Times New Roman';
                        margin-left: 3pt;
                        display: inline-block;
                        width: 200px
                    }
                   
                    .justifyCenter {
                        text-align: justify;
                        font-size: 11pt;
                        margin-top: 0pt;
                        margin-bottom: 0pt;
                    }
                    
                    .rightBlock {
                        display: block;
                        text-align: right;
                    }
                    
                    .top11pTimesNewRoman {
                        margin-top: 0pt;
                        font-size: 11pt;
                        font-family: 'Times New Roman';
                    }
                    
                    .blockRight {
                        display: block;
                        text-align: right;
                        width: 100%;
                    }
                    
                    .inlineBlockWidth50 {
                        width: 50%;
                        display: inline-block;
                    }
                    
                    .textCenterAlign {
                        text-align: center;
                    }

                    .11pTimesNewRoman {
                        font-size: 11pt;
                        font-family: 'Times New Roman';
                    }

                    .alignCenterTMRoman {
                        margin-top: 0pt;
                        margin-bottom: 0pt;
                        text-align: center;
                        font-size: 11pt;
                        font-family: 'Times New Roman';
                    }
                </style>
            </head>
            <body>
                <div class="mainContent">
                    <h4 class="alignCenterTMRoman">ЖАЛБА КАДА ОРГАН ВЛАСТИ <u>НИЈЕ ПОСТУПИО/ није поступио у целости/ ПО ЗАХТЕВУ</u></h4>
                    <h4 class="alignCenterTMRoman">ТРАЖИОЦА У ЗАКОНСКОМ  РОКУ  (ЋУТАЊЕ УПРАВЕ)</h4>
                    <p class="bottom 11pTimesNewRoman"><b>Поверенику за информације од јавног значаја и заштиту података о личности</b></p>
                    <p class="bottom30 11pTimesNewRoman">
                        Адреса за пошту: <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:Adresa/zlb:Grad"></xsl:value-of>, 
                        <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:Adresa/zlb:Ulica"></xsl:value-of>
                         бр. <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:Adresa/zlb:Broj"></xsl:value-of>
                    </p>
                    <p class="bottom30 11pTimesNewRoman">
                        У складу са чланом 22. Закона о слободном приступу информацијама од јавног значаја подносим:
                    </p>
                    <p class=" textCenterAlign">
                        <strong>Ж А Л Б У</strong>
                    </p>
                    <p class="alignCenterTMRoman" style="margin-top: -10pt">против</p>
                    <div class="textCenterAlign">
                        <textarea rows="2" class="noBorderTextBox textCenterAlign">
                            <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:Sadrzaj/zlb:ZaglavljeZalbe/zlb:NazivOrgana"></xsl:value-of>, <xsl:value-of select="concat(/zlb:ZalbaNaCutanje/zlb:primalac/zlb:Adresa/zlb:Ulica, ' ')"></xsl:value-of><xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:primalac/zlb:Adresa/zlb:Broj"></xsl:value-of>, <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:primalac/zlb:Adresa/zlb:Mesto"></xsl:value-of>
                        </textarea>
                    </div>
                    <p class="alignCenterTMRoman">( навести назив органа )</p>
                    <p class="alignCenterTMRoman" style="margin-top: 15pt">због тога што орган власти:</p>
                    <p class="alignCenterTMRoman">
                        <xsl:if test='/zlb:ZalbaNaCutanje/zlb:Sadrzaj/zlb:RazlogSlanja/zlb:UZakonsomRoku = "није поступио"'>
                            <b><u>није поступио</u> / није поступио у целости / у законском року</b>
                        </xsl:if>
                        <xsl:if test='/zlb:ZalbaNaCutanje/zlb:Sadrzaj/zlb:RazlogSlanja/zlb:UZakonsomRoku = "није поступио у целости"'>
                            <b>није поступио/<u> није поступио у целости</u>/ у законском року</b>
                        </xsl:if>
                        <xsl:if test='/zlb:ZalbaNaCutanje/zlb:Sadrzaj/zlb:RazlogSlanja/zlb:UZakonsomRoku = "није поступио у законском року"'>
                            <b>није поступио / није поступио у целости /<u> у законском року</u></b>
                        </xsl:if>
                        <xsl:if test='/zlb:ZalbaNaCutanje/zlb:Sadrzaj/zlb:RazlogSlanja/zlb:UZakonsomRoku = ""'>
                            <b>није поступио / није поступио у целости / у законском року</b>
                        </xsl:if>
                    </p>
                    <p class="alignCenterTMRoman" style="margin-bottom: 15pt">(подвући  због чега се изјављује жалба)</p>
                    <p class="center">
                        <span class="timesNewRoman">по мом захтеву за слободан приступ информацијама од јавног значаја који сам поднео том органу дана 
                            <xsl:variable name="datum" select="substring-after(/zlb:ZalbaNaCutanje/zlb:PodaciOZahtevu/zlb:Godina, '-')"/>
                            <span class="timesNewRomanInlineBlock">
                                <xsl:value-of select="substring(/zlb:ZalbaNaCutanje/zlb:PodaciOZahtevu/zlb:Godina, 9, 9)"></xsl:value-of>.
                                <xsl:value-of select="substring-before($datum, '-')"></xsl:value-of>.
                                <xsl:value-of select="substring-before(/zlb:ZalbaNaCutanje/zlb:Sadrzaj/zlb:PodaciOZahtevu/zlb:Godina, '-')"></xsl:value-of>.
                            </span>
                            године, а којим сам тражио/ла да ми се у складу са Законом о слободном приступу информацијама од јавног значаја омогући увид- копија документа који садржи информације о /у вези са: <br></br>
                            <textarea rows="3" class="class1 11pTimesNewRoman">
                                <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:PodaciOZahtevu/zlb:PodaciOZahtevuIInformacijama"></xsl:value-of>
                            </textarea><br></br> 
                        </span>
                    </p>
                    <p class="alignCenterTMRoman" style="margin-bottom: 10pt">(навести податке о захтеву и информацији/ама)</p>
                    <p class="justifyCenter">
                        <span class="timesNewRoman">На основу изнетог, предлажем да Повереник уважи моју жалбу и омогући ми приступ траженој/им  информацији/ма.</span>
                    </p>
                    <p class="justifyCenter">
                        <span class="timesNewRoman">Као доказ , уз жалбу достављам копију захтева са доказом о предаји органу власти.</span>
                    </p>
                    <p class="justifyCenter">
                        <span class="timesNewRoman"><b>Напомена:</b> Код жалбе  због непоступању по захтеву у целости, треба приложити и добијени одговор органа власти.</span>
                    </p>
                    <div class="rightBlock">
                        <span class="class2"><xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:PodnosilacZalbe/zlb:Naziv/zlb:ImePosiljaoca/zlb:Ime"></xsl:value-of></span> <span style="padding-left:4px"><xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:PodnosilacZalbe/zlb:Naziv/zlb:Prezime"></xsl:value-of> </span>
                    </div>
                    <div class="rightBlock">
                        <p class="top11pTimesNewRoman">Подносилац жалбе / Име и презиме</p>
                    </div>
                    <div class="blockRight">
                        <span class="inlineBlockWidth50"> <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:PodnosilacZalbe/zlb:Adresa/zlb:Ulica"></xsl:value-of> <span style="padding-left:4px"><xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:PodnosilacZalbe/zlb:Adresa/zlb:Broj"></xsl:value-of></span>, <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:PodnosilacZalbe/zlb:Adresa/zlb:Mesto"></xsl:value-of> </span>
                    </div>
                    <div class="blockRight">
                        <p class="top11pTimesNewRoman">адресa</p>
                    </div>
                    <div class="blockRight">
                        <span class="inlineBlockWidth50"><xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:PodnosilacZalbe/zlb:drugiPodaci"></xsl:value-of> </span>
                    </div>
                    <div class="blockRight">
                        <p class="top11pTimesNewRoman">други подаци за контакт</p>
                    </div>
                    <div class="blockRight">
                        <span class="inlineBlockWidth50"> </span>
                    </div>
                    <div class="blockRight">
                        <p class="top11pTimesNewRoman">потпис</p>
                    </div>
                    <p class="class3 11pTimesNewRoman">У
                        <span class="class4"> 
                            <xsl:value-of select="/zlb:ZalbaNaCutanje/zlb:podaciOPodnosenjuZahteva/zlb:Mesto"></xsl:value-of>
                        </span>, 
                        <span padding-left="4px">дана</span>
                        <span class="class5">
                            ${("0" + new Date().getDate()).slice(-2) + '.' + ("0" + (new Date().getMonth() + 1)).slice(-2) + '.' + new Date().getFullYear()}. године 
                        </span>
                    </p>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
`