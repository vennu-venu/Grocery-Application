package com.company;

import javafx.stage.StageStyle;

import javax.swing.*;
import java.sql.*;
import java.util.Queue;

public class DataBase extends JFrame {
    public Connection con;
    DataBase() {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##Venu", "113131");
            if(con.isClosed()) {
                JOptionPane.showMessageDialog(null, "Problem with the connection of DB : "+con,"Error | DataBase",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public void insertIntoCustomer(String[] s) {
        try {
            String query = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?,?)";
            PreparedStatement q = con.prepareStatement(query);
            q.setString(1, s[0]);
            q.setString(2, s[1]);
            q.setString(3, s[2]);
            q.setString(4, s[3]);
            q.setString(5, s[4]);
            q.setString(6, s[5]);
            q.setString(7, s[6]);
            q.executeQuery();
            con.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public void insertIntoAdmin(String[] s) {
        try {
            String query =  "INSERT INTO ADMIN VALUES(?,?,?,?,?,?,?)";
            PreparedStatement q = con.prepareStatement(query);
            q.setString(1, s[0]);
            q.setString(2, s[1]);
            q.setString(3, s[2]);
            q.setString(4, s[3]);
            q.setString(5, s[4]);
            q.setString(6, s[5]);
            q.setString(7, s[6]);
            q.executeQuery();
            con.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public int checkCustomer(String[] s) {
        try {
            String query = "SELECT * FROM CUSTOMER WHERE EMAIL = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,s[0]);
            ResultSet r = st.executeQuery();
            if(r.next()) {
                if(s[1].compareTo(r.getString(7))==0) {
                    return 1;
                }
                else {
                    return 2;
                }
            }
            else {
                return 0;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return 0;
    }
    //=============================================================================================//
    public int checkAdmin(String[] s) {
        try {
            String query = "SELECT * FROM CUSTOMER WHERE EMAIL = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,s[0]);
            ResultSet r = st.executeQuery();
            if(r.next()) {
                if(s[1].compareTo(r.getString(7))==0) {
                    return 1;
                }
                else {
                    return 2;
                }
            }
            else {
                return 0;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return 0;
    }
    //=============================================================================================//
    public String[] getCustomerData(String email) {
        String[] userData = new String[10];
        try {
            String query = "SELECT * FROM CUSTOMER WHERE EMAIL = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,email);
            ResultSet r = st.executeQuery();
            if(r.next()) {
                for (int i = 1; i <= 7; i++) {
                    userData[i - 1] = r.getString(i);
                }
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return userData;
    }
    //=============================================================================================//
    public String[] getAdminData(String email) {
        String[] userData = new String[10];
        try {
            String query = "SELECT * FROM ADMIN WHERE EMAIL = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,email);
            ResultSet r = st.executeQuery();
            if(r.next()) {
                for (int i = 1; i <= 7; i++) {
                    userData[i - 1] = r.getString(i);
                }
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return userData;
    }
    //=============================================================================================//
    public int getQuantity(int id) {
        try{
            String query = "SELECT PRODUCTQNT FROM PRODUCTS WHERE PRODUCTID = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,id);
            ResultSet r = st.executeQuery();
            if(r.next()) {
                return r.getInt(1);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return 1;
    }
    //=============================================================================================//
    public int getCost(int id) {
        try{
            String query = "SELECT PRODUCTCOST FROM PRODUCTS WHERE PRODUCTID = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,id);
            ResultSet r = st.executeQuery();
            if(r.next()) {
                return r.getInt(1);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return 1;
    }
    //=============================================================================================//
    public String getProductName(int id) {
        try{
            String query = "SELECT PRODUCTNAME FROM PRODUCTS WHERE PRODUCTID = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,id);
            ResultSet r = st.executeQuery();
            if(r.next()) {
                return r.getString(1);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return "";
    }
    //=============================================================================================//
    public void consumeProduct(int id, int q) {
        try{
            String query = "UPDATE PRODUCTS SET PRODUCTQNT = PRODUCTQNT-? WHERE PRODUCTID = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,q);
            st.setInt(2,id);
            st.executeQuery();
            con.commit();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public void addToCart(String email, int id, int qn, int a) {
        try {
            String query = "SELECT COUNT(*) FROM CART WHERE CUSTOMEREMAIL=? AND PRODUCTID=?";
            PreparedStatement q = con.prepareStatement(query);
            q.setString(1, email);
            q.setInt(2, id);
            ResultSet r = q.executeQuery();
            if (r.next()) {
                if (r.getInt(1) == 1) {
                    String query2 = "UPDATE CART SET PRODUCTQNT=PRODUCTQNT+?, ORDERAMOUNT=ORDERAMOUNT+?, TIME=SYSTIMESTAMP  WHERE CUSTOMEREMAIL=? AND PRODUCTID=?";
                    PreparedStatement q2 = con.prepareStatement(query2);
                    q2.setInt(1, qn);
                    q2.setInt(2, a);
                    q2.setString(3, email);
                    q2.setInt(4, id);
                    q2.executeUpdate();
                    con.commit();
                    return;
                }
            }
            query = "INSERT INTO CART VALUES(?,?,?,?,SYSTIMESTAMP)";
            q = con.prepareStatement(query);
            q.setString(1, email);
            q.setInt(2, id);
            q.setInt(3, qn);
            q.setInt(4, a);
            q.executeQuery();
            con.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public int getNoOfItems(String email) {
        try {
            String query = "SELECT COUNT(*) FROM CART WHERE CUSTOMEREMAIL=?";
            PreparedStatement q = con.prepareStatement(query);
            q.setString(1, email);
            ResultSet r = q.executeQuery();
            if(r.next()) {
                return r.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 1;
    }
    //=============================================================================================//
    public boolean isNotPresent(String email, int id) {
        try {
            String query = "SELECT COUNT(*) FROM CART WHERE CUSTOMEREMAIL=? AND PRODUCTID=?";
            PreparedStatement q = con.prepareStatement(query);
            q.setString(1, email);
            q.setInt(2, id);
            ResultSet r = q.executeQuery();
            if (r.next()) {
                if(r.getInt(1) == 1) {
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
    //=============================================================================================//
    public String[][] getOrdersData(String email) {
        String[][] s = new String[20][10];
        try {
            String query = "SELECT * FROM CART WHERE CUSTOMEREMAIL=? ORDER BY TIME";
            PreparedStatement q = con.prepareStatement(query);
            q.setString(1, email);
            ResultSet r = q.executeQuery();
            int i = 0;
            while(r.next()) {
                s[i][0] = r.getString(1);
                s[i][1] = ""+r.getInt(2);
                s[i][2] = ""+r.getInt(3);
                s[i][3] = ""+r.getInt(4);
                //System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getInt(3)+" "+r.getInt(4));
                i=i+1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }
    //=============================================================================================//
    public void reAddProduct(int id, int q) {
        try{
            String query = "UPDATE PRODUCTS SET PRODUCTQNT = PRODUCTQNT+? WHERE PRODUCTID = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,q);
            st.setInt(2,id);
            st.executeQuery();
            con.commit();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public void removeFromCart(String email, int id) {
        try{
            String query = "DELETE FROM CART WHERE CUSTOMEREMAIL=? AND PRODUCTID=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,email);
            st.setInt(2,id);
            st.executeQuery();
            con.commit();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public void emptyCart(String email) {
        try{
            String query = "DELETE FROM CART WHERE CUSTOMEREMAIL=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,email);
            st.executeQuery();
            con.commit();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//
    public int getTotalAmount(String email) {
        try {
            String query = "SELECT SUM(ORDERAMOUNT) FROM CART WHERE CUSTOMEREMAIL=?";
            PreparedStatement q = con.prepareStatement(query);
            q.setString(1, email);
            ResultSet r = q.executeQuery();
            if(r.next()) {
                return r.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 1;
    }
    //=============================================================================================//
    public void updateProduct(int id, int c, int q) {
        try{
            String query = "UPDATE PRODUCTS SET PRODUCTCOST=?, PRODUCTQNT=? WHERE PRODUCTID=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,c);
            st.setInt(2,q);
            st.setInt(3,id);
            st.executeQuery();
            con.commit();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    //=============================================================================================//

}

/*/----------------------------------------------- Queries --------------------------------------------------//
CREATE TABLE CUSTOMER (
USERNAME VARCHAR2(50) NOT NULL,
NAME VARCHAR2(50) NOT NULL,
EMAIL VARCHAR2(50) PRIMARY KEY,
MOBILE VARCHAR2(12) NOT NULL,
CITY VARCHAR2(50) NOT NULL,
PIN VARCHAR2(10) NOT NULL,
PASSWORD VARCHAR2(50) NOT NULL );

CREATE TABLE ADMIN (
USERNAME VARCHAR2(50) NOT NULL,
NAME VARCHAR2(50) NOT NULL,
EMAIL VARCHAR2(50) PRIMARY KEY,
MOBILE VARCHAR2(12) NOT NULL,
CITY VARCHAR2(50) NOT NULL,
PIN VARCHAR2(10) NOT NULL,
PASSWORD VARCHAR2(50) NOT NULL );

CREATE TABLE PRODUCTS (
PRODUCTID NUMBER(10) PRIMARY KEY,
PRODUCTNAME VARCHAR2(30) NOT NULL,
PRODUCTCOST NUMBER(10) NOT NULL,
PRODUCTQNT NUMBER(10) NOT NULL,
PRODUCTCLASS VARCHAR2(20) NOT NULL);

CREATE TABLE CART (
CUSTOMEREMAIL VARCHAR2(30) NOT NULL,
PRODUCTID NUMBER(10) NOT NULL,
PRODUCTQNT NUMBER(10) NOT NULL,
ORDERAMOUNT NUMBER(10) NOT NULL,
TIME DATE NOT NULL);

INSERT INTO PRODUCTS VALUES(1, 'Rice', 99, 10, 'Staples');
INSERT INTO PRODUCTS VALUES(2, 'Sunflower Oil', 149, 10, 'Staples');
INSERT INTO PRODUCTS VALUES(3, 'Wheat Atta', 99, 10, 'Staples');
INSERT INTO PRODUCTS VALUES(4, 'Sugar', 39, 10, 'Staples');
INSERT INTO PRODUCTS VALUES(5, 'Onion', 27, 10, 'Veg');
INSERT INTO PRODUCTS VALUES(6, 'Apple', 25, 10, 'Veg');
INSERT INTO PRODUCTS VALUES(7, 'Tomato', 19, 10, 'Veg');
INSERT INTO PRODUCTS VALUES(8, 'Potato', 39, 10, 'Veg');
INSERT INTO PRODUCTS VALUES(9, 'Thumbs Up', 90, 10, 'Beverages');
INSERT INTO PRODUCTS VALUES(10, 'Sprite', 88, 10, 'Beverages');
INSERT INTO PRODUCTS VALUES(11, 'Mountain Dew', 35, 10, 'Beverages');
INSERT INTO PRODUCTS VALUES(12, 'Pepsi', 26, 10, 'Beverages');
INSERT INTO PRODUCTS VALUES(13, 'Dairy Milk Silk', 140, 10, 'PackedFood');
INSERT INTO PRODUCTS VALUES(14, 'Kellogg`s Choco', 414, 10, 'PackedFood');
INSERT INTO PRODUCTS VALUES(15, 'Bambino Vermicelli', 77, 10, 'PackedFood');
INSERT INTO PRODUCTS VALUES(16, 'Kissan Mixed Fruit', 155, 10, 'PackedFood');
INSERT INTO PRODUCTS VALUES(17, 'Toned Milk', 64, 10, 'Dairy');
INSERT INTO PRODUCTS VALUES(18, 'Paneer', 76, 10, 'Dairy');
INSERT INTO PRODUCTS VALUES(19, 'Cheese Cubes', 114, 10, 'Dairy');
INSERT INTO PRODUCTS VALUES(20, 'Eggs', 41, 10, 'Dairy');
INSERT INTO PRODUCTS VALUES(21, 'Vim Dish Cleaning Gel', 154, 10, 'Household');
INSERT INTO PRODUCTS VALUES(22, 'LIZOL Surface Cleaner', 274, 10, 'Household');
INSERT INTO PRODUCTS VALUES(23, 'Rin Detergent Bar', 64, 10, 'Household');
INSERT INTO PRODUCTS VALUES(24, 'Surfexcel Easy Wash', 156, 10, 'Household');

 */


//----------------------------------------------------------------------------------------------------------/*/

