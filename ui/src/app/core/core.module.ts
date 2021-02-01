import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MessageService } from './services/message.service';
import { HttpErrorHandler } from './services/http-error-handler.service';

import { SharedModule } from '../shared/shared.module';


@NgModule({
  declarations: [],
  imports: [
    RouterModule,
    CommonModule,
    SharedModule
  ],
  providers: [
    HttpErrorHandler,
    MessageService,
  ],
  exports: [],
})

export class CoreModule { }