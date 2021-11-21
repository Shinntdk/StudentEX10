/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclient;

import services.Student;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author natthidak
 */
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id;
        String name;
        double gpa;
        Boolean loop = true;
        while(loop){
            Scanner sc = new Scanner(System.in);
            System.out.println("----- Student Database -----");
            System.out.println("1. Insert Information");
            System.out.println("2. Update Information");
            System.out.println("3. Delete Information");
            System.out.println("4. View All Information");
            System.out.println("0. Exit");
            System.out.println("----------------------------");
            int i = sc.nextInt();
            switch(i){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    gpa = sc.nextDouble();
                    Insert(name, gpa);
                    System.out.println("Success!");
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    gpa = sc.nextDouble();
                    if (Update(id, name, gpa)) {
                        System.out.println("Success!");
                    } else {
                        System.out.println("Not found Information.");
                    }
                    System.out.println("Success!");
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    if (Delete(id)) {
                        System.out.println("Success!");
                    } else {
                        System.out.println("Not found Information.");
                    }
                    break;
                case 4:
                        printAllStudent(findAllStudent());
                        break;
                case 0:
                    loop = false;
                    break;
            }
        }
    }
    public static void printAllStudent(List<Student> studentList) {
        for (Student stu : studentList) {
            System.out.print(stu.getId() + " ");
            System.out.print(stu.getName() + " ");
            System.out.println(stu.getGpa() + " ");
        }
    }
    private static Student findStudentById(int id) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }
    
    private static List<Student> findAllStudent() {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findAllStudent();
    }
    
    private static void Insert(String name, double gpa) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        port.insert(name, gpa);
    }
    
    private static boolean Update(int id, String name, double gpa) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.update(id, name, gpa);
    }
    
    private static boolean Delete(int id) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.delete(id);
    }
    
    
}
