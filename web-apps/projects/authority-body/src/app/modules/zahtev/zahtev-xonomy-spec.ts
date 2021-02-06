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
    "za:Zahtev": {
      displayName: 'Zahtev',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true }
       }
    },  
    "za:Organ": {
      displayName: 'Organ',
      attributes: {
        "rel": { isInvisible: true },
        "href": { isInvisible: true }
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
    "co:Broj": {
      displayName: 'Broj',
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      }
    },
    "za:Zahtevi": {
      displayName: 'Zahtevi',
      attributes: {}
    },
    "za:OpisInformacije": {
      displayName: 'OpisInformacije',
      attributes: {}
    },
    "za:OstaliPodaci": {
      displayName: 'OstaliPodaci',
      attributes: {}
    },
    "co:Sediste": {
      displayName: 'Sediste',
    },
    "co:Ulica": {
      displayName: 'Ulica'
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

    "za:TrazilacInformacija": {
      displayName: 'TrazilacInformacija',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true },
        "rel": { isInvisible: true },
        "href": { isInvisible: true }
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
    "za:DrugiKontaktPodaci": {
      displayName: 'DrugiKontaktPodaci',
      attributes: {}
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

const zahtevSpec = {
    elements,
    validate
};

export default zahtevSpec;