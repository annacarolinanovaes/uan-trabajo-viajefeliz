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
				<div class="grid_12 back">
				 <h3>Registro de alquiler</h3>	
					<form method="post"
						action="<%=request.getContextPath()%>/cliente/AlquilerCRUD"
						name="formAlquiler">
	
				<!-- 		
					private Integer codAlquiler;
	private Date fechaInicio;
	private Date fechaFin;
	private int CantidadPersonas;
	private boolean pago;
				
				<div class="grid_12">
							<div class="form group col-md-6" style="visibility: hidden;">
								<label for="codArrendatario"> Código del arrendatario: </label> <input type="text"
									name="codArrendatario" value="${arre.codArrendatario}"
									class="form-control" id="codArrendatario" readonly="readonly" /> <br />
							</div>
						</div> -->
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="cabanaOCasa"> Código de la cabana o casa seleccionada: </label> <input type="text"
									name="codCabanaOCasa" value="${alquiler.cabanaOCasa.codCabanaOCasa}"
									class="form-control" id="cabanaOCasa" readonly="readonly" /> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="fechaInicio"> Fecha inicio </label> <input
									type="text" name="fechaInicio" value="${alquiler.fechaInicio}"
									class="form-control" id="fechaInicio"
									required="required" placeholder="Introduzca la fecha inicio" /> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="fechaFin"> Fecha fin </label> <input type="text"
									name="fechaFin" value="${alquiler.fechaFin}" class="form-control"
									id="fechaFin" required="required" placeholder="Introduzca la fecha fin"/> <br />
							</div>
						</div>
	
						<div class="grid_12">
							<div class="form group col-md-6">
								<label for="cantidadPersonas"> Cantidad de personas </label> <input type="text"
									name="cantidadPersonas" value="${alquiler.cantidadPersonas}" class="form-control"
									id="cantidadPersonas" required="required" placeholder="Introduzca la cantidad de personas" /> <br />
							</div>
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">								
								<label for="pago">Pago: </label>
									<c:choose> 
										<c:when test="${alquiler.pago == true}"> 
											  <input type="radio"  name="pago" value="true" checked="checked"/>No
										  <input type="radio"  name="pago" value="false"/>Sí
										 </c:when> 
									 
									 <c:otherwise >
										 <input type="radio" name="pago" value="true"/>Sí
										 <input type="radio"  name="pago" value="false" checked="checked"/>No <br />
									 </c:otherwise>
								  </c:choose>
							</div><br />
						</div>
						
						<div class="grid_12">
							<div class="form group col-md-6">
								<br /><label for="codUsuario"> Código del usuário </label> <input type="text"
									name="codUsuario" value="${alquiler.usuarioSeleccionado.codUsuario}"
									class="form-control" required="required" id="codUsuario" placeholder="Introduzca la cantidad de banos"/> <br />
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