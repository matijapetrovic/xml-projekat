import { Injectable } from '@angular/core';
import { zalbaCutanjeXSLT  } from '../../core/xstl/zalba-na-cutanje-xslt';
import { getElements } from './../../core/xstl/zalba-cutanje-specification'


declare var Xonomy: any;

const zlb = `xmlns:zlb="http://www.ftn.uns.ac.rs/xml/tim11/zalbacutanje"`;

@Injectable({
  providedIn: 'root'
})
export class ZalbaCutanjeXonomyService {

  private xsltProcessor = new XSLTProcessor();
  private domParser = new DOMParser();
  private xmlSerializer = new XMLSerializer();
  private elements: any;

  constructor() {
    this.elements = getElements(Xonomy);
  }

  ngOnInit(): void {
  }

  public convertToXSLT(xml: string): string {
    this.xsltProcessor.reset();
    this.xsltProcessor.importStylesheet(this.domParser.parseFromString(zalbaCutanjeXSLT , 'text/xml'));
    let result = this.xsltProcessor.transformToDocument(this.domParser.parseFromString(xml, 'text/xml'));
    return this.xmlSerializer.serializeToString(result);
  }

  public validate(jsElement: any) {
      console.log(jsElement.name);
      let elementSpec = this.elements[jsElement.name];
      console.log(elementSpec);
      if (elementSpec.validate) elementSpec.validate(jsElement);

      for (let i = 0; i < jsElement.attributes.length; i++) {
        let jsAttribute = jsElement.attributes[i];
        let attributeSpec = elementSpec.attributes[jsAttribute.name];
        if (attributeSpec.validate) attributeSpec.validate(jsAttribute);
      };

      for (let i = 0; i < jsElement.children.length; i++) {
        let jsChild = jsElement.children[i];
        if (jsChild.type == "element") {
          this.validate(jsChild);
        }
      }
    }

  public getElements() {
    return getElements(Xonomy);
  }
  }
