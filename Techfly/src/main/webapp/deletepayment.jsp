<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<head>
    
    <title>User Profile</title>
    <!-- Font Awesome -->
<link
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
rel="stylesheet"
/>
<!-- Google Fonts -->
<link
href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
rel="stylesheet"
/>
<!-- MDB -->
<link
href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/5.0.0/mdb.min.css"
rel="stylesheet"
/>

<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.css"
rel="stylesheet"
/>




</head>

<body class="bg-light">
    <br>
    <br>
    <br><br><br>
    <div class="container">
        <div class="row d-flex justify-content-center"></div>
        <div class="row z-depth-3">
            <div class="col-sm-4 bg-info rounded-left">
                <div class="card-block text-center text-white">
                    <i class="fas fa-user-tie fa-7x mt-5"></i>
                    
                <%
            	String cardnumber = request.getParameter("cardnumber");
                String cardtype = request.getParameter("cardtype");
                String exmonth = request.getParameter("exmonth");
                String exyear = request.getParameter("exyear");
                String cvv = request.getParameter("cvv");
                String email = request.getParameter("email");
                String name = request.getParameter("name");
                String password = request.getParameter("password");
               
                %>
                    
                    
                <form action = "DeletePaymentServlet" method="post">
                    
                    <h2 class="font-weight-bold mt-4"><%=cardnumber%></h2>
                    <p>User</p>
                    <i class="far fa-edit fa-2x mb-4"></i>
                </div>
            </div>

        
            
            <div class="col-sm-8 bg-white rounded-right">
                <h3 class="mt-3 text-center"><u>Delete Payment Profile</u></h3>
                <hr class="bg-primary">

                <div class="row">
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Card Number :</p>
                        <input type="text" value = "<%=cardnumber%>"name="cardnumber" class="text" readonly  />
                    
                    </div>
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Card Type:</p>
                        <input type="text" value = "<%=cardtype%>" name="cardtype" class="text" readonly/>
                        
                    </div>
                </div>
                
                                <div class="row">
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Expiry Month :</p>
                        <input type="text" value = "<%=exmonth%>"name="exmonth" class="text" readonly  />
                    
                    </div>
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Expiry Year:</p>
                        <input type="text" value = "<%=exyear%>" name="exyear" class="text" readonly/>
                        
                    </div>
                </div>

                
                <div class="row">

                    <div class="col-sm-6">
                        <br>
                        <p class="font-weight-bold">CVV Number :</p>
                        <input type="text" value = "<%=cvv%>" name="cvv" class="text" readonly/>
                        
                    </div>
                        <div class="col-sm-6">
                        <br>
                        <p class="font-weight-bold">Email :</p>
                        <input type="email" value = "<%=email%>" name="email" class="text" readonly/>
                    
                    </div>
                </div>
                
                
                
                 <div class="row">
                        <div class="col-sm-6">
                        <br>
                        <p class="font-weight-bold">Name :</p>
                        <input type="text" value = "<%=name%>" name="name" class="text" readonly/>
                        
                    </div>
                      <div class="col-sm-6">
                        <br>
                        <p class="font-weight-bold" >Password</p>
                        <input type="password" value = "<%=password%>" name="password" class="text" readonly/>
                        
                         <input type="hidden" value = "<%=cardnumber%>" name="cardnumber" class="text" /> 
                    
                    </div>
                    
                </div>
                
                <div class="row">
                    
                    <div class="col-sm-6">
                        <br>
                         <input type="submit" name="submit" value = "Delete Profile "class="btn btn-primary btn-sm">
                        
                        
                    </div>
                    
                </div>
            
            

                <hr class="bg-primary">
                <ul class="list-unstyled d-flex justify-content-center mt-4">  


                    <img src="logo.png" width="80px" length="80px">
                   
                </ul>

            </div>
				</form>
           
        </div>
    </div>
    
</body>
</html>