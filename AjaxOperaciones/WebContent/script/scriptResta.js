var xhr = new XMLHttpRequest();

window.onload =
()=>
{
    var btnResta = document.getElementById("btnResta");
    btnResta.addEventListener("click", restaNumeros);
}

function restaNumeros()
{
    var txtNumero1 = document.getElementById("txtNumero1").value;
    var txtNumero2 = document.getElementById("txtNumero2").value;
    console.log("Valor txtNumero1:"+txtNumero1);
    console.log("Valor txtNumero2:"+txtNumero2);
    xhr.open("GET","RestarNumerosServlet?Pizza="+txtNumero1+"&Tacos="+txtNumero2, true);

    xhr.onload = funcionCallBack;

    xhr.send();
}

function funcionCallBack()
{
    var respuestaDelServlet = JSON.parse(xhr.responseText);
    console.log(respuestaDelServlet["resultadoResta"]);
    //document.getElementById("resultadoResta").innerHTML = xhr.responseText;
    document.getElementById("resultadoResta").innerHTML= "El resultado del servlet de la resta fue:"+respuestaDelServlet["resultadoResta"];
}