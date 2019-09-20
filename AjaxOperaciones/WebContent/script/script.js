var xhr = new XMLHttpRequest();

window.onload = 
()=>
{
    //alert("Testitu Función Flecha");
    var btnSuma = document.getElementById("btnSuma");
    btnSuma.addEventListener("click", sumaNumeros);
}

function sumaNumeros()
{
    //alert("Testitu Suma Números");
    var txtNumero1= document.getElementById("txtNumero1").value;
    var txtNumero2 = document.getElementById("txtNumero2").value;

    //xhr.responseType = "text";
    xhr.open("GET", "SumaNumerosServlet?Numero1="+txtNumero1+"&Numero2="+txtNumero2,true);

    xhr.onload = funcionCallBack;

    xhr.send(null);
}

function funcionCallBack()
{
    document.getElementById("resultadoSuma").innerHTML=xhr.responseText;
}