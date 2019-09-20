
var xhr = new XMLHttpRequest();

window.onload =
()=>
{
    var btnDeserializa = document.getElementById("btnDeserializa");
    btnDeserializa.addEventListener("click",funcionDeserializa);
}

function funcionDeserializa()
{
    var txtCadenaJson = document.getElementById("txtCadenaJson").value;

    var miFormita = new FormData();
    miFormita.append("txtCadenaJson", txtCadenaJson);

    xhr.open("POST", "Practica3gsonServlet",true);
    xhr.onload = funcionCallBack;
    xhr.send(miFormita);
}

function funcionCallBack()
{
    document.getElementById("resultado").innerHTML=xhr.responseText;
}