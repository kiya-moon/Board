<%--
  Created by IntelliJ IDEA.
  User: kiya
  Date: 2022-10-19
  Time: 오전 2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글</title>
    <link href="${pageContext.request.contextPath }/css/board.css" rel="stylesheet" type="text/css" />
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="../js/jquery.js"></script>
</head>
<body>
    <div class="boardName">
        <p>게시판 이름 : </p>
    </div>

    <div class="createdDate">
        <p>작성일 : </p>
    </div>

    <div class= "title">
        <p><b>제목 : </b></p>
    </div>

    <div class="content">
        <p>내용 : </p>
    </div>

    <div class="but_page">
        <button class="btn-inline-page" type="submit">
            등록
        </button>
        <button class="btn-inline-page" type="submit">
            목록
        </button>
    </div>
</body>
</html>
