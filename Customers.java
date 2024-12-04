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

/********************
 * CIST 2931 - E-commerce Project
 * Group 1
 * September 2024
 * I promise I wrote this code
 **********************/
public class Customers {
    
    //properties
    private String pass;
    private String fName;
    private String lName;
    private String addr;
    private String custID;
    private String email;
    
    public CartList list1 = new CartList();
    
    //constructors
    public Customers(){
        pass = "";
        fName = "";
        lName = "";
        addr = "";
        custID = "";
        email = "";
        
    }
    
    public Customers(String custPass, String firstN, String lastN, String add, String id, String em){
        pass = custPass;
        fName = firstN;
        lName = lastN;
        addr = add;
        custID = id;
        email = em;
    }
    
    //get&set
    public void setPass(String custPass){
        pass = custPass;
    }
    public String getPass(){
        return pass;
    }
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
    public void setAddr(String add){
        addr = add;
    }
    public String getAddr(){
        return addr;
    }
    public void setID(String id){
        custID = id;
    }
    public String getID(){
        return custID;
    }
    public void setEmail(String em){
        email = em;
    }
    public String getEmail(){
        return email;
    }
    
    public void selectDB(String id){
        custID = id;
        
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * from customers WHERE CustID = '" + getID() + "'");
            
            rs.next();
            setPass(rs.getString(1));
            setFName(rs.getString(2));
            setLName(rs.getString(3));
            setAddr(rs.getString(4));
            setID(rs.getString(5));
            setEmail(rs.getString(6));
            
            con1.close();
      
        }catch(Exception e){
            System.out.println("Error with Customer Select Database...");
        }
        
        getCart();
    }
    
    public void insertDB(String custPass, String fName, String lName, String add, String id, String em){
        setPass(custPass);
        setFName(fName);
        setLName(lName);
        setAddr(add);
        setID(id);
        setEmail(em);
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "Insert into customers values('" + getPass() + "'," +
                    "'" + getFName() + "'," + "'" + getLName() + "'," + "'" +
                    getAddr() + "'," + "'" + getID() + "'," + "'" + getEmail() + "')";
            
            System.out.println(sql);
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Insert Successful");
            }else{
                System.out.println("Insert failed");
            }
            con1.close();
        }catch(Exception ex){
            System.out.println("Error in Customers Insert Database...");
        }
    }
    
    public void deleteDB(String id){
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "Delete from Dentists where id='" + getID() + "'";
            
            
            System.out.println(sql);
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Delete Successful");
            }else{
                System.out.println("Delete failed");
            }
            con1.close();
            
        }catch(Exception e){
            System.out.println("Error in Customers delete database...");
        }
    }
    
    public void updateDB(String pass, String fName, String lName, String add, String id, String em){
        setPass(pass);
        setFName(fName);
        setLName(lName);
        setAddr(add);
        setID(id);
        setEmail(em);
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "UPDATE customers SET Password = '" + getPass() + "', FirstName = '" + getFName() + "', Lastname = '"
                    + getLName() + "', addr = '" + getAddr() + "', CustID = '" + getID() + "', email = '" + getEmail() + "' "
                    + "WHERE CustID = '" + getID() + "'";
            
            
            System.out.println(sql);
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Update Successful");
            }else{
                System.out.println("Update Failed");
            }
            
            con1.close();
                    
        }catch(Exception ex){
            System.out.println("Error with Customer update database...");
        }
        
        
    }
    
    public void getCart(){
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "Select * from cart where custID = '" + getID() + "'";
            
            ResultSet rs = st.executeQuery(sql);
            
            
            String custID;
            Cart c1;
            
            while(rs.next()) {
                custID = rs.getString("CustID");
                c1 = new Cart();
                c1.setCustID(rs.getString("custID"));
                c1.setProName(rs.getString("orderID"));
                c1.setPrice(rs.getDouble("Price"));
                list1.addCart(c1);
            }
            con1.close();
           
        }catch(Exception e){
            System.out.println("Error with database for getCart Customers...");
        }
    }
    
    public void display(){
        
        System.out.println("Customer Password: " + getPass());
        System.out.println("Customer First Name: " + getFName());
        System.out.println("Customer Last Name: " + getLName());
        System.out.println("Customer Address: " + getAddr());
        System.out.println("Customer ID: " + getID());
        System.out.println("Customer Email: " + getEmail());
    }
    
    public static void main(String args[]){
        Customers c1 = new Customers();
        c1.selectDB("m64");
        c1.display();
    }
    
}   
 
