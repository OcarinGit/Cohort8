/**
 * Practica 1 Gson
 */

var xhr = new XMLHttpRequest();

window.onload =
() =>
{
    var btnSerializa = document.getElementById("btnSerializa");
    btnSerializa.addEventListener("click", serializaCliente);
}

function serializaCliente()
{
    //Obtenemos los valores de los textboxes
    var txtIdCliente = document.getElementById("txtIdCliente").value;
    var txtNombreCliente = document.getElementById("txtNombreCliente").value;
    var txtDomicilioCliente = document.getElementById("txtDomicilioCliente").value;

    //Creamos el objeto formdata
    var formData = new FormData();

    console.log("IdCliente:"+txtIdCliente);
    console.log("Nombre Cliente:"+txtNombreCliente);
    console.log("Domicilio del Cliente:"+txtDomicilioCliente);
    
    //Agregamos los valores de los textboxes
    formData.append("idCliente",txtIdCliente);
    formData.append("nombreCliente",txtNombreCliente);
    formData.append("domicilioCliente",txtDomicilioCliente);

    xhr.open("POST","Practica1GsonServlet", true);

    xhr.onload = funcionCallBack;

    xhr.send(formData);
}

function funcionCallBack()
{
    document.getElementById("resultado").innerHTML = xhr.responseText;
}