package com.example.project.bean;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Alumni_Details implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer course_id;

    @Column
    private String working;

    @Column
    private String worked;

    @Column
    private String designation;

}
