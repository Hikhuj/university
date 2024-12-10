function convertirXMLEnObjecto(xml){
    var objeto= {};
    let esRaiz= false;

    //Objeto raiz
    if(xml.nodeType===1){//objecto
        //Recuperar los atributos del objetos
        if(xml.attributes.length>0){
            for(var j=0; j<xml.attributes.length;j++){
                var atributo = xml.attributes.item(j);
                objeto[atributo.nodeName]=atributo.nodeValue;
            }
        }
    }else if(xml.nodeType===3){
        objeto= xml.nodeValue;
    }else if(xml.nodeType===9){
        esRaiz=true;
    }

    //Atributos del objeto(s) hijo(s)
    if(xml.hasChildNodes()){
        for(var i=0; i<xml.childNodes.length;i++){
            var item= xml.childNodes.item(i);
            var nombreNodo = item.nodeName;
            if(typeof(objeto[nombreNodo])==='undefined'){
                if(nombreNodo==='#cdata-section'){
                    objeto = item.nodeValue;
                }else if(nombreNodo==='#text'){
                    if(item.childNodes.length<1){
                        objeto= item.nodeValue;
                    }else{
                        objeto[nombreNodo] = convertirXMLEnObjecto(item);
                    }
                }else{
                    if(esRaiz){
                        objeto= convertirXMLEnObjecto(item);
                    }else{
                        objeto[nombreNodo]= convertirXMLEnObjecto(item);
                    }
                }
            }else{
                if(typeof(objeto[nombreNodo].push)==='undefined'){
                    var valorAtributo= objeto[nombreNodo];
                    objeto[nombreNodo]= new Array();
                    objeto[nombreNodo].push(valorAtributo);
                }

                objeto[nombreNodo].push(convertirXMLEnObjecto(item));
            }

        }
    }
    return objeto;
}