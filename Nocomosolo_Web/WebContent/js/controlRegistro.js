$(document).ready(function() {
	$('#btnRegistrarse').on('click', registerEventSend);
});

function registerEventSend() {
    var reg_nombre  = $('#reg_nombre').val();
    var reg_codigo  = $('#reg_codigo').val();
    var reg_correo  = $('#reg_correo').val();
    var reg_idiomas = $('#reg_idiomas').val();
    var reg_pregado = $('#reg_pregado').val();
    
    if ((reg_nombre.length > 0) && (reg_correo.length > 0) && (reg_codigo.length > 0) && (reg_idiomas.length > 0) && (reg_pregrado.length > 0)){
    	var correo = $("#reg_email").val();
		var reg = new RegExp( /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/);
		if (correo.length == 0) {
			$("#hintEmail").hide();
		} else {
			if (reg.test(correo)) {
				llamarServicio(reg_nombre, reg_codigo, reg_correo,reg_idiomas, reg_pregrado);
				$("#hintEmail").hide();
			} else {
				$("#hintEmail").show();
			}
		}
    }else{
    	alert("Recuerde que debe llenar todos los campos");
    }
}

function llamarServicio(reg_nombre, reg_correo, reg_codigo, reg_idiomas, reg_pregado) {
	var formData = new FormData();    
	formData.append('reg_nombre', reg_nombre);
	formData.append('reg_correo', reg_correo);
	formData.append('reg_codigo', reg_codigo);
	formData.append('reg_idiomas', reg_idiomas);
	formData.append('reg_pregrado', reg_pregrado);
	
    jQuery.ajax({
    	data: formData,
        url: 'http://localhost:8080/Nocomasolo_rest/rest/restservicecrearusuario/crearUsuario',
        type: 'POST',
	    contentType: false,
	    processData: false,
        beforeSend: function() {
            console.log('before send');
        },
        
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('No funcionó');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    }).done(
            function(jsonResponse) {
                verificacion(jsonResponse);
            }
    );
}

function verificacion(jsonResponse) {
    if (jsonResponse.Registration == "true") {
        window.location = "menu_publicar-ver.html";
    } else {
        showMsg();
    }
}
function showMsg() {
    var title = "Ingreso";
    var messaje = "No se pudo agregar completar el registro. Intente nuevamente ";
    var opts = {};
    var contenedor = "#freeow-tr";
    opts.classes = ["smokey"];
    opts.classes.push("error");
    $(contenedor).freeow(title, messaje, opts);
}
function changePage(){


}