declare const Xonomy: any;

const elements = {
    "Obavestenje": {
      displayName: 'Obavestenje',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true }
      }
    },
    "BrojPredmeta": {
      displayName: 'Broj Predmeta',
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      }
    },
    "Datum": {
      displayName: 'Datum',
      asker: Xonomy.askDate,
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      }
    },
    "Naziv": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      }
    },
    "Ime": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      }
    },
    "Prezime": {
      attributes: {
        "property": { isInvisible: true },
        "datatype": { isInvisible: true }
      }
    },
    "DatumZahteva": {
      displayName: 'Datum zahteva',
      asker: Xonomy.askDate
    },
    "Satnica": {
      asker: Xonomy.askTime
    },
    "SatnicaOd": {
      displayName: 'Satnica od',
      asker: Xonomy.askTime
    },
    "SatnicaDo": {
      displayName: 'Satnica do',
      asker: Xonomy.askTime
    },
    "Troskovi": {
      isInvisible: true
    },
    "BrojModela": {
      displayName: 'Broj modela',
      isReadOnly: true
    },
    "Broj": {
      asker: Xonomy.askNumber
    },
    "TrazenaInformacija": {
      displayName: 'Trazena informacija'
    },
    "OpisInformacije": {
      displayName: 'Opis informacije',
      asker: Xonomy.askLongString
    },
    "InformacijeOUvidu": {
      displayName: 'Informacije o uvidu'
    },
    "InformacijeOUplati": {
      displayName: 'Informacije o uplati'
    },
    "UkupniTroskovi": {
      displayName: 'Ukupni troskovi',
      asker: Xonomy.askNumber
    },
    "ZiroRacun": {
      displayName: 'Ziro racun'
    },
    "BrojKancelarije": {
      displayName: 'Broj kancelarije',
      asker: Xonomy.askNumber
    },
    "PodnosiocZahteva": {
      displayName: 'Podnosioc zahteva'
    },
    "Dostavljeno": {
      asker: Xonomy.askPicklist,
      askerParameter: ['Imenovanom', 'Arhivi']
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