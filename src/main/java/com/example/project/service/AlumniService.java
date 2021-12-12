package com.example.project.service;

import com.example.project.DAO.Implementation.AlumniDAOImpl;
import com.example.project.bean.Alumni;

public class AlumniService {
    static AlumniDAOImpl AlumniDAO = new AlumniDAOImpl();

    public int login(Alumni Alumni){
        return AlumniDAO.login(Alumni);
    }

}