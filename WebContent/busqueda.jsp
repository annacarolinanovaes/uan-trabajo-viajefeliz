<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Viaje Feliz | B�squeda</title>
	<meta charset="utf-8">
	<link rel="icon" href="<%=request.getContextPath()%>/images/favicon.ico">
	<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.ico">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
	
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/JFFormStyle-1.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/slider.css">
	<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery-migrate-1.1.1.js"></script>
	<script src="<%=request.getContextPath()%>/js/superfish.js"></script>
	<script src="<%=request.getContextPath()%>/js/sForm.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.jqtransform.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.equalheights.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.easing.1.3.js"></script>
	<script src="<%=request.getContextPath()%>/js/tms-0.4.1.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.ui.totop.js"></script>
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
			      <h3>B�squeda de casas/caba�as</h3>		
						
						<table border="1" style="border-radius: 10px;">
							<thead>
								<tr>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${lista}" var="x">
									
								 <tr>
									<!-- 	<td>${x.codCabanaOCasa}</td>
										<td>${x.nombreCabanaOCasa}</td>
										<td>${x.ciudadCabanaOCasa}</td>
										<td>${x.precioDiariaCabanaOCasa}</td>		
									<td>
									<a href="<%=request.getContextPath()%>/cliente/CabanaOCasaCRUD?cmd=editar&cod=${x.codCabanaOCasa}">M�s</a>							
									</td>	-->
									<td>
											
								      <div class="container" style="height: 400px; width: 85%;">
							               <img src="<%=request.getContextPath()%>/images/page1_img1.jpg"
						              class="img-rounded pull-left" style=" position: absolute; right: 65%; border-radius: 10px;">
													<div class="row">
													<h3 style="text-align: center;">${x.nombreCabanaOCasa}</h3>
														<div class="col col-lg-2">
									                
									                <p><span class="dados" style="left: 70%;">Precio diaria:</span></p>
									                <p><span class="dados" style="left: 70%;">$ ${x.precioDiariaCabanaOCasa}0.</span></p>
									                
									                <p><span style="left: 70%;">Nro banos:</span></p>
									                <p><span style="left: 70%;">${x.nroBanosCabanaOCasa}</span></p>
									                
									                <p><span style="left: 70%;">Nro habitaciones:</span></p>
									                <p><span style="left: 70%;">${x.nroHabitacionesCabanaOCasa}.</span></p>
									           	</div>
								            </div>
								          </div>		             
							            </td>
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