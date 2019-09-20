var xhr = new XMLHttpRequest();

window.onload =
()=>
{
    var btnSerializa = document.getElementById("btnSerializa");
    btnSerializa.addEventListener("click",funcionSerializar);
}

function funcionSerializar()
{
    console.log("Estoy en serializar");
    var txtIdProducto = document.getElementById("txtIdProducto").value;
    var txtNombreProducto = document.getElementById("txtNombreProducto").value;
    var txtPrecioProducto = document.getElementById("txtPrecioProducto").value;

    var miFormita = new FormData();
    miFormita.append("txtIdProducto",txtIdProducto);
    miFormita.append("txtNombreProducto", txtNombreProducto);
    miFormita.append("txtPrecioProducto",txtPrecioProducto);

    xhr.open("POST", "Practica2gsonServlet", true);

    xhr.onload = funcionCallBack;

    xhr.send(miFormita);
}

function funcionCallBack()
{
    console.log("Esto en el callback");
    document.getElementById("resultado").innerHTML = xhr.responseText;
}