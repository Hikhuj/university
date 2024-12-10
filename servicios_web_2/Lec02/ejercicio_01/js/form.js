"use strict"

const controlCheckbox = function() {

	// const tamanioDelArregloValue = document.getElementById("formTamanioDelArreglo")
	let isTamanioDelArreglo = noneValueChecker(getValueContent("formTamanioDelArreglo"), getTagTextContent("formTamanioDelArreglo"));
    let isLimiteRandom = noneValueChecker(getValueContent("formLimiteRandom"), getTagTextContent("formLimiteRandom"));

    let mensajeAlertaTamanioArreglo = document.getElementById("bannerInfoRequeridaTamanioArreglo");
    let mensajeAlertaLimiteRandom = document.getElementById("bannerInfoRequeridaLimiteRandom");

    if(isTamanioDelArreglo || isTamanioDelArreglo){
    	alert("Se puede continuar");
    	mensajeAlertaLimiteRandom.innerHTML = '';
    }else{
    	alert("Verificar informacion requerida");
		mensajeAlertaLimiteRandom.innerHTML = `
		<div class="alert alert-warning alert-dismissible fade show" role="alert">
		  No se a ingresado informacion.
		  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		    <span aria-hidden="true">&times;</span>
		  </button>
		</div>`;
    }

    const removerNumerosPares = document.getElementById("formRemoverNumerosPares")
    const removerNumerosMenoresA10 = document.getElementById("formRemoverNumerosMenores10")
    const removerNumerosMayoresA50 = document.getElementById("formRemoverNumerosMayores50")

    if(removerNumerosPares.checked){
        console.log('Remover pares');
    }

    if(removerNumerosMenoresA10.checked){
        console.log('Remover Menores a 10');
    }

    if(removerNumerosMayoresA50.checked){
        console.log('Remover Mayores a 50');
    }

}

const crearArreglo = function(arraySize, randomLimit){
	for(var i = 0; i <= array.length; i++){
		
	}
}

const noneValueChecker = (value, field) => {
	let result = true;

	if(value === null || value === ""){
		alert(`${field} esta vacio`);
		console.log(`${field} esta vacio`);
		result = false;
	}

	return result;
}

const getTagTextContent = (x) => {
	let result = document.getElementById(String(x)).name;
	return result;
}

const getValueContent = (x) => {
	let result = document.getElementById(String(x)).value;
	return result;
}

const noneNumericalChecker = (value) => {
	let result = true;

	if(!isNaN(value)){
		alert("Valor no es un numero");
		result = false;
	}

	return result;
}

/*
const noneValueChecker = function(value){
	if(value === null || Number.isInteger(value)){
		alert('Es un numero')
	}
}
*/

const btnLlenarArreglo = document.getElementById("llenarArreglo");

btnLlenarArreglo.addEventListener('click', function(){
	controlCheckbox();
})
