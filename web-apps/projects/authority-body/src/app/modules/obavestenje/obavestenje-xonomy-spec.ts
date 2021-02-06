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
    "ob:Obavestenje": {
      displayName: 'Obavestenje',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true },
        "rel": { isInvisible: true },
        "href": { isInvisible: true }
      }
    },
    "ob:PodnosilacZahteva": {
      displayName: 'Podnosioc zahteva',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true },
        "rel": { isInvisible: true },
        "href": { isInvisible: true }
      }
    },
    "ob:BrojPredmeta": {
      displayName: 'Broj Predmeta',
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:Datum": {
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
    "ob:Naziv": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Ime": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Prezime": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:DatumZahteva": {
      displayName: 'Datum zahteva',
      asker: Xonomy.askDate,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:Satnica": {
      asker: Xonomy.askTime,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:SatnicaOd": {
      displayName: 'Satnica od',
      asker: Xonomy.askTime,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:SatnicaDo": {
      displayName: 'Satnica do',
      asker: Xonomy.askTime,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:Troskovi": {
      isInvisible: true
    },
    "ob:BrojModela": {
      displayName: 'Broj modela',
      isReadOnly: true
    },
    "ob:Broj": {
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      }
    },
    "ob:TrazenaInformacija": {
      displayName: 'Trazena informacija'
    },
    "ob:OpisInformacije": {
      displayName: 'Opis informacije',
      asker: Xonomy.askLongString,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:InformacijeOUvidu": {
      displayName: 'Informacije o uvidu',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:InformacijeOUplati": {
      displayName: 'Informacije o uplati',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:UkupniTroskovi": {
      displayName: 'Ukupni troskovi',
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      }
    },
    "ob:ZiroRacun": {
      displayName: 'Ziro racun',
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "ob:BrojKancelarije": {
      displayName: 'Broj kancelarije',
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      }
    },
    "ob:Dostavljeno": {
      asker: Xonomy.askPicklist,
      askerParameter: ['Imenovanom', 'Arhivi'],
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "co:Adresa": {
      displayName: 'Adresa'
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