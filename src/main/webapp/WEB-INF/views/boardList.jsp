<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <link href="${pageContext.request.contextPath }/css/board.css" rel="stylesheet" type="text/css" />
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="../js/jquery.js"></script>
</head>
<body>
<section id ="board">
    <h2>Corretto 게시판</h2>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">게시판 이름</th>
            <th scope="col">게시글 제목</th>
            <th scope="col">작성일자</th>
            <th scope="col">대표파일</th>
        </tr>
        </thead>
<%--        forEach문 돌리기--%>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td><a href="#">자바의 정석</a></td>
            <td>남궁성</td>
            <td>2021-10-16</td>
        </tr>
        </tbody>
    </table>
    <div class="but2">
        <button class="btn-inline" type="submit">
            <a href="${pageContext.request.contextPath }/write">글쓰기</a>
        </button>
    </div>
</section>

</body>
</html>
