<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!doctype html>
<html>
	<head>
		<title>AZD Company Pvt Ltd. </title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Car Repair Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!meta charset utf="8">
		<link rel="stylesheet" href="../../css/module_flexslider.css" type="text/css" media="screen" />
		<!--bootstrap-->
			<link href="../../css/module_bootstrap.min.css" rel="stylesheet" type="text/css">
		<!--coustom css-->
			<link href="../../css/module_style.css" rel="stylesheet" type="text/css"/>
		<!--default-js-->
			<script src="../../js/module_jquery-2.1.4.min.js"></script>
		<!--bootstrap-js-->
			<script src="../../js/module_bootstrap.min.js"></script>
                        
                          <style>
                        table, th, td {
                         border: 2px solid black;
                         border-collapse: collapse;
                        }
                        th, td {
                        padding: 15px;
                        }
                        </style>
</head>
<body>
		
			<div class="header_nav" id="home">
				<nav class="navbar navbar-default chn-gd">
					
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					</button>
					
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li class="col-md-2">
						<a href="../../index.jsp" class="blue">
						<span class="glyphicon glyphicon-home " aria-hidden="true"></span>
						Home
						</a>
						</li>
						<!---->
						<li class="col-md-2">
						<a href="ManuDisplayEngine" class="pink">
						<span class="glyphicon glyphicon-cog " aria-hidden="true"></span>
						Manufacturing
						</a>
						</li>
						<!---->
						<li class="col-md-2">
						<a href="modules/manufacturing/man_services.jsp" class="sky">
						<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
						Design
						</a>
						</li>
						<!---->
						<li class="col-md-2">
						<a href="modules/manufacturing/man_news.jsp" class="gray">
						<span class="glyphicon glyphicon-thumbs-up " aria-hidden="true"></span>
						Availability
						</a>
						</li>
                                                <li class="col-md-2">
						<a href="modules/manufacturing/man_blog.jsp" class="sky">
						<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
						Price
						</a>
						</li>
						<!---->
						<li class="col-md-2">	
						<a href="modules/manufacturing/man_contact.jsp" class="green">
						<span class="glyphicon glyphicon-picture " aria-hidden="true"></span>
						Report
						</a>
						</li>
						
						<div class="clearfix">
						<!--script-->
						<script type="text/javascript">
						jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
						event.preventDefault();
						$('html,body').animate({scrollTop:$(this.hash).offset().top},900);
						});
						});
						</script>
						<!--script-->
					</ul>
					</div><!-- /.navbar-collapse -->
					<div class="clearfix"></div>
					<!-- /.container-fluid -->
				</nav>
			</div>
			<div class="container">
				<div class="logo">
						<h1><a href="man_index.jsp">Manufacture</a></h1>
				</div>
				<div class="ad-ph">
					<p>Call Us : <span>(880)</span>123 2500</p>
				</div>
					<div class="clearfix"></div>
			</div>
		<!-- banner -->
		<div class="banner">
			<div class="container">
				
				<div class="banner-info">
					<h2>MEETING ALL YOUR AUTO REPAIR NEEDS IN TIME AND ON YOUR BUDGET</h2>
					<P>Lorem ipsum dolor sit amet consecttur </p>
				</div>
			</div>	
		</div>	
		<!-- /banner -->
		<!-- our -->
		<div class="our">
			<div class="container">
				<div class="our-top">
					<li><img src="../../images/module_b1.jpg" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b2.png" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b3.png" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b4.png" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b5.png" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b6.jpg" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b7.jpg" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b8.jpg" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b9.png" class="img-responsive" alt=""></li>
					<li><img src="../../images/module_b10.png" class="img-responsive" alt=""></li>
						<div class="clearfix"></div>
				</div>
			</div>
		</div>
               <%Iterator itr1;%>
                                                    <%List data1=(List)request.getAttribute("EmpData1");
                                                    for(itr1=data1.iterator();itr1.hasNext();){
                                                            %>
                <div class="container">
				<div class="col-md-6 news-left">
					<div class="news-right">
               <table>
                                                           
                   <tr><td>Model ID</td><td>Engine Name</td><td>Fuel type</td><td>Cylinder</td><td>Cubic Capacity</td><td>Cost</td></tr>         
                                                            <tr>
                                                                 
                                                         
                                                             
                                                            <td><%= itr1.next()%></td>
                                                       <td><%= itr1.next()%></td>
                                                        <td><%= itr1.next()%></td>
                                                         <td><%= itr1.next()%></td>
                                                          <td><%= itr1.next()%></td>
                                                            <td><%= itr1.next()%></td>
                                                      
                                                        
                                                           
                                                           
                                                           
                                                          </tr></table>
                                        </div>
                                </div>
                </div> <%}%>
                                
		
		<!-- our -->
		<!-- high -->
		
			
             
		<!-- footer -->
		<div class="footer">
	<div class="container">
		<div class="col-md-3 footer-left">
			<h3>Telephone</h3>
			<p>(880)123 2500</p>
		</div>
		<div class="col-md-3 footer-left">
			<h3>E-Mail Us</h3>
			<p>Email : <a href="mailto:azd.engines@gmail.com">azd.engines@gmail.com</a></p>
		</div>
		<div class="col-md-3 footer-left">
			<h3>Follow Us</h3>
			<ul>
				<li><a href="https://www.facebook.com/AZD-Racing-Engines-1527390010886102/timeline/"><i class="facebok"> </i></a></li>
				<li><a href="https://twitter.com/AZDEngines"><i class="twitter"><i class="twiter"> </i></a></li>
				<li><a href="https://plus.google.com/u/0/106640718142324511965/about"><i class="goog"> </i></a></li>
					<div class="clearfix"></div>	
			</ul>
		</div>
		<div class="col-md-3 footer-left">
			<h3>Address</h3>
			<p>8058, St Perth Place,
Colombo 7, Sri Lanka.</p>
		</div>
			<div class="clearfix"></div>
			<div class="foot-bottom">
				<p>Copyright &copy; 2015 <span>AZD Company</span> All rights reserved | Design by PVZ</p>
			</div>
	</div>
</div>
		<!-- footer -->
	</body>
</html>