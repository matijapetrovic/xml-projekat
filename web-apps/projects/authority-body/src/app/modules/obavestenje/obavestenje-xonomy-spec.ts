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

// TODO: dodati ziro racun validaciju

const elements = {
    "Obavestenje": {
      displayName: 'Obavestenje',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true },
        "rel": { isInvisible: true },
        "href": { isInvisible: true }
      }
    },
    "PodnosiocZahteva": {
      displayName: 'Podnosioc zahteva',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true },
        "rel": { isInvisible: true },
        "href": { isInvisible: true }
      }
    },
    "BrojPredmeta": {
      displayName: 'Broj Predmeta',
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      hasText: true,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "Datum": {
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
    "Naziv": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      },
      hasText: true
    },
    "Ime": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      },
      hasText: true
    },
    "Prezime": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      },
      hasText: true
    },
    "DatumZahteva": {
      displayName: 'Datum zahteva',
      asker: Xonomy.askDate,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "Satnica": {
      asker: Xonomy.askTime,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "SatnicaOd": {
      displayName: 'Satnica od',
      asker: Xonomy.askTime,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "SatnicaDo": {
      displayName: 'Satnica do',
      asker: Xonomy.askTime,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "Troskovi": {
      isInvisible: true
    },
    "BrojModela": {
      displayName: 'Broj modela',
      isReadOnly: true
    },
    "Broj": {
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      }
    },
    "TrazenaInformacija": {
      displayName: 'Trazena informacija'
    },
    "OpisInformacije": {
      displayName: 'Opis informacije',
      asker: Xonomy.askLongString,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      },
      hasText: true
    },
    "InformacijeOUvidu": {
      displayName: 'Informacije o uvidu',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "InformacijeOUplati": {
      displayName: 'Informacije o uplati',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "UkupniTroskovi": {
      displayName: 'Ukupni troskovi',
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      },
      hasText: true
    },
    "ZiroRacun": {
      displayName: 'Ziro racun',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      },
      hasText: true
    },
    "BrojKancelarije": {
      displayName: 'Broj kancelarije',
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      },
      hasText: true
    },
    "Dostavljeno": {
      asker: Xonomy.askPicklist,
      askerParameter: ['Imenovanom', 'Arhivi'],
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    }
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

const obavestenjeSpec = {
    elements,
    validate
};

export default obavestenjeSpec;