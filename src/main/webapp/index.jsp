<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Fallas en el Monitor</title>

	<link rel="stylesheet" type="text/css" href="assets/css/styles.css">
	
</head>
<body>
	<div class="container">
			
		<h1>Inteligencia Artificial</h1>
                
                <h2>Diagnóstico de Enfermedades</h2>

		<div class="col-xs-offset-4 col-xs-6">

                    <center>
			<form action="DiagnosticoServlet">
				<input type="hidden" name="command" id="command" value="">

				<div class="form-group" id="tienefiebrediv">
					<label for="tienefiebre">¿Tiene fiebre?</label>
					<br>
                                        <select name="tienefiebre" >
                                             <option value="Si" >Si</option>
                                             <option value="No">No</option>  
                                        </select>                                           
				</div>
                                
                                <div class="form-group" id="tienetosdiv">
					<label for="tienetos">¿Tiene tos?</label>
					<br>
                                        <select name="tienetos" >
                                             <option value="Si" >Si</option>
                                             <option value="No">No</option>  
                                        </select>                                           
				</div>
                                
                                   <div class="form-group" id="tienedolorgargdiv">
					<label for="tienedolorgarg">¿Tiene dolor de garganta?</label>
					<br>
                                        <select name="tienedolorgarg" >
                                             <option value="Si" >Si</option>
                                             <option value="No">No</option>  
                                        </select>                                           
				</div>
				   <div class="form-group" id="tieneescalofriodiv">
					<label for="tieneescalofrio">¿Tiene escalofrios?</label>
					<br>
                                        <select name="tieneescalofrio" >
                                             <option value="Si" >Si</option>
                                             <option value="No">No</option>  
                                        </select>                                           
				</div>
                                
                                  <div class="form-group" id="presentoinfartodiv">
					<label for="presentoinfarto">¿Ha presentado un infarto?</label>
					<br>
                                        <select name="presentoinfarto" >
                                             <option value="Si" >Si</option>
                                             <option value="No">No</option>  
                                        </select>                                           
				</div>
				       <div class="form-group" id="esunfumadordiv">
					<label for="esunfumador">¿Se considera fumador?</label>
					<br>
                                        <select name="esunfumador" >
                                             <option value="Si" >Si</option>
                                             <option value="No">No</option>  
                                        </select>                                           
				</div>
				
				<div class="form-group center-block">
					<button class="btn btn-primary">Obtener Diagnóstico</button>
				</div>
                        </form></center>
			
			<%
				String problema = (String)request.getAttribute("problema");
				if(problema == null){
					problema="";
				}
			%>

			<p><%= problema%></p>
		</div>
	</div>

	
	<script type="text/javascript" src="assets/js/script.js"></script>

</body>
</html>