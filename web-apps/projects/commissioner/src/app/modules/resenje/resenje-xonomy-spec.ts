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

const elements = {
  "Resenje": {
    displayName: 'Resenje',
    attributes: {
      "vocab": { isInvisible: true },
      "about": { isInvisible: true },
      "rel": { isInvisible: true },
      "href": { isInvisible: true }
    }
  },
  "DatumResenja": {
    displayName: 'Datum Resenja',
    asker: Xonomy.askDate,
    validate: function(jsElement) {
      defaultValidate(jsElement);
    }
  },
  "Uvod": {
    displayName: 'Uvod',
    hasText: true,
    asker : Xonomy.askLongString

  },
  "DatumZalbe": {
    displayName: 'Datum Zalbe',
    hasText: true,
  },
  "OrganVlasti": {
    displayName: 'Organ Vlasti',
    attributes:{
      "type": { isInvisible: true},
      "property": {isInvisible: true}
    },
    hasText: true,
  },
  "Sadrzaj":{
    displayName: 'Sadrzaj'
  },
  "Ustanova":{
    displayName: 'Ustanova'
  },
  "Naziv":{
    displayName: 'Naziv',
    attributes:{
      "type": { isInvisible: true},
      "property": {isInvisible: true}
    }
  },
  "Adresa":{
    displayName: 'Adresa'
  },


};

const validate = function(jsElement) {

};

const resenjeSpec = {
  elements,
  validate
};

export default resenjeSpec;
