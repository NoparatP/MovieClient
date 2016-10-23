<!DOCTYPE html>

<html>
    <head>
        <style>
            p.sansserif {
                font-family: Arial, Helvetica, sans-serif;
            }
            input[type=text] {
                width: 15%;
                padding: 6px 20px;
                margin: 4px 0;
                box-sizing: border-box;
                border: none;
                background-color: #3CBC8D;
                color: white;
            }
            input[type=submit]{
                background-color: #3CBC8D;
                border: none;
                color: white;
                padding: 6px 20px;
                text-decoration: none;
                margin: 4px 2px;
                cursor: pointer;
            }
        </style>
        <title>Movies Service</title>
    </head>
    <body>
        <form action = "action.jsp" method="post">
            <p class="sansserif"><font size="20" color="#1569C7">Movie Store</font></p><br/>  
            <p class="sansserif"> <font size="5" color="#218BA8">Select</font></p>

            <select name="category">
                <option value="title">title</option>
                <option value="year">year</option>
                <option value="types">type</option>
                <option value="director">director</option>
            </select>
            <input type="text" name="search">
            <input type="submit" value="Search">
        </form>
    </body>

</html>
