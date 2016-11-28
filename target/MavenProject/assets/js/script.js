

var tienetosdiv = $("#tienetosdiv");
var tienedolorgargdiv = $("#tienedolorgargdiv");
var tienefiebrediv = $("#tienefiebrediv");
var tieneescalofriodiv = $("#tieneescalofriodiv");

var presentoinfartodiv = $("#presentoinfartodiv");
var esunfumadordiv = $("#esunfumadordiv");
        
var command = $("#command");

eventos();


function eventos(){
	

	$("input:radio[name='tienefiebre']").on('click',function() {
		var value = $("input:radio[name='tienefiebre']:checked").val();
		if (value === "Si") {
			command.val("fiebre");
		}else if (value === "No") {
		command.val("fiebre");
		}
	});
        
        $("input:radio[name='tienetos']").on('click',function() {
		var value = $("input:radio[name='tienetos']:checked").val();
		if (value === "Si") {
			command.val("tos");
		}else if (value === "No") {
		command.val("tos");
		}
	});
          $("input:radio[name='tienedolorgarg']").on('click',function() {
		var value = $("input:radio[name='tienedolorgarg']:checked").val();
		if (value === "Si") {
			command.val("dolorgarganta");
		}else if (value === "No") {
		command.val("dolorgarganta");
		}
	});
               $("input:radio[name='tieneescalofrio']").on('click',function() {
		var value = $("input:radio[name='tieneescalofrio']:checked").val();
		if (value === "Si") {
			command.val("escalofrio");
		}else if (value === "No") {
		command.val("escalofrio");
		}
	});
                 $("input:radio[name='presentoinfarto']").on('click',function() {
		var value = $("input:radio[name='presentoinfarto']:checked").val();
		if (value === "Si") {
			command.val("presentoinfarto");
		}else if (value === "No") {
		command.val("presentoinfarto");
		}
	});
                    $("input:radio[name='esunfumador']").on('click',function() {
		var value = $("input:radio[name='esunfumador']:checked").val();
		if (value === "Si") {
			command.val("esfumador");
		}else if (value === "No") {
		command.val("esfumador");
		}
	});

	
}


