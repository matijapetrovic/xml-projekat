import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { CommonModule } from '@angular/common';


import { ButtonModule } from 'primeng/button';
import { CarouselModule } from 'primeng/carousel';
import { ConfirmPopupModule } from 'primeng/confirmpopup';
import { ConfirmationService } from 'primeng/api';
import { ScrollPanelModule } from 'primeng/scrollpanel';
import { CardModule } from 'primeng/card';
import { GMapModule } from 'primeng/gmap';
import { RatingModule } from 'primeng/rating';
import { DropdownModule } from 'primeng/dropdown';
import { TableModule } from 'primeng/table';
import { DynamicDialogModule } from 'primeng/dynamicdialog';
import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { InputTextModule } from 'primeng/inputtext';
import { DataViewModule } from 'primeng/dataview';
import { AccordionModule } from 'primeng/accordion';
import {DialogModule} from 'primeng/dialog';

@NgModule({
    declarations: [],
    imports: [
        CommonModule,
        FormsModule,
        ReactiveFormsModule,
        ButtonModule,
        CarouselModule,
        ConfirmPopupModule,
        ScrollPanelModule,
        CardModule,
        GMapModule,
        RatingModule,
        DropdownModule,
        TableModule,
        DynamicDialogModule,
        ConfirmDialogModule,
        InputTextModule,
        DataViewModule,
        AccordionModule,

    ],
    exports: [
        FormsModule,
        ReactiveFormsModule,
        ButtonModule,
        CarouselModule,
        ConfirmPopupModule,
        ScrollPanelModule,
        CardModule,
        GMapModule,
        RatingModule,
        DropdownModule,
        TableModule,
        DynamicDialogModule,
        ConfirmDialogModule,
        InputTextModule,
        DataViewModule,
        AccordionModule,
        DialogModule
    ],
    providers: [
        ConfirmationService
    ]
})
export class SharedModule { }
