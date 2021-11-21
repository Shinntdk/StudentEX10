/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.*;

/**
 *
 * @author natthidak
 */
@WebService(serviceName = "StudentWebService")
public class StudentWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentSoapPU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findStudentById")
    public Student findStudentById(@WebParam(name = "id") int id) {
        return StudentTable.findStudentById(id);
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "insert")
    @Oneway
    public void insert(@WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        Student stu = new Student();
        stu.setName(name);
        stu.setGpa(gpa);
        StudentTable.insertStudent(stu);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "update")
    public boolean update(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        Student stu = StudentTable.findStudentById(id);
        if(stu != null){
            stu.setName(name);
            stu.setGpa(gpa);
            StudentTable.updateStudent(stu);
            return true;
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "delete")
    public boolean delete(@WebParam(name = "id") int id) {
        Student stu = StudentTable.findStudentById(id);
        if(stu != null){
            StudentTable.removeStudent(stu);
            return true;
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findAllStudent")
    public List<Student> findAllStudent() {
        //TODO write your implementation code here:
        return StudentTable.findAllStudent();
    }
    
    

    /**
     * This is a sample web service operation
     */
    
}
