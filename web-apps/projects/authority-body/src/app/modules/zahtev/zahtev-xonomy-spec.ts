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
    "Zahtev": {
      displayName: 'Zahtev',
      attributes: { }
    },  
    "Primalac": {
      displayName: 'Primalac',
      attributes: {
        "property": { isInvisible: true },
        "type": { isInvisible: true }
      },
      hasText: true,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "Clan": {
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "Stav": {
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
      }
    },
    "Naziv": {
      attributes: {
        "property": { isInvisible: true },
        "type": { isInvisible: true }
      },
      validate: function(jsElement) {
        defaultValidate(jsElement);
      },
      hasText: true
    },
    "Mesto": {
      attributes: {
        "property": { isInvisible: true },
        "type": { isInvisible: true }
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