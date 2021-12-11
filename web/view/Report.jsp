<%-- 
    Document   : Report
    Created on : Dec 11, 2021, 9:25:26 PM
    Author     : Bin Bior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body>
        <div class="header-item">
            <label class="logo">Fine Fruits</label>
        </div>
        <section>
            <h1 class="text-header">Tổng hợp báo cáo doanh thu</h1>
        </section>
        <div class="searching-div">
            <form>
                <label>Số điện thoại của khách hàng :</label> <input type="text" name="cphone">
                <label> Tháng :</label> <input type="text" name="cphone">
                <label> Quý :</label> <input type="text" name="cphone">
                <input type="submit" value="Submit">
            </form>
        </div>
        <div class="table-div">
            <table class="content-table">
                <thead>
                    <tr>
                        <th>Tên khách hàng</th>
                        <th>Sản phẩm</th>
                        <th>Ngày mua</th>
                        <th>Số lượng</th>
                        <th>Đơn vị</th>
                        <th>Đơn giá</th>
                        <th>Thành tiền</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.bds}" var="b">
                    <tr>
                        <td>${b.c.cname}</td>
                        <td>${b.pro.pname}</td>
                        <td>${b.bill.dateCreated}</td>
                        <td>${b.quantity}</td>
                        <td>${b.pro.unit}</td>
                        <td>${b.price}</td>
                        <td>${b.total}</td>
                    </tr>        
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
