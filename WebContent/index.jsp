<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Viaje Feliz</title>
	<meta charset="utf-8">
	<link rel="icon" href="images/favicon.ico">
	<link rel="shortcut icon" href="images/favicon.ico">
	<link rel="stylesheet" href="css/style.css">
	
	<link rel="stylesheet" href="css/jquery-ui.css" />
	<link rel="stylesheet" href="js/jquery-ui.js" />
	
	
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
	<!--  +++++++++++ REFERENCIAS BASICAS DO BOOTSTRAP +++++++++++ -->
		<%@ include file="/includes/refs-bootstrap-inicio.jsp"%> 
		
	<!--  +++++++++++ INCLUDES HEADER +++++++++++ -->
		<%@ include file="/includes/refs-header.jsp"%> 
	
	<div class="main">
	  <div class="container_12">
	    <div class="grid_12">
	    
	    <!--  +++++++++++ REFERENCIAS BASICAS DO BOOTSTRAP +++++++++++ -->
		<%@ include file="/includes/searchbox.jsp"%> 
		<br />
		
	      <div class="slider-relative">  
	      <div style="min-height: 401px; min-width: 255px; left: 80px; width: 255px; position: absolute; top: 41px; height: 401px;" class="TPWdgt0-6nz_hvyyl1k0" id="TPWdgt0-6nz" data-reactid=".0.$SITE_ROOT.$desktop_siteRoot.$PAGES_CONTAINER.$centeredContent.$inlineContent.$SITE_PAGES.$mainPage_DESKTOP.$inlineContent.$TPWdgt0-6nz"><iframe scrolling="no" frameborder="0" allowtransparency="true" allowfullscreen="" name="TPWdgt0-6nz" style="display:block;width:100%;height:100%;overflow:hidden;position:absolute;" title="Wix Hotels" aria-label="Wix Hotels" id="TPWdgt0-6nziframe" class="TPWdgt0-6nz_hvyyl1k0iframe" data-reactid=".0.$SITE_ROOT.$desktop_siteRoot.$PAGES_CONTAINER.$centeredContent.$inlineContent.$SITE_PAGES.$mainPage_DESKTOP.$inlineContent.$TPWdgt0-6nz.$https=2//hotels=1wixapps=1net/search-widget=1html?cacheKiller=01510414307563&amp;compId=0TPWdgt0-6nz&amp;deviceType=0desktop&amp;height=0401&amp;instance=0gfi1KO_wG-TKuXMaTjsGPgf4nzUYQuBC6SXsup0DLZI=1eyJpbnN0YW5jZUlkIjoiYjY4ZTFmOWUtZTMxYS00NjgyLWFhZTUtNmFmM2UyOTgxOTk3IiwiYXBwRGVmSWQiOiIxMzVhYWQ4Ni05MTI1LTYwNzQtNzM0Ni0yOWRjNmEzYzliY2YiLCJzaWduRGF0ZSI6IjIwMTctMTEtMTFUMTU6MzE6NDAuNjExWiIsInVpZCI6bnVsbCwiaXBBbmRQb3J0IjoiMTgxLjYwLjE5Ni4xMTIvNTMxMzkiLCJ2ZW5kb3JQcm9kdWN0SWQiOm51bGwsImRlbW9Nb2RlIjpmYWxzZSwib3JpZ2luSW5zdGFuY2VJZCI6IjEzZTE3ZWIxLTBlN2YtZmU0MS0wNjhmLTYxYjlhYjI0MjgyMSIsImFpZCI6IjQ2YTlkZWI0LTljMTgtNDAyNi1iOGRhLTYwNDNiMTdjNTI3YSIsImJpVG9rZW4iOiJlMmY4OTQxZi1iMDJkLTBiODktMWJlZi1mYTE0Njg5MzVkNTUiLCJzaXRlT3duZXJJZCI6IjhhM2U2ZDE2LTczNWUtNDYxOC04YmU3LTk2NDY0M2QyM2ZjNyJ9&amp;locale=0pt&amp;pageId=0mainPage&amp;viewMode=0site&amp;vsi=0b6fb7f4e-66e5-4215-8806-8b9362c7e6f6&amp;width=0255" src="https://hotels.wixapps.net/search-widget.html?cacheKiller=1510414307563&amp;compId=TPWdgt0-6nz&amp;deviceType=desktop&amp;height=401&amp;instance=gfi1KO_wG-TKuXMaTjsGPgf4nzUYQuBC6SXsup0DLZI.eyJpbnN0YW5jZUlkIjoiYjY4ZTFmOWUtZTMxYS00NjgyLWFhZTUtNmFmM2UyOTgxOTk3IiwiYXBwRGVmSWQiOiIxMzVhYWQ4Ni05MTI1LTYwNzQtNzM0Ni0yOWRjNmEzYzliY2YiLCJzaWduRGF0ZSI6IjIwMTctMTEtMTFUMTU6MzE6NDAuNjExWiIsInVpZCI6bnVsbCwiaXBBbmRQb3J0IjoiMTgxLjYwLjE5Ni4xMTIvNTMxMzkiLCJ2ZW5kb3JQcm9kdWN0SWQiOm51bGwsImRlbW9Nb2RlIjpmYWxzZSwib3JpZ2luSW5zdGFuY2VJZCI6IjEzZTE3ZWIxLTBlN2YtZmU0MS0wNjhmLTYxYjlhYjI0MjgyMSIsImFpZCI6IjQ2YTlkZWI0LTljMTgtNDAyNi1iOGRhLTYwNDNiMTdjNTI3YSIsImJpVG9rZW4iOiJlMmY4OTQxZi1iMDJkLTBiODktMWJlZi1mYTE0Njg5MzVkNTUiLCJzaXRlT3duZXJJZCI6IjhhM2U2ZDE2LTczNWUtNDYxOC04YmU3LTk2NDY0M2QyM2ZjNyJ9&amp;locale=pt&amp;pageId=mainPage&amp;viewMode=site&amp;vsi=b6fb7f4e-66e5-4215-8806-8b9362c7e6f6&amp;width=255"></iframe><div id="TPWdgt0-6nzoverlay" class="TPWdgt0-6nz_hvyyl1k0overlay" data-reactid=".0.$SITE_ROOT.$desktop_siteRoot.$PAGES_CONTAINER.$centeredContent.$inlineContent.$SITE_PAGES.$mainPage_DESKTOP.$inlineContent.$TPWdgt0-6nz.$overlay"></div></div>
	        <div class="slider-block">
	          <div class="slider"> <a href="#" class="prev"></a><a href="#" class="next"></a>
	            <ul class="items">
	              <li><img src="images/slide01.jpg" alt="">
	                <div class="banner">
	                  <div>HAY INNUMERABLES LUGARES</div>
	                  <br>
	                  <span>para conocer en Colombia</span> </div>
	              </li>
	              <li><img src="images/slide02.jpg" alt=""></li>
	              <li><img src="images/slide03.jpg" alt=""></li>
	              <li><img src="images/slide04.jpg" alt=""></li>
	              <li><img src="images/slide05.jpg" alt=""></li>
	              <li><img src="images/slide06.jpg" alt=""></li>
	            </ul>
	          </div>
	        </div>
	      </div>
	    </div>
		
	      <div class="grid_12">
	        <h3>Destinos Principales</h3>
	      </div>
	      <div class="boxes">
	        <div class="grid_4">
	          <figure>
	            <div><img src="images/page1_img01.jpg" alt=""></div>
	            <figcaption>
	              <h3>Cartagena de Índias</h3>
					Las márgenes del Mar del Caribe, con edificios imponentes e islas maravillosas, 
					Cartagena sobresale entre las demás por su historia y sus colores.
					<a href="#" class="btn">Conozca más</a> </figcaption>
	          </figure>
	        </div>
	        <div class="grid_4">
	          <figure>
	            <div><img src="images/page1_img02.jpg" alt=""></div>
	            <figcaption>
	              <h3>Bogotá</h3>
	              Capital del país más colorido de las Américas, Bogotá mezcla tradición con modernidad. 
	              Lar de los cerros Guadalupe y Monserrate, estos poseen vistas maravillosas de toda la ciudad.
	               <a href="#" class="btn">Conozca más</a> </figcaption>
	          </figure>
	        </div>
	        <div class="grid_4">
	          <figure>
	            <div><img src="images/page1_img03.jpg" alt=""></div>
	            <figcaption>
	              <h3>Medellín</h3>
				 La segunda en tamaño y atractiva no sólo por su actividad comercial e industrial, sino también por su agitada vida cultural y nocturna.
	          	<a href="#" class="btn">Conozca más</a> </figcaption>
	          </figure>
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
	
		</div>
	</div>
	</body>
</html>