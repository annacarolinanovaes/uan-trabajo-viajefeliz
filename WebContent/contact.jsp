<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Journey | Contactenos</title>
	<meta charset="utf-8">
	<link rel="icon" href="images/favicon.ico">
	<link rel="shortcut icon" href="images/favicon.ico">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/form.css">
	<script src="js/jquery.js"></script>
	<script src="js/forms.js"></script>
	<script src="js/jquery-migrate-1.1.1.js"></script>
	<script src="js/superfish.js"></script>
	<script src="js/jquery.equalheights.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.ui.totop.js"></script>
	<script>
	$(window).load(function () {
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
	<body>
	<!--  +++++++++++ INCLUDES HEADER +++++++++++ -->
		<%@ include file="/includes/refs-header.jsp"%> 
	<div class="main">
	  <div class="content">
	    <div class="container_12">
	      <div class="grid_9">
	        <h3>Mapa</h3>
	        <div class="map">
	          <figure class="img_inner fleft">
					<div style="width: 525px"><iframe width="525" height="600" src="https://www.mapsdirections.info/en/custom-google-maps/map.php?width=525&height=600&hl=ru&q=Calle%2022%20Sur%20%2312D-81+(UAN%20-%20Sede%20Sur)&ie=UTF8&t=h&z=11&iwloc=A&output=embed" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"><a href="https://www.mapsdirections.info/en/custom-google-maps/">www.mapsdirections.info</a> by <a href="https://www.mapsdirections.info/en/">Measure area on map</a></iframe></div><br />
	          </figure>
	          <address>
	          <dl>
	            <dt><b> Universidad Antonio Nariño - Sede Sur,</b><br>
	              Calle 22 Sur #12D-81, Bogotá, Colômbia </dt><br />
	              
	             <b>Alumna: Anna Carolina Novaes</b>
	            <dd><span>Teléfono:</span>+57 315 307-9861</dd>
	            <dd><span>Teléfono 02:</span>+55 034 9 9991-1985</dd>
	            <dd>Correo electronico: <a href="#" class="link-1">annacarolinanovaes1994@gmail.com</a></dd>
	          </dl>
	          </address>
	          <address class="mb0">
	          <dl>
				<b>Alumno: Brayan Smith Salgado</b>
	            <dd><span>Teléfono:</span>+1 800 559 6580</dd>
	            <dd><span>Teléfono 02:</span>+1 800 603 6035</dd>
	            <dd>E-mail: <a href="#" class="link-1">mail@demolink.org</a></dd>
	          </dl>
	          </address>
	        </div>
	      </div>
	      <div class="grid_3">
	        <h3>Contactenos</h3>
	        <form id="form" action="#">
	          <div class="success_wrapper">
	            <div class="success">¡Formulario de contacto enviado!<br>
	              <strong>Nos veremos pronto.</strong> </div>
	          </div>
	          <fieldset>
	            <label class="name">
	              <input type="text" value="Nombre y apellidos">
	              <br class="clear">
	              <span class="error error-empty">*Esto no es um nombre válido.</span><span class="empty error-empty">*Este campo es requerido.</span> </label>
	            <label class="email">
	              <input type="text" value="Correo electronico">
	              <br class="clear">
	              <span class="error error-empty">*Esta no es una dirección de correo electrónico válida.</span><span class="empty error-empty">*Este campo es requerido.</span> </label>
	            <label class="name">
	              <input type="text" value="Tema">
	              <br class="clear">
	              <span class="error error-empty">*Este no es un tema válido.</span><span class="empty error-empty">*Este campo es requerido.</span> </label>
	            <label class="message">
	              <textarea>Mensaje</textarea>
	              <br class="clear">
	              <span class="error">*El mensaje es muy corto.</span> <span class="empty">*Este campo es requerido.</span> </label>
	            <div class="clear"></div>
	            <div class="btns"><a data-type="reset" class="btn">Limpar</a>
	              <div class="none"></div>
	              <a data-type="submit" class="btn">Enviar</a>
	              <div class="clear"></div>
	            </div>
	          </fieldset>
	        </form>
	      </div>
	      <div class="clear"></div>
	    </div>
	  </div>
	  <div class="bottom_block">
	    <div class="container_12">
	      <div class="grid_2 prefix_2">
	        <ul>
	          <li><a href="#">FAQS Page</a></li>
	          <li><a href="#">People Say</a></li>
	        </ul>
	      </div>
	      <div class="grid_2">
	        <ul>
	          <li><a href="#">Useful links</a></li>
	          <li><a href="#">Partners</a></li>
	        </ul>
	      </div>
	      <div class="grid_2">
	        <ul>
	          <li><a href="#">Insurance</a></li>
	          <li><a href="#">Family Travel</a></li>
	        </ul>
	      </div>
	      <div class="grid_2">
	        <h4>Contact Us:</h4>
	        TEL: 1-800-234-5678<br>
	        <a href="#">info@demolink.org</a> </div>
	      <div class="clear"></div>
	    </div>
	  </div>
	</div>
	<footer>
	  <div class="container_12">
	    <div class="grid_12">
	      <div class="socials"> <a href="#"></a> <a href="#"></a> <a href="#"></a> <a href="#"></a> </div>
	      <div class="copy"> Viaje Feliz &copy; 2017 | <a href="#">Privacy Policy</a> | Design by: Anna Carolina Novaes. </div>
	    </div>
	    <div class="clear"></div>
	  </div>
	</footer>
</body>
</html>