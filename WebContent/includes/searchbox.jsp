<link rel="stylesheet" href="<%=request.getContextPath()%>/css/stylebox.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonbusca.css">	 
	  <div class="section">
      	<div class="container">
	  				<div class="online_reservation">
					   <div class="b_room">
						  <div class="booking_room">
							  <div class="reservation">
								<!---strat-date-piker---->
									
									<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
									<script src="<%=request.getContextPath()%>/js/jquery.maskedinput-1.3.min.js"></script>
									<script>
									jQuery(function($){
									       $("#fechaInicio").mask("9999-99-99");
									       $("#fechaFin").mask("9999-99-99");
									});
									</script>
								<!---/End-date-piker---->
								<form method="post" action="<%=request.getContextPath()%>/cliente/CabanaOCasa2CRUD"
											 class="data001" style="padding: 6px;">
								  <ul>				
									<li  class="span1_of_1 left">
										<h5>Fecha Llegada</h5>
											
												<span><img src="<%=request.getContextPath()%>/images/icon.png" alt="" class="icone"/></span>
												<input type="text" required="required" placeholder="dd/mm/aaaa" name="fechaInicio" id="fechaInicio" value="${cabanaocasa.cabanaOCasa.fechaInicio}" style="padding: 6px;">
													
									</li>
									<li  class="span1_of_1 left">
										<h5>Fecha Salida</h5>
											
												<span><img src="<%=request.getContextPath()%>/images/icon.png" alt="" class="icone"/></span>
												<input type="text" required="required" placeholder="dd/mm/aaaa" name="fechaFin" id="fechaFin" value="${cabanaocasa.cabanaOCasa.fechaFin}" style="padding: 6px;">
																
									</li>
									 <li class="span1_of_1">
										 <h5>Cuidad de destino</h5>
										<div>
										      <input type="text" required="required" name="ciudadCabanaOCasa" id="ciudadCabanaOCasa" value="${cabanaocasa.ciudadCabanaOCasa}"value="" class="frm-field required texto" style="padding: 6px;">
										 </div>
									 </li>
									 <li class="span1_of_3">
											<div class="date_btn">
													<button type="submit" class="buttonbusca">Buscar casas/cabañas</button>
											</div>
									 </li>
								 </ul>
								 
								 </form>
							 </div>
						  </div>
							<div class="clearfix"></div>
					  		</div>
				  		</div>
				  	</div>
				  </div>
				