import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EntrepriseComponent } from './orange/entreprise/entreprise.component';
import { RegisterEComponent } from './orange/entreprise/register/register.component';
import { OrangeComponent } from './orange/orange.component';
import { ParticulierComponent } from './orange/particulier/particulier.component';
import { RegisterComponent } from './orange/particulier/register/register.component';

const routes: Routes = [{path: '' , component: OrangeComponent},
                        {path: 'entreprise' , component: EntrepriseComponent},
                        {path: 'particulier' , component: ParticulierComponent},
                        {path: 'Creeentreprise' , component: RegisterEComponent},
                        {path: 'Creerparticulier' , component: RegisterComponent},
                     ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
