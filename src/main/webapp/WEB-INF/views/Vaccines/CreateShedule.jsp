<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	 <div class="mt-4" style="padding: 15px;">
        <form  action="${pageContext.request.contextPath}/createschedule" method="post">
            <div class="row">
                <div class="col-md-4 mb-3">
                    <label for="my-select">Vaccine<span style="color: red;">(*)</span>:</label>
                    <select id="my-select" class="form-control" name="vaccine">
                    	<option value="">~ Select Vaccine</option>
                    	<c:forEach var="v" items="${listVaccine}">	                   
	                        <option value="${v.vaccineId}">${v.vaccineName}</option>
	                    </c:forEach>
                    </select>
                </div>
                <div class="col-md-4 mb-3">
                    <label for="from">From<span style="color: red;">(*)</span>:</label>
                    <input type="date" class="form-control" id="from" name="startDate">
                </div>
                <div class="col-md-4 mb-3">
                    <label for="to">To<span style="color: red;">(*)</span>:</label>
                    <input type="date" class="form-control" id="to" name="endDate" >
                </div>
            </div>

            <div class="row">
                <div class="col-md-4 mb-3">
                    <label for="place">Place<span style="color: red;">(*)</span>:</label>
                    <input type="text" class="form-control" id="place" name="place" value="">
                </div>
                <div class="col-md-8 mb-3">
                    <label for="note">Note:</label>
                    <input type="text" class="form-control" id="note" name="description">
                </div>
                
            </div>

            <div class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-success">Save</button>
                    <button type="reset" class="btn btn-primary">Reset</button>
                    <button type="button" class="btn btn-warning">Cancel</button>
                </div>
            </div>
        </form>
    </div>
</body>
</html>