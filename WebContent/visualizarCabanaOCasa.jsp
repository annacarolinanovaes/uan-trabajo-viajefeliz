<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Viaje Feliz | Detalles</title>
	<meta charset="utf-8">
	<link rel="icon" href="<%=request.getContextPath()%>/images/favicon.ico">
	<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.ico">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/2.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/button.css">	 
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/stylebox.css">
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
				 <div class="grid_12 back" style=" position: relative; left: 5%; font-size: 14px;">
			      <h3 style="text-transform: capitalize; font-family: 'Pathway Gothic One', sans-serif; position: relative; font-size: 50px;">${cabanaocasa.nombreCabanaOCasa} </h3>	
					<form method="post"
						action="<%=request.getContextPath()%>/cliente/CabanaOCasaCRUD"
						name="formCabanaOCasa">
						
						<div class="grid_12" style="font-size: 16px; position: relative; left: 3%; border-radius: 10px;">
							<div class="form group col-md-6">
							<div class="float-left">
								<img src="<%=request.getContextPath()%>/images/big01.jpg" class="rounded float-left" style="border-radius: 10px;" alt="...">
							 		${cabanaocasa.fotoCabanaOCasa}<br />
							 		</div>
								<br />
							</div>
						</div>
	

						<div class="form-row">
							<div class="form-group col-md-8" style="font-size: 16px; position: relative; left: 3%;">
								<div class="form group col-md-6">
									<label for="ubicacionCabanaOCasa"> Ubicación: </label> ${cabanaocasa.ubicacionCabanaOCasa}<br />
								</div>
							</div>
		
							<div class="form-group col-md-4" style="font-size: 16px; position: relative; left: 3%;">
								<div class="form group col-md-6" style="right: 54%;">
									<label for="ciudadCabanaOCasa"> Cuidad: </label> ${cabanaocasa.ciudadCabanaOCasa}<br />
								</div>
							</div>
						</div>
						
						<div class="form-row">
							<div class="form-group col-md-6" style="font-size: 16px; position: relative; left: 3%;">
								<div class="form group col-md-6">
									<label for="nroBanosCabanaOCasa"> Cantidad de banos: </label> ${cabanaocasa.nroBanosCabanaOCasa}<br />
								</div>
							</div>
		
							<div class="form-group col-md-6" style="font-size: 16px; position: relative; left: 3%;">
								<div class="form group col-md-6">
									<label for="nroHabitacionesCabanaOCasa"> Cantidad de habitaciones: </label> ${cabanaocasa.nroHabitacionesCabanaOCasa} <br />
								</div>
							</div>
						</div>
						
						<div class="form-row">
							<div class="form-group col-md-8" style="font-size: 16px; position: relative; left: 3%;">
								<div class="form group col-md-6">
									<label for="arrendatario"> Código del arrendatário seleccionado: </label> ${cabanaocasa.arrendatario.codArrendatario}<br />
								</div>
							</div>
							
							
							<div class="form-group col-md-4" style="font-size: 16px; position: relative; left: 3%;">
								<div class="form group col-md-8" style="right: 54%;">
									<p class="text-lg-left"><label for="precioDiariaCabanaOCasa"> Precio diaria: ($) </label> ${cabanaocasa.precioDiariaCabanaOCasa}0 </p>								
								<br />
								</div>
							</div>
						</div>
	
						<div id="actions" class="form-group col-md-8" style="font-size: 16px; position: relative; left: 3%;">
							<div class="col-md-12">
							<a href="<%=request.getContextPath()%>/cliente/AlquilerCRUD?cmd=novo&cod=${cabanaocasa.codCabanaOCasa}"
									class="buttonmas">Realizar alquiler</a>
								<a href="<%=request.getContextPath()%>/cliente/CabanaOCasaCRUD?cmd=listar"
									class="buttonmas">Volver</a>	
							</div>
						</div>
	
	
						<!-- Exemplo de data com JSTL: 
						 Data do pedido: <input
						 type="text" name="dataPedido"
						 value="<fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataPedido}" />" /> <br />
						 -->
					</form>
				</div>
			</div>	
		</div>
	</body>
</html>