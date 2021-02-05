declare const Xonomy: any;

const defaultValidate = function(jsElement) {
  if (!jsElement.getText()) {
    Xonomy.warnings.push({
      htmlID: jsElement.htmlID,
      text: "Ovo polje je obavezno"
    }
    );
  }
};
const positiveNumberValidate = function(jsElement) {
  if(jsElement.getText() && +jsElement.getText() < 0) {
    Xonomy.warnings.push({
      htmlID: jsElement.htmlID,
      text: "Ovo polje mora sadrzati pozitivan broj"
    }
    );
  }
};


const elements = {
    "zlb:ZalbaCutanje": {
      displayName: 'Zalba Cutanje',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true }
       }
    },
    
    "zlb:OrganVlasti": {
      displayName: 'Organ Vlasti',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    }, 
    "co:Naziv": {
      displayName: 'Naziv',
      attributes: {
        "value" : { isInvisible: true},
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Sediste": {
      displayName: 'Sediste',
      attributes: {
        "value" : { isInvisible: true},
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      hasText: true,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        
      }
    },
    "co:Broj": {
      displayName: 'Broj',
      asker: Xonomy.askNumber,
      validate: function(jsElement) { 
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      }
    },


    "co:DatumZahteva": {
      displayName: 'Datum Zahteva',
      asker: Xonomy.askDate,
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },

    "co:Mesto": {
      displayName: 'Mesto',
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      hasText: true,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Datum": {
      displayName: 'Datum',
      asker: Xonomy.askDate,
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },

    "zlb:ZaglavljeZalbe": {
      displayName: 'Zaglavlje Zalbe',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true }
       },
       validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },

    "zlb:Clan": {
      displayName: 'Clan',
    },
    "zlb:Zakon": {
      displayName: 'Zakon',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "zlb:Adresa": {
      displayName: 'Adresa',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },

    "zlb:PodnosilacZalbe": {
      displayName: 'Podnosilac Zalbe',
      attributes: {
        "about": { isInvisible: true },
        "rel": { isInvisible: true },
        "href": { isInvisible: true },
        "vocab": { isInvisible: true }
       },
       validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },

    "zlb:RazlogSlanja": {
      displayName: 'Razlog Slanja',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "zlb:UZakonsomRoku": {
      displayName: 'U Zakonskom Roku',
    },
    "zlb:PodaciOZahtevu": {
      displayName: 'Podaci O Zahtevu',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "zlb:DrugiKontaktPodaci": {
      displayName: 'Drugi Kontakt Podaci',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "zlb:OstaliPodaci": {
      displayName: 'Ostali Podaci',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },

    "co:Ulica": {
      displayName: 'Ulica', 
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Ime": {
      displayName: 'Ime', 
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Prezime": {
      displayName: 'Prezime', 
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Adresa": {
      displayName: 'Adresa', 
    },
    validate: function(jsElement) {
      defaultValidate(jsElement);
    },

    "co:TrazenaInformacija": {
      displayName: 'Trazena Informacija', 
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },

  };

const validate = function(jsElement) {
  //Validate the element:
  let elementSpec = this.elements[jsElement.name];
  if (elementSpec.validate) elementSpec.validate(jsElement);
  //Cycle through the element's attributes:
  for (let i = 0; i < jsElement.attributes.length; i++) {
    let jsAttribute = jsElement.attributes[i];
    let attributeSpec = elementSpec.attributes[jsAttribute.name];
    if (attributeSpec.validate) attributeSpec.validate(jsAttribute);
  }
  //Cycle through the element's children:
  for (let i = 0; i < jsElement.children.length; i++) {
    let jsChild = jsElement.children[i];
    if (jsChild.type == 'element') {
      //if element
      this.validate(jsChild); //recursion
    }
  }
};

const zalbaCutanjeSpec = {
    elements,
    validate
};

export default zalbaCutanjeSpec;