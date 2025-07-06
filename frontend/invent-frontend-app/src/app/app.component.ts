import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { HttpClient, HttpClientModule, provideHttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SearchBarComponent, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'invent-frontend-app';

  constructor(private http: HttpClient){}

  response: any[] = [];

  userData(query:string){
    console.log('User Input is :', query);

    this.http.get<any[]>(`http://localhost:8080/main/search/${query}`)
    .subscribe({
      next: (res) =>  {
        this.response = res;
        console.log('Response from API:', res);
      },
      error:(err) => {
        console.error("error noticed!!");
      }
    });
  }

  
}
