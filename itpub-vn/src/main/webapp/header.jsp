<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<title>Header</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
<!-- BEGIN HEADER CONTENT -->
    <header>
        <div class="head_container">
            <headleft> <logo> <a href="/controller" /> </logo> </headleft>
            <headright>
            <div class="Head_bar">
                <div class="linkhead">
                    <a href="">Diễn đàn</a>
                </div>
                <div class="headsearch">
                    <a class="head_kinhlup"> <span></span> <texts>Tìm kiếm
                        &amp; Lọc điện thoại</texts>
                    </a>
                </div>
            </div>
            <div class="headlogin">
                <div class="taikhoan">
                    <label for="headusername">Tài khoản</label> <input type="username"
                        name="txtusername" id="txtusername11" tabindex="1">
                    <div class="savelogin">
                        <label> <input type="checkbox" name="remeber_me1"
                            id="remeber_me1" value="1" tabindex="3"> <span>Lưu
                                tài khoản</span>
                        </label>
                    </div>
                </div>
                <div class="matkhau">
                    <label for="headpass">Mật khẩu</label> <input type="password"
                        name="txtpass" id="txtpass11" tabindex="2"> <a
                        href="/controller?action=lostpsw"><span>Quên mật khẩu?</span></a>
                </div>
            </div>
            <div class="head_regiter">
                <a href="/controller?action=lostpsw" class="headbtnreg">Đăng ký</a> <a
                href="/controller?action=login"
                    class="headbtnlogin" tabindex="5" onclick="return checklogin11();">Đăng
                    nhập</a>
            </div>
            </headright>
        </div>
    </header>
</body>
</html>