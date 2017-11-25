<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Viaje Feliz | Registro</title>
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
				<div class="grid_12 back" >
			      <h3>Registro de Arrendatario</h3>	
					<form method="post"
						action="<%=request.getContextPath()%>/cliente/ArrendatarioCRUD"
						name="formArrendatario">
	
						<div class="grid_12">
							<div class="form group col-md-6" style="visibility: hidden;">
								<label for="codArrendatario"> Código del arrendatario: </label> <input type="text"
									name="codArrendatario" value="${arrendatario.codArrendatario}"
									class="form-control" id="codArrendatario" readonly="readonly" /> <br />
										private Integer cedulaCuidadania;

							</div>
						</div> 
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="nombreArrendatario"> Nombre del arrendatario </label> <input
									type="text" name="nombreArrendatario" value="${arrendatario.nombreArrendatario}"
									class="form-control" id="nombreArrendatario"
									placeholder="Introduzca el nombre de la casa o cabaña" /> <br /> 
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="cedulaCuidadania"> Cedula de cuidadania </label> <input type="text"
									name="cedulaCuidadania" value="${arrendatario.cedulaCuidadania}"
									class="form-control" id="cedulaCuidadania" placeholder="Introduzca la cedula de cuidadania"/> <br />
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="nacionalidadArrendatario"> Nacionalidad </label> <input type="text"
									name="nacionalidadArrendatario" value="${arrendatario.nacionalidadArrendatario}"
									class="form-control" id="nacionalidadArrendatario" placeholder="Introduzca la nacionalidad"/> <br />
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="direccionResidenciaArrendatario"> Dirección residencia </label> <input type="text"
									name="direccionResidenciaArrendatario" value="${arrendatario.direccionResidenciaArrendatario}" class="form-control"
									id="direccionResidenciaArrendatario" placeholder="Introduzca la dirección" /> <br />
							</div>
						</div>		
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="telefono"> Teléfono </label> <input
									type="text" name="telefono" value="${arrendatario.telefono}"
									class="form-control" id="telefono"
									placeholder="Introduzca el teléfono" /> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="correoElectronicoArrendatario"> Correo electronico </label> <input type="text"
									name="correoElectronicoArrendatario" value="${arrendatario.correoElectronicoArrendatario}" class="form-control"
									id="correoElectronicoArrendatario" placeholder="Introduzca su correo electronico"/> <br />
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="contrasenhaArrendatario"> Contrasenha </label> <input type="password"
									name="contrasenhaArrendatario" value="${arrendatario.contrasenhaArrendatario}"
									class="form-control" id="contrasenhaArrendatario" placeholder="Introduzca su contrasenha"/> <br />
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