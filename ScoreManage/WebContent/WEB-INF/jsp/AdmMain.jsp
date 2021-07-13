<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" context="text/html"; charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>管理员界面</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="${pageContext.request.contextPath }/plugins/fontawesome-free/css/all.min.css">
  <!-- IonIcons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath }/dist/css/adminlte.min.css">
</head>
<!--
`body` tag options:

  Apply one or more of the following classes to to the body tag
  to get the desired effect

  * sidebar-collapse
  * sidebar-mini
-->
<body class="hold-transition sidebar-mini">
<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Notifications Dropdown Menu -->
      <li class="nav-item">
        <a class="nav-link" data-widget="fullscreen" href="#" role="button">
          <i class="fas fa-expand-arrows-alt"></i>
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
          <i class="fas fa-th-large"></i>
        </a>
      </li>
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="index3.html" class="brand-link">
      <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
      <span class="brand-text font-weight-light">成绩管理系统</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">当前用户：${USER_SESSION.admin_name }, 管理员</a>
          <a href = "${pageContext.request.contextPath }/logout">退出</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
         
          <li class="nav-item">
            <a href="#" class="nav-link" onclick="queryStu()">
              <i class="nav-icon fas fa-th"></i>
              <p>
                查询学生
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link" onclick="addStu()">
              <i class="nav-icon fas fa-th"></i>
              <p>
               添加学生
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link" onclick="queryTea()">
              <i class="nav-icon fas fa-th"></i>
              <p>
                查询教师
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link" onclick="addTea()">
              <i class="nav-icon fas fa-th"></i>
              <p>
                添加教师
              </p>
            </a>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0">管理员操作页面</h1>
            
	
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->
    <div class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-6">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">信息展示</h3><br/>
                <table>
                <tr>
                	<td><input type ="button"  class = "btn btn-block btn-primary" value="查询学生" onclick="queryStu()"/></td>
                	<td><input type ="button"  class = "btn btn-block btn-primary" value="添加学生" onclick="addStu()"/></td>
                	<td><input type ="button"  class = "btn btn-block btn-primary" value="查询教师" onclick="queryTea()"/></td>
                	<td><input type ="button"  class = "btn btn-block btn-primary" value="添加教师" onclick="addTea()"/></td>
                </tr>
                </table>
                
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table id="list" class="table table-bordered table-hover">
                  
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!--/.card-->
          </div>
          <!-- /.col-md-6 -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <strong>Copyright &copy; 2021 成绩管理系统.</strong>
    All rights reserved.
    <div class="float-right d-none d-sm-inline-block">
      <b>Version</b> 3.1.0-rc
    </div>
  </footer>
</div>
<!-- ./wrapper -->

<!-- REQUIRED SCRIPTS -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath }/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath }/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE -->
<script src="${pageContext.request.contextPath }/dist/js/adminlte.js"></script>

<!-- OPTIONAL SCRIPTS -->
<script src="${pageContext.request.contextPath }/plugins/chart.js/Chart.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath }/dist/js/demo.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${pageContext.request.contextPath }/dist/js/pages/dashboard3.js"></script>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js">
</script>
<script type="text/javascript">
	function queryStu(){
		var count = 1;
		$.ajax({
			url : "${pageContext.request.contextPath }/AdminQueryStudent",
			type : "post",
			success : function(data) {
				 if(data !=null){
					 $("#list").empty();
					 var head = '<tr><td>序号</td><td>学号</td><td>姓名</td><td>修改</td><td>删除</td></tr>';
					 $("#list").append(head);
					 for(i in data){
						 var str = '<tr><td>'+count+'</td><td>'+data[i].stu_id+'</td><td>'+data[i].stu_name+'</td><td><button type = "button"  class="btn btn-block btn-success"  onclick="updateStu('+data[i].stu_id+')">修改</button></td><td><button type = "button" class="btn btn-block btn-danger"  onclick="delStu('+data[i].stu_id+')">删除</button></td></tr>';
						 $("#list").append(str);
						 count+=1;
					 }
				 }
			}
		});
	}
	
	function queryTea(){
		var count = 1;
		$.ajax({
			url : "${pageContext.request.contextPath }/AdminQueryTeacher",
			type : "post",
			success : function(data) {
				 if(data !=null){
					 $("#list").empty();
					 var head = '<tr><td>序号</td><td>教师号</td><td>姓名</td><td>科目</td><td>修改</td><td>删除</td></tr>';
					 $("#list").append(head);
					 for(i in data){
						 var str = '<tr><td>'+count+'</td><td>'+data[i].teacher_id+'</td><td>'+data[i].teacher_name+'</td><td>'+data[i].teacher_subject+'</td><td><button type = "button" class="btn btn-block btn-success" onclick="updateTea('+data[i].teacher_id+')">修改</button></td><td><button type = "button"  class="btn btn-block btn-danger"  onclick="delTea('+data[i].teacher_id+')">删除</button></td></tr>';
						 $("#list").append(str);
						 count+=1;
					 }
				 }
			}
		});
	}
	
	function addStu(){
		window.location.href = "${pageContext.request.contextPath }/AdminAddStu";
	}
	function addTea(){
		window.location.href = "${pageContext.request.contextPath }/AdminAddTea";
	}
	function delTea(id){
		var id = id;
		$.ajax({
			url : "${pageContext.request.contextPath }/AdminDeleteTea",
			type : "post",
			data :{
					teacher_id:id
			},
			success : function(data) {
				if(data != null)
				queryTea();
				}
		});
	}
	function delStu(id){
		var id = id;
		$.ajax({
			url : "${pageContext.request.contextPath }/AdminDeleteStu",
			type : "post",
			data : {
					stu_id:id
			},
			success : function(data) {
				if(data !=null)
				queryStu();
				}
		});	
	}
	function updateStu(id){
		window.location.href = "${pageContext.request.contextPath}/AdminUpdateStu?stu_id="+id
	}
	function updateTea(id){
		window.location.href = "${pageContext.request.contextPath}/AdminUpdateTea?teacher_id="+id
	}

</script>


</html>