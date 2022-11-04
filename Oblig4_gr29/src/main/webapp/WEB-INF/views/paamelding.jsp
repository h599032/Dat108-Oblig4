<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<!-- saved from url=(0032)http://localhost:8080/paamelding -->
<html lang="no">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	<%@ include file="simple.css" %>
</style>
<!-- <script src="js/myscript.js" defer></script>  -->
<title>Påmelding</title>
</head>

<body>
	<h2>Påmelding</h2>

	<form:form id="deltagerFormBean"
		action="paamelding" method="post"
		modelAttribute="deltaker">
		<fieldset>

			<label for="fornavn">Fornavn</label>
			<!-- NB! Spring sin (form:input)-tag stÃ¸tter ikke required alene, 
			     men greit med required="noe"! -->
			<form:input id="fornavn" name="fornavn" title="..." pattern=".*"
				placeholder="Fyll inn fornavn" required="required" type="text"
				value="" path="fornavn" />
			<form:errors path="fornavn" ></form:errors>

			<label for="etternavn">Etternavn</label>
			<form:input id="etternavn" name="etternavn" title="..." pattern=".*"
				placeholder="Fyll inn etternavn" required="required" type="text"
				value="" path="etternavn" />
			<form:errors path="etternavn" />


			<label for="mobil">Mobil (8 siffer)</label>
			<form:input id="mobil" name="mobil" title="..." pattern=".*"
				placeholder="Fyll inn telefonnummer" required="required" type="text"
				value="" path="mobil" />
			<form:errors path="mobil" />


			<label for="passord">Passord</label>
			<form:input id="passord" name="passord" title="..." pattern=".*"
				placeholder="Velg et passord" type="password" required="required"
				value="" path="passord" />
			<form:errors path="passord" />

			<label for="passordRepetert">Passord repetert</label>
			<form:input id="passordRepetert" name="passordRepetert" title="..."
				pattern=".*" placeholder="Gjenta passord" type="password"
				required="required" value="" path="passordRepetert" />
			<form:errors path="passordRepetert" />

			<label for="kjonn">Kjønn:</label>
			<form:radiobutton id="kjonn1" name="kjonn" checked="checked"
				value="mann" path="mann" />
			mann
			<form:radiobutton id="kjonn2" name="kjonn" value="kvinne" path="mann" />
			kvinne <br> <br>
			<button type="submit">Meld meg på</button>
		</fieldset>
	</form:form>


</body>
</html>