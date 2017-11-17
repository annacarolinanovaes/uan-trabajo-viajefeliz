<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Viaje Feliz | Búsqueda</title>
	<meta charset="utf-8">
	<link rel="icon" href="<%=request.getContextPath()%>/images/favicon.ico">
	<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.ico">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/2.css">
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
				<div class="grid_12 back">
				 <h3>Registro de casas y/o cabañas</h3>	
					<form method="post"
						action="<%=request.getContextPath()%>/cliente/CabanaOCasaCRUD"
						name="formCabanaOCasa">
	
				<!-- 		<div class="grid_12">
							<div class="form group col-md-6" style="visibility: hidden;">
								<label for="codArrendatario"> Código del arrendatario: </label> <input type="text"
									name="codArrendatario" value="${arre.codArrendatario}"
									class="form-control" id="codArrendatario" readonly="readonly" /> <br />
							</div>
						</div> -->
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="nombreCabanaOCasa"> Nombre de la casa o cabaña </label> <input
									type="text" name="nombreCabanaOCasa" value="${cabanaocasa.nombreCabanaOCasa}"
									class="form-control" id="nombreCabanaOCasa"
									placeholder="Introduzca el nombre de la casa o cabaña" /> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="precioDiariaCabanaOCasa"> Precio diaria ($) </label> <input
									type="text" name="precioDiariaCabanaOCasa" value="${cabanaocasa.precioDiariaCabanaOCasa}"
									class="form-control" id="precioDiariaCabanaOCasa"
									placeholder="Introduzca el precio diaria" /> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="ubicacionCabanaOCasa"> Ubicación </label> <input type="text"
									name="ubicacionCabanaOCasa" value="${cabanaocasa.ubicacionCabanaOCasa}" class="form-control"
									id="ubicacionCabanaOCasa" placeholder="Introduzca la ubicación"/> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="ciudadCabanaOCasa"> Cuidad </label> <input type="text"
									name="ciudadCabanaOCasa" value="${cabanaocasa.ciudadCabanaOCasa}" class="form-control"
									id="ciudadCabanaOCasa" placeholder="Introduzca la cuidad" /> <br />
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="fotoCabanaOCasa"> Foto  </label>
							 		<input type="file" value="${cabanaocasa.fotoCabanaOCasa}" id="fotoCabanaOCasa" name="pic" accept="image/*"><br />
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="nroBanosCabanaOCasa"> Cantidad de banos </label> <input type="text"
									name="nroBanosCabanaOCasa" value="${cabanaocasa.nroBanosCabanaOCasa}"
									class="form-control" id="nroBanosCabanaOCasa" placeholder="Introduzca la cantidad de banos"/> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="nroHabitacionesCabanaOCasa"> Cantidad de habitaciones </label> <input type="text"
									name="nroHabitacionesCabanaOCasa" value="${cabanaocasa.nroHabitacionesCabanaOCasa}" class="form-control"
									id="nroHabitacionesCabanaOCasa" placeholder="Introduzca la cantidad de habitaciones"/> <br />
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="arrendatario"> Código da empresa selecionada: </label> <input type="text"
									name="codArrendatario" value="${cabanaocasa.arrendatario.codArrendatario}"
									class="form-control" id="codArrendatario"/> <br />
							</div>
						</div>
						
	
						<div id="actions" class="grid_12">
							<div class="col-md-12">
								<button type="submit" class="btn btn-success btn-xs">Listo!</button>
								<a href="<%=request.getContextPath()%>/index.jsp"
									class="btn btn-danger btn-xs">Cancelar</a>
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