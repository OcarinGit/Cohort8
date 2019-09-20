
var xhr = new XMLHttpRequest();
window.onload =
()=>
{
    var btnEnviarDatos = document.getElementById("btnEnviarDatos");
    btnEnviarDatos.addEventListener("click",enviarDatos);
}

function enviarDatos()
{
    var idCliente=document.getElementById("txtIdCliente").value;
    var nombreCliente = document.getElementById("txtNombreCliente").value;
    var fechaNacimientoCliente = document.getElementById("txtFechaNacimientoCliente").value;
    var horaNacimientoCliente = document.getElementById("txtHoraNacimientoCliente").value;
    var tiposSangreCliente = document.getElementById("tiposSangre").value;
    var estadoCivilCliente = document.getElementById("EstadoCivil").value;
    var sexo = document.getElementsByName("SexoCliente");
    
    var sexoCliente;
    if(sexo[0].checked==true)
    {
        sexoCliente = "Hombre";
        //sexoCliente = sexo[0].value;
    }
    else
    {
        sexoCliente = "Mujer";
        //sexoCliente = sexo[1].value;
    }
    
    /* Esta es otra forma de checar si el radio es verdadero o falso pero solo funciona con dos elementos en el radio
    var sexo = document.getElementById("SexoCliente");
    
    var sexoCliente;
    if(sexo.checked==true)
    {
        sexoCliente = "Hombre";
        //sexoCliente = sexo[0].value;
    }
    else
    {
        sexoCliente = "Mujer";
        //sexoCliente = sexo[1].value;
    }
    */
    //Creamos un objeto tipo FormData
    var miFormitu = new FormData();
    miFormitu.append("idCliente",idCliente);
    miFormitu.append("nombreCliente",nombreCliente);
    miFormitu.append("fechaNacimientoCliente",fechaNacimientoCliente);
    miFormitu.append("txtHoraNacimientoCliente",horaNacimientoCliente);
    miFormitu.append("tiposSangre",tiposSangreCliente);
    miFormitu.append("EstadoCivil",estadoCivilCliente);
    miFormitu.append("SexoCliente",sexoCliente);
    console.log("id Cliente:"+idCliente);
    console.log("Nombre del Cliente:"+nombreCliente);
    console.log("Fecha Nacimiento:"+fechaNacimientoCliente);
    console.log("Valor de Sexo:"+sexoCliente);

    xhr.open("POST","Practica1gsonServlet", true);
    xhr.onload = funcionCallBack;
    xhr.send(miFormitu);
}

function funcionCallBack()
{
    document.getElementById("resultado").innerHTML=xhr.responseText;
}