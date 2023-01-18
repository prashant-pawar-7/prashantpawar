import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CollegeserviceService } from 'src/app/collegeservice.service';
import { Course } from 'src/app/course';
import { Student } from 'src/app/student';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.css']
})
export class UpdateStudentComponent implements OnInit{
  student:Student= {
    sname:'',
    sage:'',
    scontact:'',
    scourse:{
        cid:0,
        cname:'',
        cduration:'',
        cfees:0
    }
};

   id:number=0;
 
  constructor(
    private studentService: CollegeserviceService,
    private router: Router,
    private route: ActivatedRoute
    ) {}
course:Course[]=[];
    ngOnInit(): void {
      this.route.paramMap.subscribe((param) => {
         this.id = Number(param.get('id'));
        this.getById(this.id);
      });
      this.studentService.getAllCourse().subscribe(data=>{
        this.course=data
      });
    }

    getById(id:number) {
      this.studentService.getStudent(id).subscribe((data) => {
        this.student=data;
      });
    }

  update(){
    this.studentService.updateStudent(this.student,this.id).subscribe(() => {
      this.router.navigate(['/students'])
    });
 
  }
}