	  <link rel="stylesheet" href="css/stylebox.css">
	  <div class="section">
      	<div class="container">
	  				<div class="online_reservation">
					   <div class="b_room">
						  <div class="booking_room">
							  <div class="reservation">
								<!---strat-date-piker---->
									
									<script src="js/jquery-ui.js"></script>
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
													<span><img src="images/icon.png" alt="" class="icone"/></span>
													<input type="date" value="Select date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Select date';}">
												</form>
											</div>		
									</li>
									<li  class="span1_of_1 left">
										<h5>Fecha Salida</h5>
											<div class="book_date">
												<form>
													<span><img src="images/icon.png" alt="" class="icone"/></span>
													<input type="date" value="Select date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Select date';}">
												</form>
											</div>					
									</li>
									 <li class="span1_of_1">
										 <h5>Room type</h5>
										 <!----------start section_room----------->
										 <div class="section_room">
										      <select id="country" onchange="change_country(this.value)" class="frm-field required">
													<option value="null">Standard Single Room</option>
													<option value="null">Suite room</option>         
													<option value="AX">Single room</option>
													<option value="AX">Double room</option>
										      </select>
										 </div>	
									 </li>
									 <li class="span1_of_3">
											<div class="date_btn">
												<form>
													<input class="submeter" type="submit" value="View Prices" />
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
				