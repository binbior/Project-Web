/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;
import model.BillDetail;
import model.Customer;
import model.Product;

/**
 *
 * @author Bin Bior
 */
public class BillDetailDBContext extends DBContext {

    public ArrayList<BillDetail> getAll() {
        ArrayList<BillDetail> billdetails = new ArrayList<>();
        try {
            String sql = "SELECT c.cname, p.pname, b.dateCreate, bd.quantity, p.unit, bd.price, bd.total FROM BillDetail bd "
                    + "INNER JOIN Bill b ON bd.bid = b.bid "
                    + "JOIN Customer c ON c.cid = b.cid "
                    + "JOIN Product p ON p.pid = bd.pid ";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Customer c = new Customer();
                c.setCname(rs.getString("cname"));
                Product p = new Product();
                p.setPname(rs.getString("pname"));
                p.setUnit(rs.getString("unit"));
                Bill b = new Bill();
                b.setDateCreated(rs.getDate("dateCreate"));
                BillDetail bd = new BillDetail();
                bd.setQuantity(rs.getInt("quantity"));
                bd.setPrice(rs.getDouble("price"));
                bd.setTotal(rs.getDouble("total"));
                bd.setC(c);
                bd.setBill(b);
                bd.setPro(p);
                billdetails.add(bd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDetailDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return billdetails;
    }
}
