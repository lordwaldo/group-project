package com.example.sportinggoods;
import java.sql.*;
public class shipment {
    private String Date_time;
    private String proID;
    private String CustID;
    private String empID;
    private String orderID;
    private String status;

    public shipment() {
        this.Date_time = "";
        this.proID = "";
        this.CustID = "";
        this.empID = "";
        this.orderID = "";
        this.status = "";
    }

    public shipment(String dt, String pID, String CID, String EID, String OID, String ST) {
        Date_time = dt;
        proID = pID;
        CustID = CID;
        empID = EID;
        orderID = OID;
        status = ST;
    }

    public String getDate_time() {
        return Date_time;
    }

    public void setDate_time(String date_time) {
        Date_time = date_time;
    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String custID) {
        CustID = custID;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void selectDB(String dt) {
        Date_time = dt;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            Connection con;
            con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/domin/OneDrive/Documents/SportsStoreMDB.accdb");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Shipment where Date_time= '" + dt +"'");

            if (rs.next()) {
                this.proID = rs.getString(2);
                this.CustID = rs.getString(3);
                this.empID = rs.getString(4);
                this.orderID = rs.getString(5);
                this.status = rs.getString(6);
            } else {
                System.out.println("customer not found");
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertDB(String dt, String pID, String CID, String EID, String OID, String ST) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            Connection con;
            con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/domin/OneDrive/Documents/SportsStoreMDB.accdb");

            PreparedStatement stmt = con.prepareStatement("INSERT INTO shipment (Date_time,proID,CustID,empID,orderID,Status) values(?,?,?,?,?,?)");

            stmt.setString(1, dt);
            stmt.setString(2, pID);
            stmt.setString(3, CID);
            stmt.setString(4, EID);
            stmt.setString(5, OID);
            stmt.setString(6, ST);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully.");
            } else {
                System.out.println("Failed to insert Record.");
            }

            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteDB() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            Connection con;
            con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/domin/OneDrive/Documents/SportsStoreMDB.accdb");
            PreparedStatement stmt = con.prepareStatement("DELETE FROM shipment WHERE Date_time=? ");
            stmt.setString(1,this.Date_time);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("Failed to deleted Record.");
            }

            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void display(){
        System.out.println("date and time: "+ Date_time);
        System.out.println("product ID: "+ proID);
        System.out.println("customer ID: "+ CustID);
        System.out.println("employee ID: "+ empID);
        System.out.println("order ID: "+ orderID);
        System.out.println("Shipment Status: "+ status);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            shipment s1 = new shipment();
            s1.selectDB("10/14-9:00");
            s1.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
