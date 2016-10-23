<%-- 
    Document   : action
    Created on : Oct 23, 2016, 3:24:25 PM
    Author     : Teng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            p.sansserif {
                font-family: Arial, Helvetica, sans-serif;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
    </head>
    <body>
        <p class="sansserif"> <font size="8" color="#218BA8">Result</font></p>
        <%-- start web service invocation --%><hr/>
        <p class="sansserif">
            <%
                String category_name = request.getParameter("category");
                String search_name = request.getParameter("search");
                try {
                    moive.Movie_Service service = new moive.Movie_Service();
                    moive.Movie port = service.getMoviePort();
                    // TODO initialize WS operation arguments here
                    java.lang.String category = category_name;
                    java.lang.String search = search_name;
                    // TODO process result here
                    java.lang.String result = port.movie(category, search);
                    out.println("Category = " + category_name);
                    out.println("<br>Search = " + search_name);
                    out.println("<br>===================================");
                    out.println(result);
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            %></p>
        <%-- end web service invocation --%><hr/>
    </body>
</html>
