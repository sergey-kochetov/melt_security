<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer info</title>
</head>
<body>
    <h1>Customer info</h1>
    <table>
        <tr>
            <td>Id</td>
            <td>${customer.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${customer.name}</td>
        </tr>
        <tr>
            <td>email</td>
            <td>${customer.email}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${customer.age}</td>
        </tr>
    </table>
<br>
<a href="/customers">return</a>
</body>
</html>