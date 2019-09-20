$( ()=>
    {
        $("#btnEnvia").click(enviaDatos);
    }
);
function enviaDatos()
{
    var nombre = $("#txtNombre").val();
    $.get("AlumnoServlet",{
        nombreAlumno : nombre
    }, function (responseText){
        $("#resultado").text(responseText);
    })
}