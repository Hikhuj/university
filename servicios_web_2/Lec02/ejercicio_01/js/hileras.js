(function() {
	let hilera1;
	let hilera2;

	const actionLongString = (hilera1, hilera2) =>{
		if(hilera1.length == hilera2.length){
			document.getElementById('formHilerasHileraMasLarga').value = "Misma cantidad de caracteres.";
		}else{
			if(hilera1.length > hilera2.length){
				document.getElementById('formHilerasHileraMasLarga').value = "Hilera 1: " + hilera1;
			}else{
				document.getElementById('formHilerasHileraMasLarga').value = "Hilera 2: " + hilera2;
			}
		}
	}

	const actionBiggestVowel = (hilera1, hilera2) => {
		vocalesHilera1 = ruleAmountVowels(hilera1);
		vocalesHilera2 = ruleAmountVowels(hilera2);

		if(vocalesHilera1 == vocalesHilera2){
			document.getElementById('formHilerasHileraConMasVocales').value = "Misma cantidad.";
		}else{
			if(vocalesHilera1 > vocalesHilera2){
				document.getElementById('formHilerasHileraConMasVocales').value = "Hilera 1 con: " + vocalesHilera1 + ", Hilera: " + hilera1;
			}else{
				document.getElementById('formHilerasHileraConMasVocales').value = "Hilera 2 con: " + vocalesHilera2 + ", Hilera: " + hilera2;
			}
		}
	}

	const actionBiggestConsonants = (hilera1, hilera2) => {
		vocalesHilera1 = ruleAmountConsonants(hilera1);
		vocalesHilera2 = ruleAmountConsonants(hilera2);

		if(vocalesHilera1 == vocalesHilera2){
			document.getElementById('formHilerasHileraConMasConsonantes').value = "Misma cantidad.";
		}else{
			if(vocalesHilera1 > vocalesHilera2){
				document.getElementById('formHilerasHileraConMasConsonantes').value = "Hilera 1 con: " + vocalesHilera1 + ", Hilera: " + hilera1;
			}else{
				document.getElementById('formHilerasHileraConMasConsonantes').value = "Hilera 2 con: " + vocalesHilera2 + ", Hilera: " + hilera2;
			}
		}

	}

	const actionSpecialCharacters = (hilera1, hilera2) => {
		specialHilera1 = ruleAmountSpecialCharacters(hilera1);
		specialHilera2 = ruleAmountSpecialCharacters(hilera2);

		if(specialHilera1 == specialHilera2){
			document.getElementById('formHilerasHileraConMasCaracteresNoAlfanumericos').value = "Misma cantidad.";
		}else{
			if(specialHilera1 > specialHilera2){
				document.getElementById('formHilerasHileraConMasCaracteresNoAlfanumericos').value = "Hilera 1 con: " + specialHilera1 + ", Hilera: " + hilera1;
			}else{
				document.getElementById('formHilerasHileraConMasCaracteresNoAlfanumericos').value = "Hilera 2 con: " + specialHilera2 + ", Hilera: " + hilera2;
			}
		}

	}

	const ruleAmountVowels = (hilera) => {
		return hilera.match(/[aeiou]/gi).length;
	}

	const ruleAmountConsonants = (hilera) => {
		return hilera.match(/[bcdfghjklmnpqrstvwxyz]/gi).length;
	}

	const ruleAmountSpecialCharacters = (hilera) => {
		return hilera.match(/[@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/gi).length;
	}

	const checkerEmptyStrings = (hilera1, hilera2) => {
		if(hilera1.length == 0 || hilera2.length == 0){
			alert("Debe llenar ambos campos con hileras de caracteres");
		}else{
			actionLongString(hilera1,hilera2);
			actionBiggestVowel(hilera1,hilera2);
			actionBiggestConsonants(hilera1, hilera2);
			actionSpecialCharacters(hilera1, hilera2);
		}
	}

	const triggerVer = () => {
		hilera1 = document.getElementById('hileraUno').value;
		hilera2 = document.getElementById('hileraDos').value;
		checkerEmptyStrings(hilera1, hilera2);
	}

	const triggerLimpiar = () => {
		document.getElementById('formManejoHileras').reset();
	}

	// Limpiar formulario completo
	window.addEventListener('load', function(){
		triggerLimpiar();
	});

	const initializer = function(){
		btnVer = document.getElementById('btnVerHileras');
		btnLimpiar = document.getElementById('btnLimpiarHileras');

		btnVer.onclick = triggerVer;
		btnLimpiar.onclick = triggerLimpiar;
	}

	initializer();

})()