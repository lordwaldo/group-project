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

/***********
 *CIST 2931 - E-commerce Project
 * Group 1
 * September 2024
 * I promise I wrote this code
 ***************/
public class Employee {
    
    //properties
    
    private String fName;
    private String lName;
    private String email;
    private String dept;
    private String empID;
    private String empPass;
    
//    public OrderList list1 = new OrderList();
    
    //constructors
    public Employee(){
        fName = "";
        lName = "";
        email = "";
        dept = "";
        empID = "";
        empPass = "";
        
    }
    public Employee(String firstN, String lastN, String em, String dt, String id, String pass){
        
        fName = firstN;
        lName = lastN;
        email = em;
        dept = dt;
        empID = id;
        empPass = pass;
    }
    
    //get&set
    public void setFName(String firstN){
        fName = firstN;
    }
    public String getFName(){
        return fName;
    }
    public void setLName(String lastN){
        lName = lastN;
    }
    public String getLName(){
        return lName;
    }
    public void setEmail(String em){
        email = em;
    }
    public String getEmail(){
        return email;
    }
    public void setDept(String dt){
        dept = dt;
    }
    public String getDept(){
        return dept;
    }
    public void setID(String id){
        empID = id;
    }
    public String getID(){
        return empID;
    }
    public void setPass(String pass){
        empPass = pass;
    }
    public String getPass(){
        return empPass;
    }
    
    //select method
    public void selectDB(String id){
        id = empID;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * from Employee WHERE empID = '" + getID() + "'");
            
            rs.next();
            setFName(rs.getString("firstname"));
            setLName(rs.getString("lastname"));
            setEmail(rs.getString("email"));
            setDept(rs.getString("department"));
            setID(rs.getString("empID"));
            setPass(rs.getString("password"));
            
            con1.close();
        }catch(Exception e){
            System.out.println("Error with Employee Select Database...");
        }
    }
    
    public void insertDB(String id, String pass, String firstN, String lastN, String em, String dt){
        setID(id);
        setPass(pass);
        setFName(firstN);
        setLName(lastN);
        setEmail(em);
        setDept(dt);
        
        try{
            Class.forName("ucanaccess.jdb.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "Insert into Employee values('" + getID() + "'," +
                    "'" + getPass() + "'," + "'" + getFName() + "'," + "'" +
                    getLName() + "'," + "'" + getEmail() + "'," + "'" + getDept() + "')";
            
            System.out.println(sql);
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Insert Successful");
                
            }else{
                System.out.println("Insert Failed");
            }
            con1.close();
        }catch(Exception e){
            System.out.println("Error in Employee Insert Database....");
        }  
        
    }
    
    public void deleteDB(String id){
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "Delete from Employee where empID='" + getID() + "'";
            
            System.out.println(sql);
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Delete Successful");
            }else{
                System.out.println("Delete failed");
            }
            con1.close();
        }catch(Exception ex){
            System.out.println("Error in Employee in Delete Database....");
        }
    }
    
    public void updateDB(String id, String pass, String firstN, String lastN, String em, String dt){
        setID(id);
        setPass(pass);
        setFName(firstN);
        setLName(lastN);
        setEmail(em);
        setDept(dt);
        
        
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "UPDATE Employee SET firstname = '" + getFName() + "', lastname = '" + getLName() +
                    "', password = '" + getPass() + "', empID = '" + getID() + "', email = '" + getEmail() + "', department = '" +
                    getDept() + "' WHERE empID = '" + getID() + "'";
            
            System.out.println(sql);
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Update Successful");
            }else{
                System.out.println("Update failed");
            }
            con1.close();
                    
        }catch(Exception e){
            System.out.println("Error with Employee update database...");
        }
    }
    
   /*public void getOrders(){
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDrive");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "Select * from Orders where empID = '" + getID() + "'";
            
            ResultSet rs = st.executeQuery(sql);
            
            String empID;
            Orders o1;
            
            while(rs.next()){
                empID = rs.getString("empID");
                o1 = new Orders();
                o1.selectDB(empID);
                list1.addAcc(o1);
                
            }
  
        }catch(Exception ex){
            System.out.println("Error with database for getOrders Employee...");
        }
    }
    */
    public void display(){
        System.out.println("Employee first name: " + getFName());
        System.out.println("Employee last name: " + getLName());
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee password: " + getPass());
        System.out.println("Employee email: " + getEmail());
        System.out.println("Employee department: " + getDept());
    }
    
    public static void main(String args[]){
        
        //tester
        Employee e1 = new Employee();
        e1.selectDB("e2323");
        e1.display();
    }
}
