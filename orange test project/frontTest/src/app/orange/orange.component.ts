import { Component, OnInit } from '@angular/core';
import { EntrepriseService } from './entreprise/service/entreprise.service';
import { ServicesService } from './particulier/services/services.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-orange',
  templateUrl: './orange.component.html',
  styleUrls: ['./orange.component.css']
})
export class OrangeComponent implements OnInit {

  nom : any ;
  prenom : any ;
  utilisation : any ;
  constructor( private Eservice: EntrepriseService , private Pservice: ServicesService , private router : Router)  { }

  ngOnInit(): void {
  }

  createEntreprise(){ this.router.navigate(['Creeentreprise']);}
  createParticulier(){ this.router.navigate(['Creerparticulier']);}
  login()
  {

    if(this.utilisation == 'particulier')
  {

    this.Pservice.loginP(this.nom , this.prenom).subscribe(res => {
      if (res != null) {


        localStorage.setItem('sessionId', res);
        this.router.navigate(['particulier']);
      }
    } , ex => console.log(ex)) ;



  }


  if(this.utilisation == 'entreprise')
  {

    console.log(this.utilisation)
    this.Eservice.loginEnt(this.nom , this.prenom).subscribe(res => {
      if (res !== null) {
  
        localStorage.setItem('sessionId', res);
        this.router.navigate(['entreprise']);
      }
    } , ex => console.log(ex)) ;

  }



  }


}
