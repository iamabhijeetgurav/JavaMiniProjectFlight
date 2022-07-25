<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
tbody {
     text-align: center;
}
</style>
</head>
<body>
     <h2 style="text-align: center">BookMyFlight</h2>
     <div class="container"
          style="background-color: lightblue; border: 1px solid black">
          <br><br>
          <form action="${pageContext.request.contextPath}/AddFlightController"
              method="post">
              <table>
                   <tbody>
                        <tr>
                        <%--id,flightName,arrivalTime,departureTime,source,  destination, flightType, flight_fare--%>
                             <td>Flight Name</td>
                             <td><input type="text" name="flight-name" required placeholder="enter name"></td>
                        </tr>
                        <tr>
                             <td>arrivalTime:</td>
                             <td><input type="time" name="arrivalTime" required placeholder="enter arrivalTime"></td>
                        </tr>
                        <tr>
                             <td>departureTime:</td>
                             <td><input type="time" name="departureTime" required placeholder="enter departureTime"></td>
                        </tr>
                        <tr>
                             <td>source:</td>
                             <td><input type="text" name="source" required placeholder="enter source"></td>
                        </tr>
                        <tr>
                             <td>destination:</td>
                             <td><input type="text" name="destination" required placeholder="enter destination"></td>
                        </tr>
                        <tr>
                             <td>flightType</td>
                             <td><input type="text" name="flightType" required placeholder="enter flightType"></td>
                        </tr>
                        <tr>
                             <td>flightFare</td>
                             <td><input type="number" name="flightFare" required placeholder="enter flightFare"></td>
                        </tr>
                        
                   </tbody>

              </table>
              <br>
              <button type="submit">Add Details</button>
          </form>
          <br> <br>
          <HR>
          <table class="table table-striped table-bordered">
          <tbody>
              <tr class="thead-light">
                   <th>ID</th>
                   <th>FlightName</th>
                   <th>ArrivalTime</th>
                   <th>DepartureTime</th>
                   <th>Source</th>
                   <th>Destination</th>
                   <th>FlightType</th>
                   <th>FlightFare</th>
                   
              </tr>
              <c:forEach items="${sessionScope.flightList}" var="flight">
                   <tr>
                   
                        <td>${flight.id}</td>
                        <td>${flight.flight_name}</td>
                        <td>${flight.arrival_time}</td>
                        <td>${flight.departure_time}</td>
                        <td>${flight.source}</td>
                        <td>${flight.destination}</td>
                        <td>${flight.flight_type}</td>
                        <td>${flight.flight_fare}</td>
                        <%-- 
                        <td><a
                             href="${pageContext.request.contextPath}/EditProductController?action=EDIT&id=${product.id}&name=${product.name}&price=${product.price}">Edit</a>
                             | <a
                            href="${pageContext.request.contextPath}/DeleteProductController?action=DELETE&id=${product.id}">Delete</a>
                        </td>--%>
                        
                   </tr>
              </c:forEach>
          </tbody>
          </table>
     </div>
</body>
</html>
