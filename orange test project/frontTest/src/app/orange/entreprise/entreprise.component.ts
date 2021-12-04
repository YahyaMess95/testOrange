import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../particulier/services/services.service';
import { EntrepriseService } from './service/entreprise.service';

@Component({
  selector: 'app-entreprise',
  templateUrl: './entreprise.component.html',
  styleUrls: ['./entreprise.component.css']
})
export class EntrepriseComponent implements OnInit {

  constructor(private service: EntrepriseService , private Pservice : ServicesService) { }

  ListCv : any ;
  ListDetail : any = {};
  ListFormation : any ;
  ngOnInit(): void {
    this.fetchCv();
  }


  fetchCv(){

    return this.service.fetchCv().subscribe(res => this.ListCv = res , ex => console.log(ex)) ;
  }


fetchFormationById(id : any){


return this.Pservice.findformation(id).subscribe(res => this.ListFormation = res , ex => console.log(ex))


}


  detailPart(id : any){
    this.fetchFormationById(id ) ;
    return this.Pservice.findParticulier(id).subscribe(res => this.ListDetail =  res , ex => console.log(ex) ) ;
  }
}
