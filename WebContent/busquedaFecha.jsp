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

	<div id="main" class="container-fluid">
		<div class="section">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h1>Busqueda Fecha</h1>
						<p>Por gentileza, preencha os dados solicitados para que a
							consulta seja efetivada.</p>
					</div>
				</div>
			</div>
		</div>

		<div class="section">
			<div class="container">

				<form method="post"
					action="<%=request.getContextPath()%>/cliente/CabanaOCasa2CRUD">

					<div class="row">
						<div class="form group col-md-6">
							<label for="campo1"> Data Inicial: </label> <input
								type="text" name="fechaInicio"
								class="form-control" id="fechaInicio"
								placeholder="Digite a data mínima" /> <br />
						</div>
					</div>

					<div class="row">
						<div class="form group col-md-6">
							<label for="campo2"> Data Final: </label> <input
								type="text" name="fechaFin" class="form-control" id="fechaFin"
								placeholder="Digite a data máxima" /> <br />
						</div>
					</div>


					<div class="row">
				<div class="form-group col-md-6">
					<label for="nome"> Nome: </label> <input type="text"
						name="ciudadCabanaOCasa" class="form-control" id="ciudadCabanaOCasa"
						placeholder="Digite o nome" />

				</div>
			</div>
			
					<div id="actions" class="row">
						<div class="col-md-12">
							<button type="submit" class="btn btn-success btn-xs">Enviar</button>
							<button type="reset" class="btn btn-danger btn-xs">Limpar</button>
						</div>
					</div>

				</form>
			</div>
		</div>
		
	</div>
</body>
</html>