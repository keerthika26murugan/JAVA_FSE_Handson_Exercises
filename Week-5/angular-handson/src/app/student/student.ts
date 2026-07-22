import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-student',
  imports: [CommonModule],
  templateUrl: './student.html',
  styleUrl: './student.css'
})
export class Student {

  students = [

    {
      id:101,
      name:'Keerthika',
      department:'ECA',
      mark:95
    },

    {
      id:102,
      name:'Rahul',
      department:'CSE',
      mark:88
    },

    {
      id:103,
      name:'Priya',
      department:'EEE',
      mark:91
    },

    {
      id:104,
      name:'Arjun',
      department:'IT',
      mark:85
    }

  ];

}