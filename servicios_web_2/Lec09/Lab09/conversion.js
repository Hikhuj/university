(function(){
    let x2js = new X2JS();
    let txtJA = {};
    let txtXMLA = {};
    let btnXML = {};
    let btnJSON = {};
    const inicializar=()=>{
       txtJA = $('#jsonArea');
       txtXMLA = $('#xmlArea') ;
       btnXML = $('#btnConvertirToJSON');
       btnJSON = $('#btnConvertirToXML');
       bind();
    }
    const bind=()=>{
        btnJSON.on('click',convertirJsonXML);
    btnJSON.on('click',convertirJsonXML);
    }

    function convertirXMl2Json(){
        if(txtJA.val().lenght==0){
         alert('El campo de json debe tener un valor')
         return 0;
        }
        txtJA.val(JSON.stringify(x2js.xml_str2json(txtXMLA.val())));
    }

    function convertirJson2XML(){
        if(txtXMLA.val().lenght==0){
         alert('El campo de xml debe tener un valor')
         return 0;
        }
        
txtXMLA.val(x2js.json2xml_str($.parseJSON(txtJA.val())));
}
inicializar();

})()