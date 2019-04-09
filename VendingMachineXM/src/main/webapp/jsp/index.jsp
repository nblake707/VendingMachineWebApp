<%-- 
    Document   : index
    Created on : Nov 8, 2018, 11:57:33 AM
    Author     : Blake
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vending Machine</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">Vending Machine</h1>
                    <hr/>
                </div>
            </div>

            <div class="row">
                <div id="productList" class="col-md-8">
                    <div class="row" id="items">
                        <c:forEach var="currentItem" items="${productList}">
                            <div class="col-md-4">
                                <div class="items">
                                   
                                    <a href ="${pageContext.request.contextPath}/chooseItem/${currentItem.productId}" class="btn">
                                   
                                        ${currentItem.productId}
                                        <br/>
                                        ${currentItem.name}
                                        <br/>
                                        Cost:$${currentItem.cost}
                                        <br/>
                                        Quantity:${currentItem.quantity}
                                    </a>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>

                <!-- menu stuff -->

                <div class="col-md-4" >

                    <div id="moneyScreen">
                        <form>
                            <h3>Total $ in:</h3>
                            <input type="text" class="form-control" id="balance" value="${balance}"/>
                       
                        <br/>
                        <br/>
                        <!--Add Dollar  -->
                        <a href="${pageContext.request.contextPath}/addDollar" class="btn">Add Dollar </a>
                        <!--add Quarter -->
                        <a href="${pageContext.request.contextPath}/addQuarter" class="btn">Add Quarter </a>
                        <br/>
                        <br/>
                        <!-- Add dime -->
                        <a href="${pageContext.request.contextPath}/addDime" class="btn">Add Dime </a>
                        <!--add Nickel -->
                        <a href="${pageContext.request.contextPath}/addNickel" class="btn">Add Nickel </a>
                         </form>
                        <hr/>
                    </div>

                    <hr/>


                    <div id="messages">
                        <h3>Messages</h3>
                        <form>
                            <input type="text" id="messageCenter" value="${message}" class="form-control" ></input>

                            <label for="itemId">Item Id</label>
                            <input type="text" id="itemIdCenter" value="${itemId}" class="form-control"></input>
                        </form>
                        <a class="btn" href="${pageContext.request.contextPath}/makePurchase" value="submit">Purchase</a>
                    </div>
                    <hr/>


                    <div id="change">
                        <h3>Change:</h3>  
                        
                        <p>Quarters: ${change.coinQuarters}, Dimes: ${change.coinDimes}, Nickels: ${change.coinNickels}, Pennies: ${change.coinPennies}</p>

                        <a href="${pageContext.request.contextPath}/changeReturn" class="btn">Change</a>

                    </div>

                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
