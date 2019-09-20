//alert("Testitu");
//Paso 1. Creamos el objeto asíncrono
var xhr = new XMLHttpRequest();

window.onload = 
()=>
{
    //alert("Si entra al onload");
    //Paso 2. Asignamos el listener al botón
    var btnAceptaNombre = document.getElementById("btnAceptaNombre");
    btnAceptaNombre.addEventListener("click",llamaServlet);
}

function llamaServlet()
{
    //alert("Si entra a la llamada");
    //Obtenemos el valor del textbox
    var txtNombre = document.getElementById("txtNombre").value;

    //Paso 3. Abrimos el proceso asíncrono
    xhr.open("GET","BienvenidaServlet?txtNombre="+txtNombre,true);
    
    //Paso 4. Observamos si el proceso asíncrono se terminó de cargar exitosamente
    xhr.onload = funcionCallBack;

    //Paso . Enviamos el proceso asíncrono
    xhr.send();
}

function funcionCallBack()
{
    document.getElementById("Bienvenida").innerHTML=xhr.responseText;
}