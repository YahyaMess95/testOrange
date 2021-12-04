import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrangeComponent } from './orange/orange.component';
import { ParticulierComponent } from './orange/particulier/particulier.component';
import { EntrepriseComponent } from './orange/entreprise/entreprise.component';
import { CvComponent } from './orange/cv/cv.component';
import { RegisterComponent } from './orange/particulier/register/register.component';
import { RegisterEComponent } from './orange/entreprise/register/register.component';
import {InputTextModule} from 'primeng/inputtext';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import {ToastModule} from 'primeng/toast';
import { MessageService } from 'primeng/api';
import {AccordionModule} from 'primeng/accordion';
import {MessagesModule} from 'primeng/messages';
import {MessageModule} from 'primeng/message';
import {CardModule} from 'primeng/card';
import { PanelModule } from "primeng/panel";
import { RippleModule } from "primeng/ripple";
import {ChipsModule} from 'primeng/chips';
import {ButtonModule} from 'primeng/button';

@NgModule({
  declarations: [
    AppComponent,
    OrangeComponent,
    ParticulierComponent,
    EntrepriseComponent,
    CvComponent,
    RegisterComponent,
    RegisterEComponent,


  ],
  imports: [
    BrowserModule,

    AppRoutingModule,
    InputTextModule,
    HttpClientModule,
    FormsModule,
    ToastModule,
    MessagesModule,
    MessageModule,
    AccordionModule,
    CardModule,
    PanelModule,
    RippleModule,
    ChipsModule,
    ButtonModule,


  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
