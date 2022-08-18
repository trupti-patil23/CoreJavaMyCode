<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="/header" />
<section
	style="border: 1px solid black; padding: 10px; margin: auto; width: 40%">

	<h3>Employee</h3>

	<form:form method="POST" modelAttribute="emp">

		<table>
		
		<tr>
			<div>
			<td><form:label path="empId">Employee Id: </form:label></td>
			<td><form:input path="empId" readonly="true" /></td>
			</div>
		</tr>
		
		<tr>
			<div>
				<td><form:label path="empName">Employee Name: </form:label></td>
				<td><form:input path="empName" /></td>
				<form:errors path="empName"></form:errors>
			</div>
		</tr>
		
		<tr>
			<div>
				<td><form:label path="empSalary">Employee Salary: </form:label></td>
				<td><form:input path="empSalary" type="number" /></td>
				<form:errors path="empSalary"></form:errors>
			</div>
		</tr>
		
		<tr>
			<div>
				<td><form:label path="empAddress">Employee Address:</form:label></td>
				<td><form:input path="empAddress" /><td>
				<form:errors path="empAddress"></form:errors>
			</div>
		</tr>
		
		<tr> </tr>
		<tr> </tr>
		
		<tr>
			<div style="text-align: right">
				<td></td>
				<td><center><button>SAVE</button></center></td>
			</div>
		</tr>
	
	</table>
	</form:form>
</section>
<jsp:include page="/footer" />