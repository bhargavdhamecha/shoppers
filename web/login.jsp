<%-- 
    Document   : login
    Created on : Mar 1, 2022, 4:20:37 PM
    Author     : abc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <style>
            .container{
                display: block;
                margin-left: auto;
                margin-right: auto;
                border: solid #000 2px;
                width: fit-content;
                padding: 15px;
            }
            
        </style>
    </head>
    
    <body>
        <div class="container">
            <form action="newlogin.do" method="post">
                <table>
                    <thead>
                    <th colspan="2">Login</th>
                    </thead>
                    <tbody>
                        <tr>
                            <td>UserName: </td>
                            <td><input type="text" name='username'></td>
                        </tr>
                        <tr>
                            <td>password: </td>
                            <td><input type="password" name='password'></td>
                        </tr>
                        <tr>
                            <td colspan="2"><button type="submit" name='submit'>submit</button></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
