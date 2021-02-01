export function getElements(Xonomy: any)  {
  return {
    "zlb:ZalbaCutanje ": {
      validate: function (jsElement: any) {
        if (!jsElement.hasElements()) {
          Xonomy.warnings.push({
            htmlID: jsElement.htmlID,
            text: "This element must not be empty."
          }
          );
        }
      },
      menu: [],
      attributes: {
      }
    },
    "zlb:primalac": {
      validate: function (jsElement: any) {
        if (!jsElement.hasElements()) {
          Xonomy.warnings.push({
            htmlID: jsElement.htmlID,
            text: "This element must not be empty."
          }
          );
        }
      },
      menu: [],
      mustBeBefore: ["zlb:Adresa"],
      isReadOnly: true,
    },
  }
}  