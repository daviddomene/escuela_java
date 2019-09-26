<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVCcon JSP y Servlet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Ejemplo MVCcon JSP y Servlet</h1>
        <h2>Añadir personas</h2>
        <form name='form' method='POST' action='personas.do'>
            <table border='1'> 
                <tr> 
                    <td>Nombre</td> 
                    <td><input name='nombre' id='nombre' type='text' /></td> 
                </tr> 
                <tr> 
                    <td>Edad</td> 
                    <td><input name='edad' id='edad' type='number' /></td> 
                </tr>
                <tr> 
                    <td>Email</td> 
                    <td><input name='email' id='email' type='text' /></td> 
                </tr>
                <tr> 
                    <td>pass</td> 
                    <td><input name='pass' id='pass' type='pass' /></td> 
                </tr>
            </table> 
            <input type='submit' value='enviar'> 
        </form>
        <h1>Ejemplo MVCcon JSP y Servlet</h1>
        <h2>Buscar personas</h2>
        <form name='form2' method='GET' action='personas.do'>
            <table border='1'> 
                <tr> 
                    <td>Nombre</td> 
                    <td><input name='nombre' id='nombre' type='text' /></td> 
                </tr> 
                <tr> 
                    <td>Edad</td> 
                    <td><input name='edad' id='edad' type='number' /></td> 
                </tr>
                <td>Email</td> 
                    <td><input name='email' id='email' typee='text' /></td> 
                </tr>
                <tr> 
                    <td>pass</td> 
                    <td><input name='pass' id='pass' type='pass' /></td> 
                </tr>
            </table> 
            <input type='submit' value='enviar'> 
        </form>
        
    </body>
</html>
