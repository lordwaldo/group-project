/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Katie
 */
public class Employee {
    
    //properties
    private String firstName;
    private String lastName;
    private String email;
    private String dept;
    private String empID;
    private String empPass;
    
    //public shipmentList list1 = new shipmentList();
    
    //constructors
    
    public Employee(){
        firstName = "";
        lastName = "";
        email = "";
        dept = "";
        empID = "";
        empPass = "";
        
    }
    public Employee(String fName, String lName, String em, String department, String id, String pass){
        firstName = fName;
        lastName = lName;
        email = em;
        dept = department;
        empID = id;
        empPass = pass;
    }
    
    //set & get
    public void setFName(String fName){
        firstName = fName;
    }
    
    public String getFName(){
        return firstName;
    }
    public void setLName(String lName){
        lastName = lName;
    }
    public String getLName(){
        return lastName;
    }
    public void setEmail(String em){
        email = em;
    }
    public String getEmail(){
        return email;
    }
    public void setDept(String department){
        dept = department;
    }
    public String getDept(){
        return dept;
    }
    public void setEmpID(String id){
        empID = id;
    }
    public String getEmpID(){
        return empID;
    }
    public void setEmpPass(String pass){
        empPass = pass;
    }
    public String getEmpPass(){
        return empPass;
    }
    
    public void selectDB(String id){
        empID = id;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * from Employee WHERE empID = '" + getEmpID() + "'");
            
            rs.next();
            setFName(rs.getString(1));
            setLName(rs.getString(2));
            setEmail(rs.getString(3));
            setDept(rs.getString(4));
            setEmpID(rs.getString(5));
            setEmpPass(rs.getString(6));
            
            con1.close();
        }catch(Exception e){
            
            e.printStackTrace();
            System.out.println("Error with Employee Select Database...");
        }
        
        //getShipments();
        
    }
    
    public void display(){
        System.out.println("Employee First Name: " + getFName());
        System.out.println("Employee Last Name: " + getLName());
        System.out.println("Employee Email: " + getEmail());
        System.out.println("Employee Department: " + getDept());
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Pass: " + getEmpPass());
    }
    
        
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.selectDB("e2323");
        e1.display();
        
    }
}

