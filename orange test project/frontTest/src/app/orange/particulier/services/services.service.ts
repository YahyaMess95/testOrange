import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Particulier } from '../model/particulier';
const baseUrl = 'http://localhost:4070/particulier/';
const baseUrlCV = 'http://localhost:4070/Cv/';
const baseUrlFormation = 'http://localhost:4070/formation/';
@Injectable({
  providedIn: 'root'
})
export class ServicesService {

  constructor(private http: HttpClient) { }


  loginP(nom : any , prenom : any)
  {
   return this.http.get<any>(baseUrl + 'login/'+nom+'/'+prenom) ;
  }
  create(data: any): Observable<any> {
    return this.http.post(baseUrl+'add', data);
  }
  findParticulier(id : any )
  {return this.http.get<any>(baseUrl + 'findbyid/'+id) ;}

creerCv(data: any): Observable<any> {
  return this.http.post(baseUrlCV+'add', data);
}

creerFormation(data: any): Observable<any> {
  return this.http.post(baseUrlFormation+'add', data);
}



findformation(id : any )
{return this.http.get<any>(baseUrlFormation + 'all/'+id) ;}


}
