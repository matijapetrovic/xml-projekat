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
    "ZalbaCutanje": {
      displayName: 'ZalbaCutanje',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true }
       }
    },
    
    "organVlasti": {
      displayName: 'OrganVlasti',
      attributes: {}
    }, 
    "naziv": {
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
    "sediste": {
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
    "Broj": {
      asker: Xonomy.askNumber,
      validate: function(jsElement) {
        defaultValidate(jsElement);
        positiveNumberValidate(jsElement);
      }
    },


    "DatumZahteva": {
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

    "Mesto": {
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

    "PodnosilacZalbe": {
      displayName: 'PodnosilacZalbe',
      attributes: {
        "vocab": { isInvisible: true },
        "about": { isInvisible: true },
        "rel": { isInvisible: true },
        "href": { isInvisible: true }
      },
      hasText: true,
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