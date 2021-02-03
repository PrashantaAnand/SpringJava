<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${Header}</h1>
<p>${desc }</p>
<hr>
<h1>Welcome , ${user.userName }</h1>
<h5>Given an amount, find the minimum number of notes of different denominations that sum upto the given amount. Starting from the highest denomination note, try to accommodate as many notes possible for given amount.
Java, JSP, and JavaServer Pages are trademarks or registered trademarks of Sun Microsystems, Inc. in the US and other countries. Copyright 2002-3 Sun Microsystems, Inc. 4150 Network Circle Santa Clara, CA 95054, U.S.A. All Rights Reserved.
Be sure to use an appropriate type attribute on all inputs (e.g., email for email address or number for numerical information) to take advantage of newer input controls like email verification, number selection, and more.

Here’s a quick example to demonstrate Bootstrap’s form styles. Keep reading for documentation on required classes, form layout, and more.
Default checkboxes and radios are improved upon with the help of .form-check, a single class for both input types that improves the layout and behavior of their HTML elements. Checkboxes are for selecting one or several options in a list, while radios are for selecting one option from many.

Disabled checkboxes and radios are supported, but to provide a not-allowed cursor on hover of the parent  you’ll need to add the disabled attribute to the .form-check-input. The disabled attribute will apply a lighter color to help indicate the input’s state.

Checkboxes and radios use are built to support HTML-based form validation and provide concise, accessible labels. As such, our  and  are sibling elements as opposed to an <input> within a . This is slightly more verbose as you must specify id and for attributes to relate the  and .
The .form-group class is the easiest way to add some structure to forms. It provides a flexible class that encourages proper grouping of labels, controls, optional help text, and form validation messaging. By default it only applies margin-bottom, but it picks up additional styles in .form as needed. Use it with or nearly any other element.</h5>

<h1>Your email address is ${user.email }</h1>

<h1>Your password is ${user.password }</h1>
<hr>
<h2>try to secure your password</h2>
<hr>
</body>
</html>