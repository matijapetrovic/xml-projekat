import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';
import { CardModule } from 'primeng/card';

=======
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
>>>>>>> 10b45a2a3d9f614ab1f2bad27547ab55383e1f74

import { CoreModule } from './core/core.module';
import { ToastModule } from 'primeng/toast';
import { MessageService } from 'primeng/api';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
<<<<<<< HEAD
    CardModule,
    CoreModule,
    ToastModule
  ],
  exports: [
    CardModule,
=======
    CoreModule,
    ToastModule,
    BrowserAnimationsModule
>>>>>>> 10b45a2a3d9f614ab1f2bad27547ab55383e1f74
  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
