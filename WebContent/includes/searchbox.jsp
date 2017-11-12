	  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/stylebox.css">
	  <div class="section">
      	<div class="container">
	  				<div class="online_reservation">
					   <div class="b_room">
						  <div class="booking_room">
							  <div class="reservation">
								<!---strat-date-piker---->
									
									<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
									<script>
										$(function() {
										$( "#datepicker,#datepicker1" ).datepicker();
										});
									</script>
								<!---/End-date-piker---->
								  <ul>				
									<li  class="span1_of_1 left">
										<h5>Fecha Llegada</h5>
											<div class="book_date">
												<form>
													<span><img src="<%=request.getContextPath()%>/images/icon.png" alt="" class="icone"/></span>
													<input type="date" value="Select date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Select date';}">
												</form>
											</div>		
									</li>
									<li  class="span1_of_1 left">
										<h5>Fecha Salida</h5>
											<div class="book_date">
												<form>
													<span><img src="<%=request.getContextPath()%>/images/icon.png" alt="" class="icone"/></span>
													<input type="date" value="Select date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Select date';}">
												</form>
											</div>					
									</li>
									 <li class="span1_of_1">
										 <h5>Ubicación</h5>
										 <!----------start section_room----------->
										<div>
										      <input id="cuidad" type="text" name="Cuidad colombiana" value="" class="frm-field required texto">
										 </div>
									 </li>
									 <li class="span1_of_3">
											<div class="date_btn">
												<form>
													<input class="submeter" type="submit" value="Buscar casas/cabañas" />
												</form>
											</div>
									 </li>
									 <div class="clearfix"></div>
								 </ul>
							 </div>
						  </div>
							<div class="clearfix"></div>
					  		</div>
				  		</div>
				  	</div>
				  </div>
				