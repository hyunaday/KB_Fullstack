<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%--sticky-top 클래스의 경우 스크롤 시 상단에 고정시켜준다--%>
<nav class="navbar navbar-expand-md bg-primary navbar-dark sticky-top">
    <a class="navbar-brand" href="#"><i class="fa-solid fa-house"></i> Backend</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <!-- 좌측 메뉴 구성 -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">메뉴1</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">메뉴2</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">메뉴3</a>
            </li>
        </ul>
        <!-- 우측 메뉴 -->
        <ul class="navbar-nav ms-auto">
            <li class="nav-item">
                <a class="nav-link" href="#">
                    <img src="data:image/webp;base64,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"
                         class="avatar-sm"/>
                    admin
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">
                    <i class="fa-solid fa-right-from-bracket"></i> 로그아웃
                </a>
            </li>
        </ul>
    </div>
</nav>