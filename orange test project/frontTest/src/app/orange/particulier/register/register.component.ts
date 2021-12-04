import { Component, OnInit } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Particulier } from '../model/particulier';
import { ServicesService } from '../services/services.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  message : any ;

 particulier : Particulier = {
  id : 0,
  adress :  '' ,
  dateNaissance : '' ,
  email : '' ,
  niveauEtude : '' ,
  nom : '' ,
  numeroTelephone : 0 ,
  pays : '' ,
  prenom : '' ,
  profil : '' ,
  ville : '' ,

 }

  constructor(private service: ServicesService ) { }
  ngOnInit(): void {}

save() : void {

const data = {
  adress :  this.particulier.adress,
  dateNaissance : this.particulier.dateNaissance ,
  email : this.particulier.email ,
  niveauEtude : this.particulier.niveauEtude ,
  nom : this.particulier.nom ,
  numeroTelephone : this.particulier.numeroTelephone ,
  pays : this.particulier.pays ,
  prenom : this.particulier.prenom ,
  profil : this.particulier.profil ,
  ville : this.particulier.ville
}

this.service.create(data).subscribe(res => {this.message = res.detail} 
, ex => console.log(ex));


}

}
