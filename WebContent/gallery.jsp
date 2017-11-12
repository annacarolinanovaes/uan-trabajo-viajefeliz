<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Viaje Feliz | Galería</title>
	<meta charset="utf-8">
	<link rel="icon" href="images/favicon.ico">
	<link rel="shortcut icon" href="images/favicon.ico">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/touchTouch.css">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-migrate-1.1.1.js"></script>
	<script src="js/superfish.js"></script>
	<script src="js/jquery.equalheights.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.ui.totop.js"></script>
	<script src="js/touchTouch.jquery.js"></script>
	<script>
	$(window).load(function () {
	    $().UItoTop({
	        easingType: 'easeOutQuart'
	    });
	});
	$(function () {
	    $('.gallery a.gal').touchTouch();
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
	      <div class="grid_12">
	        <h3>Nuestra Galería</h3>
	      </div>
	      <div class="clear"></div>
	      <div class="gallery">
	        <div class="grid_4"> <a href="images/page3_img1.jpg" class="gal img_inner"><img src="images/big01.jpg" alt=""></a> </div>
	        <div class="grid_4"> <a href="images/page3_img2.jpg" class="gal img_inner"><img src="images/big02.jpg" alt=""></a> </div>
	        <div class="grid_4"> <a href="images/page3_img3.jpg" class="gal img_inner"><img src="images/big03.jpg" alt=""></a> </div>
	        <div class="clear"></div>
	        <div class="grid_4"> <a href="images/page3_img4.jpg" class="gal img_inner"><img src="images/big04.jpg" alt=""></a> </div>
	        <div class="grid_4"> <a href="images/page3_img5.jpg" class="gal img_inner"><img src="images/big05.jpg" alt=""></a> </div>
	        <div class="grid_4"> <a href="images/page3_img6.jpg" class="gal img_inner"><img src="images/big06.jpg" alt=""></a> </div>
	        <div class="clear"></div>
	        <div class="grid_4"> <a href="images/page3_img7.jpg" class="gal img_inner"><img src="images/big07.jpg" alt=""></a> </div>
	        <div class="grid_4"> <a href="images/page3_img8.jpg" class="gal img_inner"><img src="images/big08.jpg" alt=""></a> </div>
	        <div class="grid_4"> <a href="images/page3_img9.jpg" class="gal img_inner"><img src="images/big09.jpg" alt=""></a> </div>
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
	      <div class="copy"> Journey &copy; 2045 | <a href="#">Privacy Policy</a> | Design by: <a href="http://www.templatemonster.com/">TemplateMonster.com</a> </div>
	    </div>
	    <div class="clear"></div>
	  </div>
	</footer>
	</body>
</html>