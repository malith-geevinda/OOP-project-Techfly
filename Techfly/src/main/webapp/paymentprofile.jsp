<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<head>
    
    <title>Payment Profile</title>
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
                    
                    <c:forEach var="cusDetails" items="${details}">
                    
                    <!--  set values for the variable pass to the update profile -->
                    
                    <c:set var = "cardnumber" value = "${cusDetails.cardnumber}" />
                    <c:set var ="cardtype" value= "${cusDetails.cardtype}" />
                    <c:set var ="exmonth" value= "${cusDetails.exmonth}" />
                    <c:set var ="exyear" value= "${cusDetails.exyear}" />
                    <c:set var ="cvv" value= "${cusDetails.cvv}" />
                    <c:set var ="email" value= "${cusDetails.email}" />
                    <c:set var ="name" value= "${cusDetails.name}" />
                    <c:set var = "password" value = "${cusDetails.password}"/>
                     
                    
                    
                    
                    <h2 class="font-weight-bold mt-4">${cusDetails.name}</h2>
                    <p>User</p>
                    <i class="far fa-edit fa-2x mb-4"></i>
                </div>
            </div>
            
            <div class="col-sm-8 bg-white rounded-right">
                <h3 class="mt-3 text-center"><u>Payment Profile</u></h3>
                <hr class="bg-primary">

                <div class="row">
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Card Number :</p>
                        <input type="text" value = "${cusDetails.cardnumber}"name="cardnumber" class="text" readonly />
                    
                    </div>
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Card Type :</p>
                        <input type="text" value = "${cusDetails.cardtype}" name="cardtype" class="text" readonly/>
                        
                    </div>
                </div>
                
                   <div class="row">
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Expiry Month :</p>
                        <input type="text" value = "${cusDetails.exmonth}"name="exmonth" class="text" readonly />
                    
                    </div>
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Card Type :</p>
                        <input type="text" value = "${cusDetails.exyear}" name="exyear" class="text" readonly/>
                        
                    </div>
                </div>

                <!-- 2nd -->
                <div class="row">
                
                <div class="col-sm-6">
                        <br>
                        <p class="font-weight-bold">CVV Number :</p>
                        <input type="text" value = "${cusDetails.cvv}" name="cvv" class="text" readonly/>
                        </div>
                    <div class="col-sm-6">
                        <br>
                        <p class="font-weight-bold">Email :</p>
                        <input type="email" value = "${cusDetails.email}" name="email" class="text" readonly/>
                    
                    </div>
                    <div class="col-sm-6">
                        <br>
                        <p class="font-weight-bold">Name :</p>
                        <input type="text" value = "${cusDetails.name}" name="name" class="text" readonly/>
                        
                        
                        <!-- Get password -->
                        <input type="hidden"  name="password" value="${cusDetails.password}">
                        
                        <!-- Get User Id -->
                        <input type="hidden"  name="id" value="${cusDetails.cardnumber}">
                        
                    </div>
                </div>
				</c:forEach>
                <!-- Update profile -->
                
                 <c:url value="updatepayment.jsp" var="userUpdate">
                	
                	<c:param name="cardnumber" value="${cardnumber}"/>
                	<c:param name="cardtype" value="${cardtype}"/>
                	<c:param name="exmonth" value="${exmonth}"/>
                	<c:param name="exyear" value="${exyear}"/>
                	<c:param name="cvv" value ="${cvv}"/>
                	<c:param name="email" value = "${email}" />
                	<c:param name="name" value ="${name}"/>
                	<c:param name="password" value = "${password}" />
                </c:url>
                 
                 <div class="row">
                    <div class="col-sm-6">
                        <br>
                        <a href ="${userUpdate}">
                         <input type="button" name="update" value="Update Profile" class="btn btn-primary btn-sm">
                         </a>
                    </div>
                    <div class="col-sm-6">
                        <br>
                        
                        <c:url value ="deletepayment.jsp" var="userdelete">
                	<c:param name="cardnumber" value="${cardnumber}"/>
                	<c:param name="cardtype" value="${cardtype}"/>
                	<c:param name="exmonth" value="${exmonth}"/>
                	<c:param name="exyear" value="${exyear}"/>
                	<c:param name="cvv" value ="${cvv}"/>
                	<c:param name="email" value = "${email}" />
                	<c:param name="name" value ="${name}"/>
                	<c:param name="password" value = "${password}" />
                        
                        </c:url>
                        
                        <a href = "${userdelete}">
                         <input type="button" name="delete" value = "Delete Profile "class="btn btn-primary btn-sm">
                        </a>
                        
                    </div>
                </div>
                
				
               
                
                

           <!--     <h4 class="mt-3">Projects</h4>
                <hr class="bg-primary">
                <div class="row">
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Email:</p>
                        <h6 class="text-muted">vinnath@gmail.com</h6>
                    </div>
                    <div class="col-sm-6">
                        <p class="font-weight-bold">Most Viewd</p>
                        <h6 class="text-muted">Dinoter Husanic</h6>
                    </div>
                </div>  -->
                
                <hr class="bg-primary">
                <ul class="list-unstyled d-flex justify-content-center mt-4">  


                    <img src="logo.png" width="80px" length="80px">
                    <!-- <li><a href="#"><i class="fab fa-facebook-f px-3 h4 text-info"></i></a></li>
                    <li><a href="#"><i class="fab fa-youtube px-3 h4 text-info"></i></a></li>
                    <li><a href="#"><i class="fab fa-twitter px-3 h4 text-info"></i></a></li> -->
                </ul>

            </div>
        </div>
    </div>
    
</body>
</html>