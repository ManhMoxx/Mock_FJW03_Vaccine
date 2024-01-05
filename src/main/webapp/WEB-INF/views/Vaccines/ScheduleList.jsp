<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  <link rel="stylesheet" href="/css/ScheduleList.css" />-->
<!--  <link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">-->
</head>
<body>
	<div class="header">
        <div class="show">
            <p>Show</p> 
            <button class="down"></button>
            <p><i class="fas fa-chevron-down"></i></p>
            <p>entries</p>
        </div>
        <div class="search-container">
            <label for="search">Search :</label>
            <input type="search" name="Search">
        </div>
    </div>
    <table>
        <thead>
            <tr>
                <th>Vaccine</th>
                <th>Time</th>
                <th>Place</th>
                <th>Status</th>
                <th>Note</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
        </tbody>
    </table>

    <footer>
        <div class="first-footer">
            <div>
                <p>Showing 1 to 5 of 11 entries</p>
            </div>
            <div>
                <ul class="pagination pagination-sm">
                    <li class="page-item"><a class="page-link" href="#"><i class="fa fa-angle-double-left"></i></a></li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item"><a class="page-link" href="#"><i class="fa fa-angle-double-right"></i></a></li>
                  </ul>
            </div>        
        </div>
        <div>
            <button type="button" id="btn-create">New Injection Schedule</button>
            <button class="btn-warning" type="button" id="btn-update">Update Injection Schedule</button>
        </div>
    </footer>
</body>
</html>