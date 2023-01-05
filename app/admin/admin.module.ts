import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { UserComponent } from './user/user.component';
import { PostComponent } from './post/post.component';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    UserComponent,
    PostComponent,
    HomeComponent
  ],
  imports: [
    CommonModule,
    AdminRoutingModule
  ]//,exports:[
  //   UserComponent,
  //   PostComponent,
  //   HomeComponent
  // ]
})
export class AdminModule { }
