<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*,blood.dto.*,blood.bl.*" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/menu.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../Designs/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Swiper CSS -->
<link rel="stylesheet" href="../Designs/css/swiper.min.css">

<title>Donor Requests</title>
</head>
<h1 align="centre">Donor Request</h1>
<div style="background-image: url('images/logo2.jpg')">
	<%@ include file="../includes/menu_admin.jsp"%>
	<body>
		<table width="100%" height="688" border="0">
			<tbody>
				<tr>
					<td height="684" align="center" valign="top"><table
							width="100%" border="0">
							<tbody>
								<tr>
									<td height="530" align="center" valign="top"><table
											width="100%" border="0">
											<tbody>
												<tr>
													<td height="33" align="center" valign="middle"
														style="color: #F70509"></td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"></td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"
														style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; font-weight: bold; font-size: 250%;">Donor
														Request</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"
														style="color: #F70509">
														<%
															if (session.getAttribute("message") != null) {
																out.println((String) session.getAttribute("message"));
																session.removeAttribute("message");
															}
														%>
													</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle">
														<form id="form1" name="form1" method="post">
															<%
																ArrayList<AdminAcceptDonorDTO> accepts = AdminAcceptDonorBL.getAccepts();
																if (accepts != null && accepts.size() > 0) {
															%>
															<table width="95%" border="1" align="center"
																class="table table-striped"
																style="background-color: white">
																<tbody style="">
																	<tr style="background-color: red; color: white">
																		<td width="11%" height="33" align="center"
																			valign="middle"
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Donor
																			ID</td>
																		<td width="16%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Donor
																				Name </span></td>
																		<td width="12%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Blood
																				Group </span></td>
																		<td width="12%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Gender</span></td>
																		<td width="11%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Age</span></td>
																		<td width="20%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Contact
																				No:</span></td>
																		<td width="10%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Height</span></td>
																		<td width="10%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Weight</span></td>
																		<td width="10%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Date
																				of Donation</span></td>
																		<td width="10%" align="center" valign="middle"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Action</span></td>
																	</tr>
																	<%
																		for (AdminAcceptDonorDTO accept : accepts) {
																	%>
																	<tr>
																		<td align="center"><%=accept.getDonor_id()%>&nbsp;</td>
																		<td align="center"><%=accept.getDonor_name()%>&nbsp;</td>
																		<td align="center"><%=accept.getBlood_grp()%>&nbsp;</td>
																		<td align="center" valign="middle"
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">&nbsp;<%=accept.getGender()%></td>
																		<td><%=accept.getAge()%>&nbsp;</td>
																		<td align="center" valign="middle"><%=accept.getPhone()%>&nbsp;</td>
																		<td align="center" valign="middle"><%=accept.getHeight()%>&nbsp;</td>
																		<td align="center" valign="middle"><%=accept.getWeight()%>&nbsp;</td>
																		<td align="center" valign="middle"><%=accept.getDod()%>&nbsp;</td>
																		<td align="center" valign="middle"><a
																			href="admin_accept_process_donor.jsp?donor_id=<%=accept.getDonor_id()%>&blood_grp=<%=accept.getBlood_grp()%>">Accept</a>&nbsp;</td>

																	</tr>
																	<%
																		}
																		} else {
																	%>
																	<tr>
																		<td valign="middle" colspan="7" align="center"
																			style="color: red; font-weight: bold;">No donor
																			Request Found</td>
																	</tr>
																	<%
																		}
																	%>
																</tbody>
															</table>


														</form>
													</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle">&nbsp;</td>
												</tr>
											</tbody>
										</table></td>
								</tr>
							</tbody>
						</table></td>
				</tr>
			</tbody>
		</table>
</div>
<%@ include file="../Designs/footer.jsp"%>
</body>
</html>
