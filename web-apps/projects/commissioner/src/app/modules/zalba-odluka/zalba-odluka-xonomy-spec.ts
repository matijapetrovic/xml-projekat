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
  "zod:ZalbaNaOdluku": {
    displayName: 'Zalba Na Odluku',
    attributes: {
      "vocab": { isInvisible: true },
      "about": { isInvisible: true }
     }
  },
  "zod:PodaciOResenju": {
    displayName: 'Podaci O Resenju',
    validate: function(jsElement) {
      defaultValidate(jsElement);
    } 
  },

  "zod:DatumResenja": {
    displayName: 'DatumResenja',
    asker: Xonomy.askDate,
    attributes: {
      "property": { isInvisible: true },
      "datatype": { isInvisible: true }
    },
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "zod:OrganVlasti": {
    displayName: 'Organ Vlasti',
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "co:Naziv": {
    displayName: 'Naziv',
    attributes: {
      "property": { isInvisible: true },
      "datatype": { isInvisible: true }
    },
    hasText: true,
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "co:Sediste": {
    displayName: 'Sediste',
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
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "co:Ulica": {
    displayName: 'Ulica',
    attributes: {
      "property": { isInvisible: true },
      "datatype": { isInvisible: true }
    },
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
  "zod:BrojResenja": {
    displayName: 'Broj Resenja',
    asker: Xonomy.askNumber,
    validate: function(jsElement) {
      defaultValidate(jsElement);
      positiveNumberValidate(jsElement);
    }
  },
  "zod:PodnosilacZalbe": {
    displayName: 'PodnosilacZalbe',
    attributes: {
      "vocab": { isInvisible: true },
      "about": { isInvisible: true },
      "rel": { isInvisible: true },
      "href": { isInvisible: true }
    },
    hasText: true,
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "zod:PodaciOZahtevu": {
    displayName: 'Podaci O Zahtevu',
    attributes: {
      "vocab": { isInvisible: true },
      "about": { isInvisible: true },
      "rel": { isInvisible: true },
      "href": { isInvisible: true }
    },
    hasText: true,
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "co:DatumZahteva": {
    displayName: 'DatumZahteva',
    asker: Xonomy.askDate,
    attributes: {
      "property": { isInvisible: true },
      "datatype": { isInvisible: true }
    },
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "co:TrazenaInformacija": {
    displayName: 'Trazena Informacija',
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
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "zod:DrugiKontaktPodaci": {
    displayName: 'Drugi Kontakt Podaci',
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "zod:OstaliPodaci": {
    displayName: 'Ostali Podaci',
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

const zalbaOdlukaSpec = {
    elements,
    validate
};

export default zalbaOdlukaSpec;