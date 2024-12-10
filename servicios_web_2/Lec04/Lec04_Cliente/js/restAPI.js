(function () {
  var lista = [];
  var btnAceptar = {};
  var btnCancelar = {};
  var persona = {
    codigoPlanta: {},
    nombre: {},
    cantidad: {},
    codigoTipoPlanta: {}
  };

  const getUsers_JSON = async function(){
    // Retornar promesa para que se pueda hacer algo
    lista = await fetch('http://localhost:57914/api/planta')
      .then(response => response.json())
      console.log(lista);
    // Al encerrar entre parentesis a response o data, se da por un hecho que
    // ese sera el nombre defaul de la variable con el resultado de la linea
    // de codigo anteriormente ejecutada. Ejemplo, a response se le da o no
    // una respuesta, como se obtiene, se puede hacer algo con ella.
    // En la siguiente linea le doy un nombre que quiero a la respuesta anterior
    // que en este caso es "data", con lo que puedo hacer es realizar algo con eso o
    // bien en este caso lo que hacemos es imprimir algo en consola, con el fin de ver
    // si los datos estan bien o no.
    /*
    lista = await fetch('https://jsonplaceholder.typicode.com/users')
      .then((response) => response.json())
      .then((data) => console.log(data))
      .catch(function(err) {
        console.log(`Error: ${err}. Posiblemente no encuentra el recurso o se está ejecutando mal las cosas`)
      });
    */
    createTableBody();
  }

  const createTableBody = function(){
    var tbody = document.getElementById('tbPersona');
    // el innerHTML permite cambiar el contenido de un X elemento tag con un id="Y"
    tbody.innerHTML = '';
    tbody.innerHTML += lista.map(fila => {
      return `<tr>
              <td>${fila.cod_planta}</td>
              <td>${fila.nombre_planta}</td>
              <td>${fila.cantidad}</td>
              <td>${fila.cod_tipo_planta}</td>
              <td>
                <button class="btn btn-success">Editar</button>
                <button class="btn btn-danger">Eliminar</button>
              </td>
              </tr>`
    })
  }

  const addUserData = function(){
    // Agregar a lista por medio de .push
    // un objecto de tipo de persona
    lista.push(Object.assign({}, persona));
    // crear un ROW con el objeto agregado
    createTableBody();
    // Mostrar en consola lo que se agrego
    console.log(persona);
    cleanData();
  }

  const cancelPersona = function(){
    cleanData();
  }

  const cleanData = function(){
    codigoPlanta.value = '';
    nombre.value = '';
    cantidad.value = '';
    codigoTipoPlanta.value = '';
  }

  const aceptarPersona = () => {
    persona = {
        codigoPlanta: codigoPlanta.value,
        nombre: nombre.value,
        cantidad: cantidad.value,
        codigoTipoPlanta: codigoTipoPlanta.value,
      };
      //lista.push(Object.assign({},persona))
      lista.push(persona)
      reloadTable();
  }

  const reloadTable = () => {
      var tbody = document.getElementById('tbPersona');
      tbody.innerHTML = '';
      tbody.innerHTML += lista.map(fila => {
      return `<tr>
              <td>${fila.cod_planta}</td>
              <td>${fila.nombre_planta}</td>
              <td>${fila.cantidad}</td>
              <td>${fila.cod_tipo_planta}</td>
              <td>
                <button class="btn btn-success">Editar</button>
                <button class="btn btn-danger">Eliminar</button>
              </td>
              </tr>`
      })
  }

  const cancelarPersona = () => {
    console.log('cancelarPersona')
  }

  const inicializar = function () {
    codigoPlanta = document.querySelector("#codigoPlanta");
    nombre = document.querySelector("#nombre");
    cantidad = document.querySelector("#cantidad");
    codigoTipoPlanta = document.querySelector("#codigoTipoPlanta");
    btnAceptar = document.querySelector("#btnAceptar");
    btnCancelar = document.querySelector("#btnCancelar");
    btnAceptar.onclick = addUserData;
    btnCancelar.onclick = cancelPersona;
    getUsers_JSON();
    codigoPlanta.onchange = changeCurrentValue;
    nombre.onchange = changeCurrentValue;
    cantidad.onchange = changeCurrentValue;
    codigoTipoPlanta.onchange = changeCurrentValue;
    /*bind();*/
  };

  const bind = function(){
      btnAceptar.onclick= aceptarPersona;
      btnCancelar.onclick = cancelarPersona;
  }

  const changeCurrentValue = function(e){
    let control = e.target;
    persona[control.name] = control.value;
  }

  inicializar();

})()

