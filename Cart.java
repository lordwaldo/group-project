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
public class Cart {
    
    //properties
    private String custID;
    private String proName;
    private String orderID;
    private double price;
    
    public Business.CartList list1 = new Business.CartList();
    
    //constructors
    public Cart(){
        custID = "";
        proName = "";
        orderID = "";
        price = 0;
    }
    
    public Cart(String id, String pName, String order, Double pr){
        custID = id;
        proName = pName;
        orderID = order;
        price = pr;
    }
    
    //set & get
    public void setCustID(String id){
        custID = id;
    }
    public String getCustID(){
        return custID;
    }
    public void setProName(String pName){
        proName = pName;
    }
    public String getProName(){
        return proName;
    }
    public void setOrderID(String order){
        orderID = order;
    }
    public String getOrderID(){
        return orderID;
       
    }
    public void setPrice(Double pr){
        price = pr;
    }
    public double getPrice(){
        return price;
    }
    
    //select customer database method
   /* public void selectCustDB(String id){
        custID = id;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1  = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            ResultSet rs = st.executeQuery("select * from cart where custID= '" + getCustID() + "'");
            
            rs.next();
            //CHANGE ONCE DATABSE IS FIXED
            setProName(rs.getString("proID"));
            setOrderID(rs.getString("orderID"));
            setPrice(rs.getDouble("price"));
            
            con1.close();
        }catch(Exception e){
            System.out.println("Error with Cart Customer Select Database...");
        }
    }*/
    
    //slect customer database that I'm not sure I need
    public void selectDB(String id){
        custID = id;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1  = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            ResultSet rs = st.executeQuery("select * from cart where custID= '" + getCustID() + "'");
            
            rs.next();
            //CHANGE ONCE DATABSE IS FIXED
            setProName(rs.getString("proID"));
            setOrderID(rs.getString("orderID"));
            setPrice(rs.getDouble("price"));
            
            con1.close();
        }catch(Exception e){
            System.out.println("Error with Cart Select Database...");
        }
        
    }
    
    //insert database method
    public void insertDB(String id, String pName, String order, Double pr){
        
        setCustID(id);
        setProName(pName);
        setOrderID(order);
        setPrice(pr);
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st  = con1.createStatement();
            
            String sql = "Insert into cart values('" + getCustID() + "'," + "'" + getProName() + "'," +
                    "'" + getOrderID() + "'," + "'" + getPrice() + "')";
                    
            
            System.out.println(sql);
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Insert Successful");
            }else{
                System.out.println("Insert failed");
            }
            con1.close();
        }catch(Exception ex){
            System.out.println("Error with Cart Insert Database...");
        }
    }
    
    //delete database method
    public void deleteDB(String id){
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2.accdb");
            
            Statement st = con1.createStatement();
            
            String sql = "Delete from cart where custID='" + getCustID() + "'";
                    
            
            System.out.println(sql);
            
            int n = st.executeUpdate(sql);
            
            if(n==1){
                System.out.println("Delete Successful");
            }else{
                System.out.println("Delete failed");
            }
            
            con1.close();
        }catch(Exception ex){
            System.out.println("Error with Cart Delete Database...");
        }
    }
    
    public double getTotal(String id){
        custID = id;
        double sum = 0;
        
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            Connection con1 = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Katie/Desktop/Dahlia_Java/SportsStoreMDB_2b.accdb");
            
            Statement st = con1.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT SUM(price) AS total FROM cart WHERE custID = '" + custID);
            
            if(rs.next()){
                sum = rs.getDouble("total");
            }else{
                sum = 0;
            }
            con1.close(); 
            
            return sum;     
            
            
            
            
        }catch(Exception ex){
            System.out.println("Error with get Total Cart...");
            return 0;
            
        }
        
    }
    
    
    
    
    
    //display method
    public void display(){
        System.out.println("Customer ID: " + getCustID());
        System.out.println("Product Name: " + getProName());
        System.out.println("Order ID: " + getOrderID());
        System.out.println("Price: " + getPrice());
    }
    
    public static void main(String args[]){
        Cart c1 = new Cart();
        c1.selectDB("m64");
        System.out.println("Tester getProname():" + c1.getProName());
        c1.display();
    }

    
    
    
    
}
