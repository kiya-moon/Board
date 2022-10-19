<%--
  Created by IntelliJ IDEA.
  User: kiya
  Date: 2022-10-19
  Time: 오전 2:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>글쓰기</title>
    <link href="${pageContext.request.contextPath }/css/board.css" rel="stylesheet" type="text/css" />
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="../js/jquery.js"></script>
</head>
<body>
<div id ="write">
    <h2>글쓰기</h2>

    <form action="" id="form">
        <div class="boardName">
            <select name="board_id" id="board_id">
                <option value="default">게시판을 선택해주세요.</option>
                <option value="1">BACKPACK</option>
                <option value="2">INSIDEWEB</option>
            </select>
        </div>

        <div class= "title">
            <input name="title" id="title" type="text" placeholder="제목을 입력해 주세요." value="" >
        </div>

        <div class="content">
            <p><textarea name="content" id="content">내용을 입력해주세요.</textarea></p>
        </div>

        <div class="but_page">
            <button class="btn-inline-page" id="regBtn" type="button">
                등록
            </button>
            <button class="btn-inline-page" >
                목록
            </button>
        </div>
    </form>
</div>
<script>
    $(document).ready(function(){
        $('#regBtn').on("click", function(){
            let form = $('form');
            form.attr("action", "${pageContext.request.contextPath }/write");
            form.attr("method", "post");
            form.submit();
        })
    })
</script>
</body>
</html>
