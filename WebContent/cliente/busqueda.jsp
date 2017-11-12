<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Viaje Feliz | Búsqueda</title>
	<meta charset="utf-8">
	<link rel="icon" href="images/favicon.ico">
	<link rel="shortcut icon" href="images/favicon.ico">
	<link rel="stylesheet" href="css/style.css">
	
	<link type="text/css" rel="stylesheet" href="css/JFFormStyle-1.css" />
	<link rel="stylesheet" href="css/slider.css">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-migrate-1.1.1.js"></script>
	<script src="js/superfish.js"></script>
	<script src="js/sForm.js"></script>
	<script src="js/jquery.jqtransform.js"></script>
	<script src="js/jquery.equalheights.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/tms-0.4.1.js"></script>
	<script src="js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="js/jquery.ui.totop.js"></script>
	<script>
	$(window).load(function () {
	    $('.slider')._TMS({
	        show: 0,
	        pauseOnHover: false,
	        prevBu: '.prev',
	        nextBu: '.next',
	        playBu: false,
	        duration: 800,
	        preset: 'random',
	        pagination: false, //'.pagination',true,'<ul></ul>'
	        pagNums: false,
	        slideshow: 8000,
	        numStatus: false,
	        banners: true,
	        waitBannerAnimation: false,
	        progressBar: false
	    });
	    $("#tabs").tabs();
	    $().UItoTop({
	        easingType: 'easeOutQuart'
	    });
	});
	</script>
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<link rel="stylesheet" media="screen" href="css/ie.css">
	<![endif]-->
	</head>
	<body class="page1">
		
	<!--  +++++++++++ INCLUDES HEADER +++++++++++ -->
		<%@ include file="/includes/refs-header.jsp"%> 
	
	<div class="main">
	  <div class="container_12">
	    <div class="grid_12 back">
		    <!--  +++++++++++ REFERENCIAS BASICAS DO BOOTSTRAP +++++++++++ -->
			<%@ include file="/includes/searchbox.jsp"%> 
			<br />
			<br />
			<br />
			<br />
			<br />
			<div class="container_12">
				<div class="grid_12">
			      <h3>Búsqueda de casas/cabañas</h3>		
						
						<table border="1">
							<thead>
								<tr>
									<th>Código</th>
									<th>Nombre</th>
									<th>Cuidad</th>
									<th>Precio</th>
									<th colspan="2">Acción</th> 
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${lista}" var="x">
									<tr>
										<td>${x.codCabanaOCasa}</td>
										<td>${x.nombreCabanaOCasa}</td>
										<td>${x.cuidadCabanaOCasa}</td>
										<td>${x.precioDiariaCabanaOCasa}</td>		
									<td>
									<a href="<%=request.getContextPath()%>/cliente/CabanaOCasaCRUD?cmd=editar&cod=${x.codCabanaOCasa}">Más</a>							
										
									</tr>
									
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	</body>
</html>