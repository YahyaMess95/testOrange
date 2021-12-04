import { Component, OnInit } from '@angular/core';
import { Entreprise } from '../classe/entreprise';
import { EntrepriseService } from '../service/entreprise.service';

@Component({
  selector: 'app-register-entreprise',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterEComponent implements OnInit {

  message : any ;
entreprise : Entreprise = {


  id : 0  ,
  adress :  '' ,
  deuxiemeNumeroTelephone :  0 ,
  mail :  '' ,
  nom :  '' ,
  nomEntreprise : '' ,
  numeroTelephone :  0 ,
  pays :  '',
  prenom :  '' ,
  registreCommerce : '' ,
  ville : ''



}

  constructor( private service: EntrepriseService) { }

  ngOnInit(): void {
  }


  save(){

    const data = {

    adress :  this.entreprise.adress ,
    deuxiemeNumeroTelephone :  this.entreprise.deuxiemeNumeroTelephone ,
    mail :  this.entreprise.mail ,
    nom :  this.entreprise.nom ,
    nomEntreprise : this.entreprise.nomEntreprise ,
    numeroTelephone : this.entreprise.numeroTelephone ,
    pays :  this.entreprise.pays,
    prenom :  this.entreprise.prenom,
    registreCommerce : this.entreprise.registreCommerce ,
    ville : this.entreprise.ville

  }

console.log(this.entreprise.registreCommerce) ;
  this.service.create(data).subscribe(res => {this.message = res.detail} , ex => console.log(ex)) ;
  }

}
