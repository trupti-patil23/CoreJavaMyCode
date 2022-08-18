<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<jsp:include page="/header1" />

<section>
	
	<h3>Employee Details</h3>
	
	<c:choose>
		<c:when test="${employeeList==null || employeeList.isEmpty() }">
			<p><strong>No Records To Display</strong>
		</c:when>
		<c:otherwise>
			<table style="border:1px solid #000000;width:80%;margin:auto;">
				<thead>
					<tr>
						<th>Employee ID</th>
						<th>Employee Name</th>
						<th>Employee salary</th>
						<th>Employee Address</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="t" items="${employeeList }">
						<tr>
							<div><td style="text-align:center">${t.empId }</td></div>
							<div><td style="text-align:center">${t.empName }</td></div>
							<div><td style="text-align:center">${t.empSalary }</td></div>
							<div><td style="text-align:center">${t.empAddress }</td></div>
							<div><td>
								<a href="/employee/edit?empId=${t.empId }">EDIT</a> 
								<span> | </span>
								<a href="/employee/delete?empId=${t.empId }">DELETE</a>
							</td></div>												
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
</section>
<jsp:include page="/footer1" />