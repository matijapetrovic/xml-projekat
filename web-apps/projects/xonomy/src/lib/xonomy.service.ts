import { Injectable } from '@angular/core';

declare const Xonomy: any;

@Injectable({
  providedIn: 'root'
})
export class XonomyService {

  constructor() {
    Xonomy.setMode('laic');
   }

  render(document: string, editor: Element, specification: any): void {
    Xonomy.render(document, editor, specification);
  }

  getCurrentDocument(): string {
    return Xonomy.harvest();
  }

}
