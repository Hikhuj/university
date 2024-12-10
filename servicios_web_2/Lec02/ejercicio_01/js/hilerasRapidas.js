(function() {

	let globalHilera;

	const triggerEjecutar = () => {
		globalHilera = document.getElementById('formHileraRapidaHilera').value;
		let amountOfVowels = ruleAmountVowels(globalHilera);
		document.getElementById('formHileraRapidaCantidadVocales').value = amountOfVowels;
		let amountOfConsonants = ruleAmountConsonants(globalHilera);
		document.getElementById('formHieraRapidaCantidadConsonantes').value = amountOfConsonants;
		document.getElementById('formHileraRapidaAlReves').value = getHileraAlReves(globalHilera);
		getStringDivided(globalHilera);
	}

	const getStringDivided = (stringValue) => {
		let temp;
		let tamanio = stringValue.length;

		if(tamanio%2 == 0){
			document.getElementById('formHileraRapidaPrimer50').value = stringValue.substr(0,tamanio/2);
			document.getElementById('formHileraRapidaSegundo50').value = stringValue.substr(tamanio/2,tamanio);
			alert("Se ha podido dividir la palabra a la mitad");
		}else{
			alert("La palabra no puede ser dividida correctamente (es impar");
			document.getElementById('formHileraRapidaPrimer50').value = stringValue;
			document.getElementById('formHileraRapidaSegundo50').value = stringValue;
		}
	}

	const getHileraAlReves = (value) => {
		return value.split("").reverse();
	}

	const ruleAmountVowels = (value) => {
		return value.match(/[aeiou]/gi).length;
	}

	const ruleAmountConsonants = (value) => {
		return value.match(/[bcdfghjklmnpqrstvwxyz]/gi).length;
	}

	const triggerLimpiar = () => {
		document.getElementById('formHilerasRapidas').reset();
	}

	// Limpiar formulario completo
	window.addEventListener('load', function(){
		triggerLimpiar();
	});

	const initializer = () => {
		globalHilera = document.getElementById('formHileraRapidaHilera').value;
		btnEjecutar = document.getElementById('formHileraRapidaEjecutar');

		btnEjecutar.onclick = triggerEjecutar;
	}

	initializer();

})()