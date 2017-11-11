import { Component } from '@angular/core';
import { AppService } from './app.service';
import { Team } from './team';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'sample';
  private data: object;
  private id:string;
  private newTeam: Team = new Team();

  constructor(private service: AppService){
  }

  ngOnInit(){

  }

  private getTeam(){
  	this.service.getTeam(this.id).subscribe(
        data => {
       		this.data = data;
        },
        err => {
            console.log(err);
        });
  }

  addNewTeam(){
  	this.service.addTeam(this.newTeam).subscribe(
        data => {
       		this.data = data;
        },
        err => {
            console.log(err);
        });
  }

}
