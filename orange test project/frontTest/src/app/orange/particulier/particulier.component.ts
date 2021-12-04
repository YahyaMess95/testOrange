import { Component, OnInit } from '@angular/core';
import { Formation } from './model/formation';
import { Particulier } from './model/particulier';
import { ServicesService } from './services/services.service';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';


@Component({
  selector: 'app-particulier',
  templateUrl: './particulier.component.html',
  styleUrls: ['./particulier.component.css']
})
export class ParticulierComponent implements OnInit {

  values: string[] = [];

  constructor(private service: ServicesService) { }

  listParticulier : Particulier = {
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

   }   ;


   listformation : any[] = [] ;


  ngOnInit(): void {


this.findby(localStorage.getItem('sessionId'))
this.formationByParticulier(localStorage.getItem('sessionId'))
  }

findby(id:any){

this.service.findParticulier(id).subscribe(res => this.listParticulier =  res  , ex => console.log(ex)) ;

}


addCv()
{
  const data = {
    particulier : { id : localStorage.getItem('sessionId')}

  }

  this.service.creerCv(data).subscribe(res => {
    localStorage.setItem('partulierId', res);} , ex => console.log(ex)) ;

     setTimeout(() => {

      for (let index = 0; index < this.values.length; index++) {


        let data2 = {

           formation : this.values[index] ,
                 cv  : {id : localStorage.getItem('partulierId')}
           }
           this.service.creerFormation(data2).subscribe(res =>   console.log(res) , ex => console.log(ex)) ;
       }

    }, 500);

    setTimeout(() => {

      this.formationByParticulier(localStorage.getItem('sessionId'))
    }, 1000);


}

formationByParticulier(id : any)
{


return this.service.findformation(id).subscribe(res => this.listformation = res , ex => console.log(ex)) ;

}

public openPDF():void {

    let DATA = document.getElementById("htmlData") as HTMLCanvasElement;
    html2canvas(DATA).then(canvas => {

        let fileWidth = 208;
        let fileHeight = canvas.height * fileWidth / canvas.width;

        const FILEURI = canvas.toDataURL('image/png')
        let PDF = new jsPDF('p', 'mm', 'a4');
        let position = 0;
        PDF.addImage(FILEURI, 'PNG', 0, position, fileWidth, fileHeight)

        PDF.save('angular-demo.pdf');
    });
  }



}
