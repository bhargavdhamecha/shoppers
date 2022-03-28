<%-- 
    Document   : tableGenerator
    Created on : Mar 1, 2022, 4:01:55 PM
    Author     : abc
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Table Generator</title>
    </head>
    <body>
        <h2>Table Generator</h2>
        <div>
            <form action="tablegenerator.do" method="get">
                <table>
                    <tr>
                        <td><label>Enter Number generate Table: </label></td>
                        <td><input type="text" name="num"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><button type="submit">click to generate</button></td>
                    </tr>
                </table>
                
                    
            </form>
            
        </div>
    </body>
</html>
